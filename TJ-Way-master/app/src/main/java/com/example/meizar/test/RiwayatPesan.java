package com.example.meizar.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RiwayatPesan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat_pesan);
    }

    public void mmUGM_click(View view) {
        Intent i = new Intent(RiwayatPesan.this, mmUGM.class);
        startActivity(i);
    }

    public void sardjito_click(View view) {
        Intent i = new Intent(RiwayatPesan.this, sardjito.class);
        startActivity(i);

    }
}
