package com.azza.seasonalproduce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FruitActivity extends AppCompatActivity {

    public static final String EXTRA_FRUIT = "fruitdNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

        //Get the fruit from the intent
        int fruitNo = (Integer)getIntent().getExtras().get(EXTRA_FRUIT);
        Fruit fruit = Fruit.fruits[fruitNo];

        //Populate the fruit image
        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(fruit.getImageResourceId());
        photo.setContentDescription(fruit.getName());

        //Populate the fruit name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(fruit.getName());

        //Populate seasons
        TextView seasons = (TextView) findViewById(R.id.seasons);
        seasons.setText(fruit.getSeason());

        //Populate the fruit description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(fruit.getDescription());


    }
}
