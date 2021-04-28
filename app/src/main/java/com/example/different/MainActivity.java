package com.example.different;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.example.different.adapter.TripsAdapter;
import com.example.different.models.Ads;
import com.example.different.models.Item;
import com.example.different.models.News;
import com.example.different.models.Trip;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        List<Item> items =  new ArrayList<>();


        //Tripps, News, Ads

        Trip trip1 = new Trip(R.drawable.summer, "Ка","Summer 2020 - 20 Days");
        items.add(new Item(0, trip1));


        Ads ads1 = new Ads(" Ad: Christmas Holiday", "70% OFF on ghristmas sale");
        items.add( new Item(1,ads1));

        News news1 = new News(
                "Bali,Indonesia","You'll fin beaches, volcanoes, Komoda dragons and jungles sheltering elephants, orangutand and tigers "
        );

        items.add(new Item(2, news1));


        //Trip

        Trip trip2 = new Trip(R.drawable.summer,"Bora bora","Monson 2020 - 10 days");
        items.add(new Item(0,trip2));

        News news2 = new News ("Kerry,Ireland",
                "All the way west in Ireland is one of the country's most scenic counries");
        items.add(new Item(2, news2));

        //Trip
        Trip trip3 = new Trip(R.drawable.summer,"Bali","Winter 2020");
        items.add(new Item( 0,trip3));


        Ads ads2= new Ads("Ad summer Holiday "," 50 OFF on your first trip");
        items.add(new Item(1,ads2));

        recyclerView.setAdapter(new TripsAdapter(items));

    }
}