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

public class FruitActivity extends AppCompatActivity {

    public static final String EXTRA_FRUITNO = "fruitNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

        //Get the fruit from the intent
        int fruitNo = (Integer)getIntent().getExtras().get(EXTRA_FRUITNO);

        //Create cursor
        try {
            SQLiteOpenHelper seasonalDatabaseHelper = new SeasonalDatabaseHelper(this);
            SQLiteDatabase db = seasonalDatabaseHelper.getReadableDatabase();
            Cursor cursor = db.query("FRUIT",
                                        new String[] {"NAME", "DESCRIPTION", "SEASON", "IMAGE_RESOURCE_ID"},
                                        "_id = ?",
                                        new String[] {Integer.toString(fruitNo)},
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

