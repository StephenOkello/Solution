package com.example.solution;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Facebook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_facebook );
        WebView facebook = findViewById ( R.id.act_facebook );
        facebook.loadUrl ( "https://www.facebook.com/bizadskenya/" );
    }
}
