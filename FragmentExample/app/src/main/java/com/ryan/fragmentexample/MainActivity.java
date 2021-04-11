package com.ryan.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnFragmentPertama;
    private Button btnFragmentKedua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Proses inisialisasi object button
        btnFragmentPertama = findViewById(R.id.btn_first_page);
        btnFragmentKedua = findViewById(R.id.btn_second_page);

        /* Pemberian fungsi onClick pada button
         Perbedaan dari BKPM, disini  menggunakan lambda yang berfungsi untuk mempersingkat kode*/
        btnFragmentPertama.setOnClickListener(v -> loadFragment(new FirstFragment()));
        btnFragmentKedua.setOnClickListener(v -> loadFragment(new SecondFragment()));

    }

    private void loadFragment(Fragment fragment) {
        // Pada baris 37 perbedaan dengan BKPM nya adalah kita menggunakan supportFragmentManager
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        // Pada tahap ini mengcek apakah fragment yang kita replace memiliki isi atau tidak
        if (fragment != null) {
            transaction.replace(R.id.frame_layout, fragment);
            transaction.commit();
        }
    }

}