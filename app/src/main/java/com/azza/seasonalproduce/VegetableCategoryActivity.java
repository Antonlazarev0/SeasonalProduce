package com.azza.seasonalproduce;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class VegetableCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listProduce = getListView();
        ArrayAdapter<Vegetable> listAdapter = new ArrayAdapter<Vegetable>(this, android.R.layout.simple_list_item_1, Vegetable.vegetables);
        listProduce.setAdapter(listAdapter);
    }

    @Override
    protected void onListItemClick(ListView listView, View itemView, int position, long id) {
        Intent intent = new Intent(VegetableCategoryActivity.this, VegetableActivity.class);
        intent.putExtra(VegetableActivity.EXTRA_VEGETABLE, (int) id);
        startActivity(intent);
    }
}
