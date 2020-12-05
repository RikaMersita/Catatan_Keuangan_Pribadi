package com.rikamersita.catatankeuanganpribadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuUtamaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        getSupportActionBar().hide();
    }

    public void pemasukan(View view) {
        Intent masuk = new Intent(this,SubMenuPemasukanActivity.class);
        startActivity(masuk);
    }

    public void pengeluaran(View view) {
        Intent keluar = new Intent(this,SubMenuPengeluaranActivity.class);
        startActivity(keluar);
    }

    public void saldo(View view) {
        Intent saldoo = new Intent(this,bottomNav.class);
        startActivity(saldoo);
    }
}