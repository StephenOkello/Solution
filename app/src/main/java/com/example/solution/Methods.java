package com.example.solution;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Methods extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_methods );
        WebView webView = findViewById (R.id.methods );
        webView.loadUrl ( "file:///android_asset/methods.html" );
    }
}
