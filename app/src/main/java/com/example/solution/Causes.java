package com.example.solution;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Causes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_causes );
        //Code to RECALL WebView Action
        WebView cause = findViewById ( R.id.causes );
        cause.loadUrl ( "file:///android_asset/disagree.html" );
    }
}
