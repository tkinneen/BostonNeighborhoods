package com.example.bostonneighborhoods;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.PolyUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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
        mMap = googleMap;

        // Original code example
        /*LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));*/

        // Original example modified for the "official" google coordinates for Boston
        //LatLng boston = new LatLng(42.348657932937925, -71.06789094313196);
        //mMap.addMarker(new MarkerOptions().position(boston).title("Mike and Patty's Corner"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(boston));

        //LatLng northEndMarker = new LatLng(42.365599715599444, -71.05465352034417); // CORRECT LOCATION
        LatLng northEndMarker = new LatLng(42.35931491544363, -71.05954027428724); // INCORRECT LOCATION
        
        mMap.addMarker(new MarkerOptions().position(northEndMarker).title("North End"));

        //pointToPosition(boston);
        pointToPosition(northEndMarker);

        // Coordinates for North End
        LatLng northEndpoint1 = new LatLng(42.36019349786317, -71.0476549063004);
        LatLng northEndpoint2 = new LatLng(42.35966094659667, -71.05172777518418);
        LatLng northEndpoint3 = new LatLng(42.361023258272404, -71.05283779150942);
        LatLng northEndpoint4 = new LatLng(42.36323400576245, -71.05694612777248);
        LatLng northEndpoint5 = new LatLng(42.36702688165508, -71.06062606905826);
        LatLng northEndpoint6 = new LatLng(42.36856468693964, -71.05760053724418);
        LatLng northEndpoint7 = new LatLng(42.369034037066015, -71.05517488258268);
        LatLng northEndpoint8 = new LatLng(42.36981084640369, -71.05204206249876);
        LatLng northEndpoint9 = new LatLng(42.36865355551813, -71.05007868552836);
        LatLng northEndpoint10 = new LatLng(42.3660218283815, -71.04895215775845);
        LatLng northEndpoint11 = new LatLng(42.36172536578365, -71.04795697072909);

        // Coordinates for West End
        LatLng westEndPoint1 = new LatLng(42.362773598754266, -71.05762902246907);
        LatLng westEndPoint2 = new LatLng(42.36387969077742, -71.05858159555521);

        LatLng westEndPoint3 = new LatLng(42.3681656229122, -71.06294990331064);
        //LatLng westEndPoint4 = new LatLng(42.36034861046176, -71.06041055141101);
        //LatLng westEndPoint5 = new LatLng(42.35931799180085, -71.05988483843755);
        //LatLng westEndPoint6 = new LatLng(42.36856468693964, -71.05760053724418);
        //LatLng westEndPoint7 = new LatLng(42.369034037066015, -71.05517488258268);
        //LatLng westEndPoint8 = new LatLng(42.36981084640369, -71.05204206249876);
        //LatLng westEndPoint9 = new LatLng(42.36865355551813, -71.05007868552836);
        //LatLng westEndPoint10 = new LatLng(42.3660218283815, -71.04895215775845);
        //LatLng westEndPoint11 = new LatLng(42.36172536578365, -71.04795697072909);

        // Coordinates for Beacon Hill
        LatLng beaconHillPoint1 = new LatLng(42.360990707914134, -71.07318035010636);
        LatLng beaconHillPoint2 = new LatLng(42.361146145821884, -71.0627938183687);
        LatLng beaconHillPoint3 = new LatLng(42.36086765263112, -71.06140894747035);
        LatLng beaconHillPoint4 = new LatLng(42.36034861046176, -71.06041055141101);
        LatLng beaconHillPoint5 = new LatLng(42.35931799180085, -71.05988483843755);
        LatLng beaconHillPoint6 = new LatLng(42.36856468693964, -71.05760053724418);
        LatLng beaconHillPoint7 = new LatLng(42.369034037066015, -71.05517488258268);
        LatLng beaconHillPoint8 = new LatLng(42.36981084640369, -71.05204206249876);
        LatLng beaconHillPoint9 = new LatLng(42.36865355551813, -71.05007868552836);
        LatLng beaconHillPoint10 = new LatLng(42.3660218283815, -71.04895215775845);
        LatLng beaconHillPoint11 = new LatLng(42.36172536578365, -71.04795697072909);

        // Coordinates for Downtown Boston
        LatLng downtownPoint1 = new LatLng(42.360990707914134, -71.07318035010636);
        LatLng downtownPoint2 = new LatLng(42.361146145821884, -71.0627938183687);
        LatLng downtownPoint3 = new LatLng(42.36086765263112, -71.06140894747035);
        LatLng downtownPoint4 = new LatLng(42.36034861046176, -71.06041055141101);
        LatLng downtownPoint5 = new LatLng(42.35931799180085, -71.05988483843755);
        LatLng downtownPoint6 = new LatLng(42.36856468693964, -71.05760053724418);
        LatLng downtownPoint7 = new LatLng(42.369034037066015, -71.05517488258268);
        LatLng downtownPoint8 = new LatLng(42.36981084640369, -71.05204206249876);
        LatLng downtownPoint9 = new LatLng(42.36865355551813, -71.05007868552836);
        LatLng downtownPoint10 = new LatLng(42.3660218283815, -71.04895215775845);
        LatLng downtownPoint11 = new LatLng(42.36172536578365, -71.04795697072909);

        // Coordinates for Boston Common
        LatLng bostonCommonPoint1 = new LatLng(42.360990707914134, -71.07318035010636);
        LatLng bostonCommonPoint2 = new LatLng(42.361146145821884, -71.0627938183687);
        LatLng bostonCommonPoint3 = new LatLng(42.36086765263112, -71.06140894747035);
        LatLng bostonCommonPoint4 = new LatLng(42.36034861046176, -71.06041055141101);
        LatLng bostonCommonPoint5 = new LatLng(42.35931799180085, -71.05988483843755);
        LatLng bostonCommonPoint6 = new LatLng(42.36856468693964, -71.05760053724418);
        LatLng bostonCommonPoint7 = new LatLng(42.369034037066015, -71.05517488258268);
        LatLng bostonCommonPoint8 = new LatLng(42.36981084640369, -71.05204206249876);
        LatLng bostonCommonPoint9 = new LatLng(42.36865355551813, -71.05007868552836);
        LatLng bostonCommonPoint10 = new LatLng(42.3660218283815, -71.04895215775845);
        LatLng bostonCommonPoint11 = new LatLng(42.36172536578365, -71.04795697072909);

        // Polyline *probably* not what I want - but this works
        /*PolylineOptions NorthEnd = new PolylineOptions()
                .add(northEndpoint1)
                .add(northEndpoint2)
                .add(northEndpoint3)
                .add(northEndpoint4)
                .add(northEndpoint5)
                .add(northEndpoint6)
                .add(northEndpoint7)
                .add(northEndpoint8)
                .add(northEndpoint9)
                .add(northEndpoint10)
                .add(northEndpoint11)
                .add(northEndpoint1);
        NorthEnd.color(Color.CYAN);*/

        PolygonOptions NorthEndPolygon = new PolygonOptions()
                .add(northEndpoint1)
                .add(northEndpoint2)
                .add(northEndpoint3)
                .add(northEndpoint4)
                .add(northEndpoint5)
                .add(northEndpoint6)
                .add(northEndpoint7)
                .add(northEndpoint8)
                .add(northEndpoint9)
                .add(northEndpoint10)
                .add(northEndpoint11)
                .add(northEndpoint1);

        NorthEndPolygon.strokeColor(Color.BLUE);

        PolygonOptions WestEndPolygon = new PolygonOptions()
                .add(westEndPoint1)
                .add(westEndPoint2)
                .add(westEndPoint3);
                //.add(westEndPoint4)
                //.add(westEndPoint5)
                //.add(westEndPoint6)
                //.add(westEndPoint7)
                //.add(westEndPoint8)
                //.add(westEndPoint9)
                //.add(westEndPoint10)
                //.add(westEndPoint11)
                //.add(westEndPoint1);

        WestEndPolygon.strokeColor(Color.MAGENTA);
        //WestEndPolygon.



        Polygon northEndDrawnBoundry = mMap.addPolygon(NorthEndPolygon);
        Polygon westEndDrawnBoundry = mMap.addPolygon(WestEndPolygon);

        //int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        LatLng[] northEndLatLongArray = new LatLng [] {northEndpoint1, northEndpoint2, northEndpoint3, northEndpoint4, northEndpoint5, northEndpoint6, northEndpoint7, northEndpoint8, northEndpoint9, northEndpoint10, northEndpoint11};

        List<LatLng> northEndLatLongList = new ArrayList<>(Arrays.asList(northEndpoint1, northEndpoint2, northEndpoint3, northEndpoint4, northEndpoint5, northEndpoint6, northEndpoint7, northEndpoint8, northEndpoint9, northEndpoint10, northEndpoint11));

        if(PolyUtil.containsLocation(northEndMarker, northEndLatLongList, false)) {
            Toast.makeText(MapsActivity.this, "YES!!!", Toast.LENGTH_LONG).show();
            System.out.println("YESSS!!!");

        } else {
            Toast.makeText(MapsActivity.this, "NO!!!", Toast.LENGTH_LONG).show();
            System.out.println("NOO!!!");
        }


        //Toast.makeText(this, "YEEEEAH", 20000.0);

        //PolyUtil.containsLocation(userLocation, polyPointsList, false);




    }

    // This function takes a point and zooms in accurately
    private void pointToPosition(LatLng position) {
        //Build camera position
        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(position)
                .zoom(15).build();
        //Zoom in and animate the camera.
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
    }
}