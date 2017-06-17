package com.bachi.android.usaestatesandcapitals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void menu(View v) {
        Intent menu = new Intent(this, MainActivity.class);
        startActivity(menu);
    }
}
