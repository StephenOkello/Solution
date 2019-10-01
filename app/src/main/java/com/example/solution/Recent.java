package com.example.solution;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Recent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_recent );
        //Finding The Buttons For The New Recent.
        Button recent  = findViewById(R.id.recent);
        //Adding Buttons Listeners & Set Onclick
        recent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Now Linking to RSS Feeds to fetch News
               Intent news = new Intent(getApplicationContext(), RSSFeedActivity.class);
                news.putExtra("rssLink", "https://www.standardmedia.co.ke/rss/headlines.php");
               startActivity(news);

            }
        });
    }
}
