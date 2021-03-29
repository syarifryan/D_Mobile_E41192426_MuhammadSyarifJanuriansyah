package com.ryan.belajarlayout;

import android.app.Activity;

public class MaterialLayout extends Activity {

    // findview toolbar
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

    // set toolbar ke dalam support action bar
    setSupportActionBar(toolbar);

    // enable home button untuk navigasi
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    // mengeset icon untuk home button Toolbar
    getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu);

    // mengeset title/nama aplikasi
    getSupportActionBar().setTitle("TWOH's Engineering");

    // mengeset subtitle
    getSupportActionBar().setSubtitle("Tutorial Material Design");

    // set logo toolbar
    getSupportActionBar().setDisplayUseLogoEnabled(true);
    getSupportActionBar().setLogo(R.mipmap.ic_launcher);

}
