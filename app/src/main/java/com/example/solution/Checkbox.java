package com.example.solution;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class Checkbox extends AppCompatActivity {
    //De clearing Radio Button Variables.
    RadioButton exe, vod, good, mode, por;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Finding Layout From xml file.
        setContentView(R.layout.activity_checkbox);
        exe = findViewById(R.id.excellent);
        vod=findViewById(R.id.verygood);
        good = findViewById(R.id.good);
        mode = findViewById(R.id.moderate);
        por = findViewById(R.id.poor);
        //Setting Result too be called once the Button Has been Clicked
        Button btn = findViewById(R.id.submit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = "";
                result+=(exe.isChecked())?"Thank You for the Excellent Rating  of Our Services":
                        (vod.isChecked())?"Thanks You for the Very Good Rating  of Our Services":
                                (good.isChecked())?"Thanks You for Good Rating of Our Services":
                                        (mode.isChecked())?"Thanks for Moderate Rating  of Our Services. Please inform us on where to Improve on":
                        (por.isChecked())?"Thanks You for Poor Rating of our Services, We would like to hear from you what led to Poor Rating.":"";
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
            }
        });
    }
    //Performing Test for Selected Button
    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();
        String str = "";
        //Check Which Radio Button was Checked using Switch.
        switch (view.getId()){
            case R.id.excellent:
                if (checked)
                    str ="Excellent Selected";
                break;
            case R.id.verygood:
                if (checked)
                    str = "Very Good Selected";
                break;
            case R.id.good:
                if (checked)
                    str = "Good Selected";
                break;
            case R.id.moderate:
                if (checked)
                    str = "Moderate Selected";
                break;
            case R.id.poor:
                if (checked)
                    str = "Poor Selected";
                break;
        }
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
}
