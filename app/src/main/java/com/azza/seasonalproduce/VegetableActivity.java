package com.azza.seasonalproduce;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class VegetableActivity extends AppCompatActivity {

    public static final String EXTRA_VEGENO = "vegeNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetable);

        //Get vegetable from intent
        int vegeNo = (Integer)getIntent().getExtras().get(EXTRA_VEGENO);

        //Create cursor
        try {
            SQLiteOpenHelper seasonalDatabaseHelper = new SeasonalDatabaseHelper(this);
            SQLiteDatabase db = seasonalDatabaseHelper.getReadableDatabase();
            Cursor cursor = db.query("VEGETABLE",
                                        new String[] {"NAME", "DESCRIPTION", "SEASON", "IMAGE_RESOURCE_ID"},
                                        "_id = ?",
                                        new String[] {Integer.toString(vegeNo)},
                                        null, null, null);
            if(cursor.moveToFirst()) {
                String nameText = cursor.getString(0);
                String descriptionText = cursor.getString(1);
                String seasonText = cursor.getString(2);
                int photoId = cursor.getInt(3);

                TextView name = (TextView) findViewById(R.id.name);
                name.setText(nameText);

                TextView description = (TextView) findViewById(R.id.description);
                description.setText(descriptionText);

                TextView season = (TextView) findViewById(R.id.season);
                season.setText(seasonText);

                ImageView photo = (ImageView) findViewById(R.id.photo);
                photo.setImageResource(photoId);
                photo.setContentDescription(nameText);
            }
            cursor.close();
            db.close();
        } catch(SQLiteException e) {
            Toast toast = Toast.makeText(this, "Database unavailable", Toast.LENGTH_SHORT);
            toast.show();
        }

    }
}


/* //Get the vegetable from the intent
        int vegeNo = (Integer)getIntent().getExtras().get(EXTRA_VEGENO);
        Vegetable vegetable = Vegetable.vegetables[vegeNo];

        //Populate the vegetable image
        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(vegetable.getImageResourceId());
        photo.setContentDescription(vegetable.getName());

        //Populate the vegetable name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(vegetable.getName());

        //Populate seasons
        TextView seasons = (TextView) findViewById(R.id.seasons);
        seasons.setText(vegetable.getSeason());

        //Populate the vegetable description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(vegetable.getDescription());

*/