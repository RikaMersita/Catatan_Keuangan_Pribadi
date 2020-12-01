package com.rikamersita.catatankeuanganpribadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SubMenuPemasukanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_menu_pemasukan);

        getSupportActionBar().hide();
    }

    public void menu(View view) {
        Intent menuu = new Intent(this,MenuUtamaActivity.class);
        startActivity(menuu);
    }
}