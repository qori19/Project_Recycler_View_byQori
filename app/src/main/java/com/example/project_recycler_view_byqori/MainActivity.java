package com.example.project_recycler_view_byqori;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView rcvMarvel;
private ArrayList<MarvelModel> listMarvel = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvMarvel = findViewById(R.id.rcv);
        rcvMarvel.setHasFixedSize(true);
        listMarvel.addAll(MarvelData.getListData());

        showRecyclerList();
    }

    private void showRecyclerList(){
        rcvMarvel.setLayoutManager(new LinearLayoutManager(this));
        MarvelAdapter marvelAdapter = new MarvelAdapter(this);
        marvelAdapter.setMarvelModels(listMarvel);
        rcvMarvel.setAdapter(marvelAdapter);
    }
}
