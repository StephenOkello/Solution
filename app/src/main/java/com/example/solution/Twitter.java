package com.example.solution;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Twitter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_twitter );
        WebView twitter = findViewById ( R.id.act_twitter );
        twitter.loadUrl ( "https://twitter.com/BizadsDirectory" );
    }
}
