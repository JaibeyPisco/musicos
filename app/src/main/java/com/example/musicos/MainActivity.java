package com.example.musicos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Singer> singersList;
    private RecyclerView recyclerView;
    private RecyclerAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        singersList = new ArrayList<>();

        setSingerInfo();
        setAdapter();

    }

    private void setAdapter() {
        setOnclickListener();
        RecyclerAdapter adapter =  new RecyclerAdapter(singersList, listener);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void setOnclickListener() {
        listener = new RecyclerAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(), ProfileSingerActiviy.class
                );
                intent.putExtra("name", singersList.get(position).getSingerName());
                intent.putExtra("singerAge", singersList.get(position).getSingerAge());
                intent.putExtra("country", singersList.get(position).getCountry());
                intent.putExtra("famousSong", singersList.get(position).getFamousSong());
                startActivity(intent);
            }
        };
    }

    private void setSingerInfo() {
        singersList.add(new Singer("Jaibey", 19, "Peru", "Quien sabe"));
        singersList.add(new Singer("Adele", 33, "England", "Rolling In the Deep"));
        singersList.add(new Singer("Sebastian yatra", 26 ,"Colombian", "Devuelveme"));
        singersList.add(new Singer("Camilo sesto", 75, "Spain", "Getsemaní"));


    }


}