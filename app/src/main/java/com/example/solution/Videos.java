package com.example.solution;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Videos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_videos );
        VideoView videoView = findViewById ( R.id.snack );
        //Introducing Media Controllers For Controlling the Media File
        MediaController mediaController = new MediaController ( this );
        mediaController.setAnchorView ( videoView );
        //Tracking Media File From It's Location In App Raw Folder
        Uri uri = Uri.parse ( "android.resource://"+getPackageName () +"/"+R.raw.importance );

        // Starting Videos Using Controllers
        videoView.setMediaController ( mediaController );
        videoView.setVideoURI ( uri );
        videoView.requestFocus ();
        videoView.start ();
        //End of the Video Player Code - Why is  to build peace
    }
}
