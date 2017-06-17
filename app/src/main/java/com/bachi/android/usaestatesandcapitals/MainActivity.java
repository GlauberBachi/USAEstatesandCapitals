package com.bachi.android.usaestatesandcapitals;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Slide;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    //Button btnStart = (Button) findViewById(R.id.btnStart);


    public void start(View v) {
        getWindow().setExitTransition(new Explode());
        Intent jogo = new Intent(this, Jogo.class);
        startActivity(jogo, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());

    }

    public void about(View v) {
        getWindow().setExitTransition(new Explode());
        Intent about = new Intent(this, About.class);
        startActivity(about, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());

    }


}



