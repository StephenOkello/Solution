package com.example.solution;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;

public class Call extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        //Set Click Listener to Dial Button
        findViewById(R.id.btnDial).setOnClickListener(new View.OnClickListener() {
            //Perform Dial Open Action
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:"+798750798));
                startActivity(i);
                Intent I = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+798750798));
                startActivity(I);

                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+ 798750798)));

            }
        });
    }
}
