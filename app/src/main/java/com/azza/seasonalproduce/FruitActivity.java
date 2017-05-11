package com.azza.seasonalproduce;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
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
            SQLiteDatabase db = seasonalDatabaseHelper.getWritableDatabase();
            Cursor cursor = db.query("FRUIT",
                                        new String[] {"NAME", "DESCRIPTION", "SEASON", "IMAGE_RESOURCE_ID", "FAVORITE"},
                                        "_id = ?",
                                        new String[] {Integer.toString(fruitNo)},
                                        null, null, null);
            if(cursor.moveToFirst()) {
                String nameText = cursor.getString(0);
                String descriptionText = cursor.getString(1);
                String seasonText = cursor.getString(2);
                int photoId = cursor.getInt(3);
                boolean isFavorite = (cursor.getInt(4) == 1);

                TextView name = (TextView) findViewById(R.id.name);
                name.setText(nameText);

                TextView description = (TextView) findViewById(R.id.description);
                description.setText(descriptionText);

                TextView season = (TextView) findViewById(R.id.season);
                season.setText(seasonText);

                ImageView photo = (ImageView) findViewById(R.id.photo);
                photo.setImageResource(photoId);
                photo.setContentDescription(nameText);

                CheckBox favorite = (CheckBox) findViewById(R.id.favorite);
                favorite.setChecked(isFavorite);
            }
            cursor.close();
            db.close();
        } catch(SQLiteException e) {
            Toast toast = Toast.makeText(this, "Database unavailable", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void onFavoriteClicked(View view) {
        int fruitNo = (int) getIntent().getExtras().get("fruitNo");
        CheckBox favorite = (CheckBox) findViewById(R.id.favorite);
        ContentValues fruitValues = new ContentValues();
        fruitValues.put("FAVORITE", favorite.isChecked());
        SQLiteOpenHelper seasonalDatabaseHelper = new SeasonalDatabaseHelper(FruitActivity.this);

        try {
            SQLiteDatabase db = seasonalDatabaseHelper.getWritableDatabase();
            db.update("FRUIT", fruitValues, "_id = ?", new String[]{Integer.toString(fruitNo)});
            db.close();
        } catch (SQLiteException e) {
            Toast toast = Toast.makeText(this, " Database unavailable", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}

