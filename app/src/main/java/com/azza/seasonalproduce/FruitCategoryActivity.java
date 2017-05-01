package com.azza.seasonalproduce;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FruitCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listProduce = getListView();
        ArrayAdapter<Fruit> listAdapter = new ArrayAdapter<Fruit>(this, android.R.layout.simple_list_item_1, Fruit.fruits);
        listProduce.setAdapter(listAdapter);
    }

    @Override
    protected void onListItemClick(ListView listView, View itemView, int position, long id) {
        Intent intent = new Intent(FruitCategoryActivity.this, FruitActivity.class);
        intent.putExtra(FruitActivity.EXTRA_FRUIT, (int) id);
        startActivity(intent);
    }
}
