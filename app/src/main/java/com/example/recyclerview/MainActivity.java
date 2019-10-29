package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private com.example.recyclerview.KeluargaAdapter adapter;
    private ArrayList<Keluarga> keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tambahData();
        recyclerView = findViewById(R.id.recyclerview);
        adapter = new KeluargaAdapter(keluargaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void tambahData() {
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga("Agung Priyanto", "Bapak", getDrawable(R.drawable.bapak)));
        keluargaArrayList.add(new Keluarga("Sunarni", "Ibu",getDrawable(R.drawable.ibu)));
        keluargaArrayList.add(new Keluarga("Muhammad Dwi Arniyanto", "Saya",getDrawable(R.drawable.saya)));
        keluargaArrayList.add(new Keluarga("Ernia Cahyanti", "Adik",getDrawable(R.drawable.adik)));
    }
}