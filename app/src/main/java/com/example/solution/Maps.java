package com.example.solution;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Maps extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_maps );
        getPermission (); //Method Called Hrere
        //Finding Maps Fragmements
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager ( )
                .findFragmentById ( R.id.map );
        //Weload yhna map Asynonym Load.
        mapFragment.getMapAsync ( this );
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        //load maps.
        mMap = googleMap;
        //Add GPS Marker to the Google Map.
        mMap.getUiSettings ( ).setMyLocationButtonEnabled ( true );
        //activate app to use Gps
        if (checkSelfPermission ( Manifest.permission.ACCESS_FINE_LOCATION ) != PackageManager.PERMISSION_GRANTED && checkSelfPermission ( Manifest.permission.ACCESS_COARSE_LOCATION ) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    Activity#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for Activity#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled ( true );
        //We need To Fix Permission to tha App

        // Create Location to show on Map - Nairobi.
        //Use the Location Marker to Read Offices & Centre where our App has it's Offices
        LatLng Nairobi = new LatLng ( -1.292066, 36.821945 );
        mMap.addMarker ( new MarkerOptions ( ).position ( Nairobi )
                .title ( "Let's Reconcile Centre - (Head Office of  the Reconciliation Centre.)" +
                        "Afya Centre, 10th Floor, Wing B, Suite Number 1" )
                .snippet ( "This is also the Call Centre where all SMS Sent Via Our App & Calls are received" +
                        "Active 24HRS in a day. " )
        );
        // Create Location to show on Map - Mombasa.
        LatLng Mombasa = new LatLng ( -4.043477, 39.668205 );
        mMap.addMarker ( new MarkerOptions ( ).position (Mombasa )
                .title ("Let's Reconcile Centre - (Mombasa Office)" )
                .snippet ( "Shimo-La-Tewa Building, Off Mama Ngina Drive, Kenyatta Avenue - Mombasa" )
        );
        // Create Location to show on Map - Kisumu
        LatLng Kisumu = new LatLng ( -0.091702, 34.767956);
        mMap.addMarker ( new MarkerOptions ( ).position (Kisumu)
                .title ( "Let's Reconcile Centre, Kisumu Office" )
                .snippet ( "Oginga Odinga Plaza, Off Tom Mboya Road, Opposite Moi National Stadium, Kisumu." )
        );
        mMap.moveCamera ( CameraUpdateFactory.newLatLngZoom ( Nairobi,15));
    }
    // GPS Permissions for Android Phones JUSTPASTE.IT/5FHZO  & justpaste.it/5fhzo
    //permissions
    private void getPermission() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)
                + ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.ACCESS_COARSE_LOCATION,
                            Manifest.permission.ACCESS_FINE_LOCATION},
                    1);

        }
        else
        {
            Toast.makeText(this, "Permission", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    public void onRequestPermissionsResult(final int requestCode, final String[] permissions, final int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 1) {
            if ((grantResults.length > 0) && (grantResults[0]+grantResults[1])
                    == PackageManager.PERMISSION_GRANTED) {
// Permission granted.


            } else {
// User refused to grant permission.
                Toast.makeText(this, "All Permission is required to use the Screen Recorder", Toast.LENGTH_LONG).show();
                getPermission();

            }
        }
    }
}
