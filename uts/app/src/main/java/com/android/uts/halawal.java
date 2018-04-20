package com.android.uts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class halawal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halawal);
    }

    public void back_Click(View view) {
        Intent i = new Intent(halawal.this,menu.class);
        startActivity(i);

    }
}
