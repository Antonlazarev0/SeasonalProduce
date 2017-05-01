package com.azza.seasonalproduce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class VegetableActivity extends AppCompatActivity {

    public static final String EXTRA_VEGETABLE = "vegeNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetable);

        //Get the vegetable from the intent
        int vegeNo = (Integer)getIntent().getExtras().get(EXTRA_VEGETABLE);
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


    }
}
