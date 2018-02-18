package com.sayyidpratama.sayyidpratamashiddiq_1202150066_modul2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.LinkedList;

public class Menu extends Activity {

    private final LinkedList<String> cake = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        mAdapter = new MenuAdapter(this, cake, priceses, photos);

        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            cake.add("Starwars Cake");
            cake.add("Starwars Cake");
            cake.add("Starwars Cake");
            cake.add("Starwars Cake");
            cake.add("Starwars Cake");

            priceses.add(12000);
            priceses.add(12000);
            priceses.add(12000);
            priceses.add(12000);
            priceses.add(12000);

            photos.add(R.drawable.starwarscake);
            photos.add(R.drawable.starwarscake);
            photos.add(R.drawable.starwarscake);
            photos.add(R.drawable.starwarscake);
            photos.add(R.drawable.starwarscake);
        }
    }
}