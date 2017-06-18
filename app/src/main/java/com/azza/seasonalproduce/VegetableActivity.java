package com.azza.seasonalproduce;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
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
            SQLiteDatabase db = seasonalDatabaseHelper.getWritableDatabase();
            Cursor cursor = db.query("VEGETABLE",
                                        new String[] {"NAME", "DESCRIPTION", "SEASON", "IMAGE_RESOURCE_ID", "FAVORITE", "RECIPE"},
                                        "_id = ?",
                                        new String[] {Integer.toString(vegeNo)},
                                        null, null, null);
            if(cursor.moveToFirst()) {
                String nameText = cursor.getString(0);
                String descriptionText = cursor.getString(1);
                String seasonText = cursor.getString(2);
                int photoId = cursor.getInt(3);
                boolean isFavorite = (cursor.getInt(4) == 1);
                String recipeText = cursor.getString(5);

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

                Button recipe = (Button) findViewById(R.id.recipe);
                recipe.setText(recipeText);
            }
            cursor.close();
            db.close();
        } catch(SQLiteException e) {
            Toast toast = Toast.makeText(this, "Database unavailable", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void onFavoriteClicked(View view) {
        int vegeNo = (int) getIntent().getExtras().get(EXTRA_VEGENO);
        new UpdateVegetableTask().execute(vegeNo);
    }

    private class UpdateVegetableTask extends AsyncTask<Integer, Void, Boolean> {
        ContentValues vegeValues;

        protected void onPreExecute() {
            CheckBox favorite = (CheckBox) findViewById(R.id.favorite);
            vegeValues = new ContentValues();
            vegeValues.put("FAVORITE", favorite.isChecked());
        }

        protected Boolean doInBackground(Integer... vege) {
            int vegeNo = vege[0];
            SQLiteOpenHelper seasonalDatabaseHelper = new SeasonalDatabaseHelper(VegetableActivity.this);

            try {
                SQLiteDatabase db = seasonalDatabaseHelper.getWritableDatabase();
                db.update("VEGETABLE", vegeValues, "_id = ?", new String[]{Integer.toString(vegeNo)});
                db.close();
                return true;
            } catch (SQLiteException e) {
                return false;
            }
        }

        protected void onPostExecute(Boolean success) {
            if(!success) {
                Toast toast = Toast.makeText(VegetableActivity.this, " Database unavailable", Toast.LENGTH_SHORT);
                toast.show();
            }
        }
    }
}
