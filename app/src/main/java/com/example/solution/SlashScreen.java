package com.example.solution;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SlashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_slash_screen );
        Handler handler = new Handler ( );
        handler.postDelayed ( new Runnable ( ) {
            @Override
            public void run() {
                Intent splash = new Intent (SlashScreen.this, MainActivity.class );
                startActivity ( splash );
                finish ();
            }
        } ,2500 );
    }
}