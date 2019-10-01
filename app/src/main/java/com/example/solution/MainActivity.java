package com.example.solution;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    //Opening Activities Using Buttons
    private Button button;
    private Button button1;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        // Continuation of 1st Button

        button1 = findViewById ( R.id.button2 );
        button1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                About();
            }
        } );
                //Button 2 for Google Maps
                button = findViewById ( R.id.button );
                button.setOnClickListener ( new View.OnClickListener ( ) {
                    @Override
                    public void onClick(View view) {
                        GoogleMaps();
                    }
                } );
                // Button 3 for Possible Solutions
                button3 = findViewById (R.id.button3);
                button3.setOnClickListener ( new View.OnClickListener ( ) {
                    @Override
                    public void onClick(View view) {
                        Possible();
                    }
                } );
                //Button 4 for Methods
                button4 = findViewById(R.id.button4);
                button4.setOnClickListener ( new View.OnClickListener ( ) {
                    @Override
                    public void onClick(View view) {
                        Methods();
                    }
                } );
                //Button For Causes
                button5 = findViewById ( R.id.button5 );
                button5.setOnClickListener ( new View.OnClickListener ( ) {
                    @Override
                    public void onClick(View view) {
                        Causes();
                    }
                } );
                //Button For Recent
                button6 = findViewById ( R.id.button6 );
                button6.setOnClickListener ( new View.OnClickListener ( ) {
                    @Override
                    public void onClick(View view) {
                        Recent();

                    }
                } );

        // Buttons New
        Toolbar toolbar = findViewById ( R.id.toolbar );
        setSupportActionBar ( toolbar );

        DrawerLayout drawer = findViewById ( R.id.drawer_layout );
        NavigationView navigationView = findViewById ( R.id.nav_view );
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle (
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close );
        drawer.addDrawerListener ( toggle );
        toggle.syncState ( );
        navigationView.setNavigationItemSelectedListener (this );
    }
    //Setting Formula for the Btn Decleared Above.
    public void About() {
        Intent intent = new Intent ( this,About.class );
        startActivity ( intent );
    }
    // Google Maps Formula
    public void GoogleMaps(){
        Intent map = new Intent (this, Maps.class );
        startActivity (map);
    }
    //Writing Code to Execute Possible(); FORMULA
    public void Possible(){
        Intent poss = new Intent ( this, Possible.class );
        startActivity(poss);
    }
    // Doing Method for Method(); Created Above
    public void Methods(){
        Intent methods = new Intent ( this, Methods.class );
        startActivity ( methods );
    }
    //Doing the Method for Causes.
    public void Causes(){
        Intent cau = new Intent ( this, Causes.class );
        startActivity ( cau );
    }
    //writing the formula for recent
    public void Recent(){
        Intent recent = new Intent ( this,Recent.class);
        startActivity (recent);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById ( R.id.drawer_layout );
        if (drawer.isDrawerOpen ( GravityCompat.START )) {
            drawer.closeDrawer ( GravityCompat.START );
        } else {
            super.onBackPressed ( );
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater ( ).inflate ( R.menu.main, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId ( );
        //Working for Buttons Linkings in Content Main
        Button button=(Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent (getApplicationContext(),About.class));
           /* if you want to finish the first activity then just call
            finish(); */
            }
        });
        //noinspection SimplifiableIfStatement
        //Facebook Intent
        if (id == R.id.action_facebook) {
            Intent face = new Intent ( this, Facebook.class );
            startActivity (face);
        }

        //Twitter Intent
        if (id == R.id.action_twitter) {
            Intent twitter = new Intent ( this, Twitter.class );
            startActivity (twitter);
        }

        //Ingram Intent
        if (id == R.id.action_instagram) {
            Intent inst = new Intent ( this, Instagram.class );
            startActivity (inst);
        }
        //Ingram Intent
        if (id == R.id.action_email) {
            Intent email = new Intent(this,Email.class);
            startActivity(email);
        }
        //Calling Intent
        if (id == R.id.action_calling) {
            Intent callings = new Intent(this,Call.class);
            startActivity(callings);
        }
        return super.onOptionsItemSelected ( item );
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId ( );

        if (id == R.id.nav_website) {
            // Handle the camera action
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData( Uri.parse("https://modcom.co.ke"));
            startActivity(intent);

        } else if (id == R.id.nav_video) {
            //HANDLE FOR VIDEO PLAYER
            Intent vid = new Intent(this, Videos.class);
            startActivity(vid);

        } else if (id == R.id.nav_image) {
            //Doing the Intent for the Images Class
            Intent Img = new Intent(this, Images.class);
            startActivity(Img);

        } else if (id == R.id.nav_rate) {
            //Writing the Branches Intent//
            Intent rate = new Intent(this, Checkbox.class);
            startActivity(rate);

        } else if (id == R.id.nav_share) {
            //Code for Share Options
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT, "");
            sendIntent.setType("Plain / Text");
            startActivity(sendIntent);

        } else if (id == R.id.nav_send) {
            //Code for Send Options
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT, "");
            sendIntent.setType("Plain / Text");
            startActivity(sendIntent);
        }

        DrawerLayout drawer = findViewById ( R.id.drawer_layout );
        drawer.closeDrawer ( GravityCompat.START );
        return true;
    }
}
