package com.example.kuis1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview_1);

        adapter = new KeluargaAdapter(keluargaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }

    private void addData() {
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga("Achmad Sahal A.C.", "Kepala Keluarga", R.drawable.ebez));
        keluargaArrayList.add(new Keluarga("Sri Ajani", "Ibu",  R.drawable.emez));
        keluargaArrayList.add(new Keluarga("Arief Budiman", "Anak ke-1",  R.drawable.budi));
        keluargaArrayList.add(new Keluarga("Hadi Purnomo", "Anak ke-2",  R.drawable.ipung));
        keluargaArrayList.add(new Keluarga("Yanaz Bahtyar", "Anak ke-3",  R.drawable.yanaz));
        keluargaArrayList.add(new Keluarga("Muh. Ali Hasymi", "Anak ke-4",  R.drawable.ayaz));
    }
}