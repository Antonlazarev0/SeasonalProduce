package com.azza.seasonalproduce;

import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class FruitCategoryActivity extends ListActivity {

    private SQLiteDatabase db;
    private Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listProduce = getListView();

        try{
            SQLiteOpenHelper seasonalDatabaseHelper = new SeasonalDatabaseHelper(this);
            db = seasonalDatabaseHelper.getReadableDatabase();

            cursor = db.query("FRUIT",
                                new String[]{"_id", "NAME"},
                                null, null, null, null, null);

            CursorAdapter listAdapter = new SimpleCursorAdapter(this,
                                            android.R.layout.simple_list_item_1,
                                            cursor,
                                            new String[]{"NAME"},
                                            new int[]{android.R.id.text1},
                                            0);
            listProduce.setAdapter(listAdapter);
        }catch (SQLiteException e) {
            Toast toast = Toast.makeText(this, "Database Unavailable", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        cursor.close();
        db.close();
    }

    @Override
    protected void onListItemClick(ListView listView, View itemView, int position, long id) {
        Intent intent = new Intent(FruitCategoryActivity.this, FruitActivity.class);
        intent.putExtra(FruitActivity.EXTRA_FRUITNO, (int) id);
        startActivity(intent);
    }
}

     /*  ArrayAdapter<Fruit> listAdapter = new ArrayAdapter<Fruit>(this, android.R.layout.simple_list_item_1, Fruit.fruits);
        listProduce.setAdapter(listAdapter);*/
