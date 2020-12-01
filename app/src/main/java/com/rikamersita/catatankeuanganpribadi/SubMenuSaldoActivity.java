package com.rikamersita.catatankeuanganpribadi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SubMenuSaldoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_menu_saldo);

        getSupportActionBar().hide();
    }
}