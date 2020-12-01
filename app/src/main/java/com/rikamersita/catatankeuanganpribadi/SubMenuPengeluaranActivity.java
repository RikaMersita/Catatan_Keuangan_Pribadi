package com.rikamersita.catatankeuanganpribadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SubMenuPengeluaranActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_menu_pengeluaran);

        getSupportActionBar().hide();
    }

    public void kemenu(View view) {
        Intent menu = new Intent(this,MenuUtamaActivity.class);
        startActivity(menu);
    }
}