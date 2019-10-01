package com.example.solution;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Possible extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_possible );
        WebView webview = findViewById ( R.id.possible );
        webview.loadUrl ( "file:///android_asset/possible.html" );
    }
}
