package com.example.solution;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_about );
        //Code to RECALL WebView Action
        WebView cause = findViewById ( R.id.about );
        cause.loadUrl ( "file:///android_asset/about.html" );
    }
}
