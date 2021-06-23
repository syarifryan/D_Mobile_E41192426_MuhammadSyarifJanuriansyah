package com.ryan.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];
    int images[] {R.drawable.kebudayaan_jawa, R.drawable.Kebudayaan_bali, R.drawable.kebudayaan_sumatera_barat, R.drawable.Kebudayaan_Aceh}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.Belajar_Bahasa_Daerah);
        s2 = getResources().getStringArray(R.array.ini_deskripsi);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);

    }
}