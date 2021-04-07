package com.example.bostonneighborhoods;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
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
    private static Context context;

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

        LatLng northEndMarker = new LatLng(42.365599715599444, -71.05465352034417);
        mMap.addMarker(new MarkerOptions().position(northEndMarker).title("North End"));
        pointToPosition(northEndMarker);

        // Coordinates for North End
        LatLng northEndpoint1 = new LatLng(42.36026, -71.0476);
        LatLng northEndpoint2 = new LatLng(42.36, -71.04984);
        LatLng northEndpoint3 = new LatLng(42.35967, -71.05173);
        LatLng northEndpoint4 = new LatLng(42.3596, -71.05236);
        LatLng northEndpoint5 = new LatLng(42.36012, -71.05265);
        LatLng northEndpoint6 = new LatLng(42.36051, -71.05305);
        LatLng northEndpoint7 = new LatLng(42.36079, -71.05353);
        LatLng northEndpoint8 = new LatLng(42.36162, -71.05517);
        LatLng northEndpoint9 = new LatLng(42.36215, -71.05635);
        LatLng northEndpoint10 = new LatLng(42.36283, -71.05748);
        LatLng northEndpoint11 = new LatLng(42.36363, -71.05829);
        LatLng northEndpoint12 = new LatLng(42.36443, -71.05813);
        LatLng northEndpoint13 = new LatLng(42.36486, -71.05821);
        LatLng northEndpoint14 = new LatLng(42.36713, -71.06071);
        LatLng northEndpoint15 = new LatLng(42.36785, -71.05891);
        LatLng northEndpoint16 = new LatLng(42.36861, -71.05768);
        LatLng northEndpoint17 = new LatLng(42.3698, -71.052);
        LatLng northEndpoint18 = new LatLng(42.36879, -71.0499);
        LatLng northEndpoint19 = new LatLng(42.3636, -71.04824);

        // Coordinates for West End
        LatLng westEndPoint1 = new LatLng(42.36279, -71.05768);
        LatLng westEndPoint2 = new LatLng(42.36243, -71.05868);
        LatLng westEndPoint3 = new LatLng(42.36132, -71.06095);
        LatLng westEndPoint4 = new LatLng(42.36108, -71.0612);
        LatLng westEndPoint5 = new LatLng(42.36134, -71.06214);
        LatLng westEndPoint6 = new LatLng(42.36132, -71.06489);
        LatLng westEndPoint7 = new LatLng(42.3613, -71.06688);
        LatLng westEndPoint8 = new LatLng(42.3613, -71.06786);
        LatLng westEndPoint9 = new LatLng(42.36123, -71.07);
        LatLng westEndPoint10 = new LatLng(42.36144, -71.07053);
        LatLng westEndPoint11 = new LatLng(42.36147, -71.07088);
        LatLng westEndPoint12 = new LatLng(42.36139, -71.07173);
        LatLng westEndPoint13 = new LatLng(42.36149, -71.07306);
        LatLng westEndPoint14 = new LatLng(42.36178, -71.07296);
        LatLng westEndPoint15 = new LatLng(42.36222, -71.07316);
        LatLng westEndPoint16 = new LatLng(42.36383, -71.07292);
        LatLng westEndPoint17 = new LatLng(42.36426, -71.07269);
        LatLng westEndPoint18 = new LatLng(42.36451, -71.07241);
        LatLng westEndPoint19 = new LatLng(42.36478, -71.0719);
        LatLng westEndPoint20 = new LatLng(42.36503, -71.07096);
        LatLng westEndPoint21 = new LatLng(42.36701, -71.06914);
        LatLng westEndPoint22 = new LatLng(42.3673, -71.06821);
        LatLng westEndPoint23 = new LatLng(42.3683, -71.06569);
        LatLng westEndPoint24 = new LatLng(42.36831, -71.06343);

        // Coordinates for Boston Common
        LatLng bostonCommonPoint1 = new LatLng(42.35544322199002, -71.07234526003386);
        LatLng bostonCommonPoint2 = new LatLng(42.357282249675684, -71.06429493341662);
        LatLng bostonCommonPoint3 = new LatLng(42.35764131477527, -71.06324431983307);
        LatLng bostonCommonPoint4 = new LatLng(42.356510738042196, -71.0620952112197);
        LatLng bostonCommonPoint5 = new LatLng(42.35522971664927, -71.06336908019681);
        LatLng bostonCommonPoint6 = new LatLng(42.352434670210656, -71.06463638283101);
        LatLng bostonCommonPoint7 = new LatLng(42.35267244805933, -71.0675518355361);
        LatLng bostonCommonPoint8 = new LatLng(42.352046459456474, -71.07070367630418);

        // Coordinates for Beacon Hill
        LatLng beaconHillPoint1 = new LatLng(42.36097, -71.07215);
        LatLng beaconHillPoint2 = new LatLng(42.36111, -71.06263);
        LatLng beaconHillPoint3 = new LatLng(42.36095, -71.06173);
        LatLng beaconHillPoint4 = new LatLng(42.36059, -71.06088);
        LatLng beaconHillPoint5 = new LatLng(42.36007, -71.06023);
        LatLng beaconHillPoint6 = new LatLng(42.3594, -71.05993);
        LatLng beaconHillPoint7 = new LatLng(42.35893, -71.05997);
        LatLng beaconHillPoint8 = new LatLng(42.35867, -71.06004);
        LatLng beaconHillPoint9 = new LatLng(42.35798, -71.06056);
        LatLng beaconHillPoint10 = new LatLng(42.35689, -71.06163);
        LatLng beaconHillPoint11 = new LatLng(42.35661, -71.06199);
        LatLng beaconHillPoint12 = new LatLng(42.35779, -71.06319);
        LatLng beaconHillPoint13 = new LatLng(42.35721, -71.06499);
        LatLng beaconHillPoint14 = new LatLng(42.35633, -71.06908);
        LatLng beaconHillPoint15 = new LatLng(42.35629, -71.06949);
        LatLng beaconHillPoint16 = new LatLng(42.35605, -71.07025);
        LatLng beaconHillPoint17 = new LatLng(42.35546, -71.07282);
        LatLng beaconHillPoint18 = new LatLng(42.3559, -71.07308);
        LatLng beaconHillPoint19 = new LatLng(42.35771, -71.07247);
        LatLng beaconHillPoint20 = new LatLng(42.36029, -71.07195);
        LatLng beaconHillPoint21 = new LatLng(42.36079, -71.07224);

        // Coordinates for Downtown
        LatLng downtownPoint1 = new LatLng(42.36102, -71.06108);
        LatLng downtownPoint2 = new LatLng(42.36123, -71.06086);
        LatLng downtownPoint3 = new LatLng(42.36268, -71.05752);
        LatLng downtownPoint4 = new LatLng(42.36206, -71.05649);
        LatLng downtownPoint5 = new LatLng(42.36206, -71.05649);
        LatLng downtownPoint6 = new LatLng(42.36081, -71.05385);
        LatLng downtownPoint7 = new LatLng(42.3596, -71.05236);
        LatLng downtownPoint8 = new LatLng(42.35914, -71.05228);
        LatLng downtownPoint9 = new LatLng(42.35958, -71.04835);
        LatLng downtownPoint10 = new LatLng(42.35894, -71.04833);
        LatLng downtownPoint11 = new LatLng(42.35835, -71.04937);
        LatLng downtownPoint12 = new LatLng(42.35714, -71.04885);
        LatLng downtownPoint13 = new LatLng(42.35654, -71.04915);
        LatLng downtownPoint14 = new LatLng(42.35607, -71.04946);
        LatLng downtownPoint15 = new LatLng(42.35461, -71.05043);
        LatLng downtownPoint16 = new LatLng(42.35117, -71.05281);
        LatLng downtownPoint17 = new LatLng(42.35224, -71.05696);
        LatLng downtownPoint18 = new LatLng(42.35225, -71.05722);
        LatLng downtownPoint19 = new LatLng(42.3524, -71.05802);
        LatLng downtownPoint20 = new LatLng(42.35266, -71.06014);
        LatLng downtownPoint21 = new LatLng(42.35244, -71.06272);
        LatLng downtownPoint22 = new LatLng(42.3512, -71.06496);
        LatLng downtownPoint23 = new LatLng(42.35124, -71.06611);
        LatLng downtownPoint24 = new LatLng(42.35022, -71.06979);
        LatLng downtownPoint25 = new LatLng(42.35181, -71.07053);
        LatLng downtownPoint26 = new LatLng(42.35247, -71.06708);
        LatLng downtownPoint27 = new LatLng(42.35227, -71.0644);
        LatLng downtownPoint28 = new LatLng(42.35509, -71.06327);
        LatLng downtownPoint29 = new LatLng(42.35652, -71.06188);
        LatLng downtownPoint30 = new LatLng(42.35792, -71.06039);
        LatLng downtownPoint31 = new LatLng(42.35868, -71.05987);
        LatLng downtownPoint32 = new LatLng(42.35925, -71.05975);
        LatLng downtownPoint33 = new LatLng(42.35982, -71.05978);
        LatLng downtownPoint34 = new LatLng(42.36059, -71.06038);

        // Coordinates for Bay Village
        LatLng bayVillagePoint1 = new LatLng(42.34804, -71.06804);
        LatLng bayVillagePoint2 = new LatLng(42.34816, -71.0699);
        LatLng bayVillagePoint3 = new LatLng(42.34813, -71.0704);
        LatLng bayVillagePoint4 = new LatLng(42.34807, -71.07227);
        LatLng bayVillagePoint5 = new LatLng(42.35003, -71.07002);
        LatLng bayVillagePoint6 = new LatLng(42.35087, -71.06692);
        LatLng bayVillagePoint7 = new LatLng(42.34919, -71.06651);
        LatLng bayVillagePoint8 = new LatLng(42.34902, -71.06652);
        LatLng bayVillagePoint9 = new LatLng(42.34884, -71.06663);

        // For each neighborhood, create the polygon object from the above points and set the outline color

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
                .add(northEndpoint12)
                .add(northEndpoint13)
                .add(northEndpoint14)
                .add(northEndpoint15)
                .add(northEndpoint16)
                .add(northEndpoint17)
                .add(northEndpoint18)
                .add(northEndpoint19);
        NorthEndPolygon.strokeColor(Color.BLUE);

        PolygonOptions WestEndPolygon = new PolygonOptions()
                .add(westEndPoint1)
                .add(westEndPoint2)
                .add(westEndPoint3)
                .add(westEndPoint4)
                .add(westEndPoint5)
                .add(westEndPoint6)
                .add(westEndPoint7)
                .add(westEndPoint8)
                .add(westEndPoint9)
                .add(westEndPoint10)
                .add(westEndPoint11)
                .add(westEndPoint12)
                .add(westEndPoint13)
                .add(westEndPoint14)
                .add(westEndPoint15)
                .add(westEndPoint16)
                .add(westEndPoint17)
                .add(westEndPoint18)
                .add(westEndPoint19)
                .add(westEndPoint20)
                .add(westEndPoint21)
                .add(westEndPoint22)
                .add(westEndPoint23)
                .add(westEndPoint24);
        WestEndPolygon.strokeColor(Color.MAGENTA);

        PolygonOptions BostonCommonPolygon = new PolygonOptions()
                .add(bostonCommonPoint1)
                .add(bostonCommonPoint2)
                .add(bostonCommonPoint3)
                .add(bostonCommonPoint4)
                .add(bostonCommonPoint5)
                .add(bostonCommonPoint6)
                .add(bostonCommonPoint7)
                .add(bostonCommonPoint8);
        BostonCommonPolygon.strokeColor(Color.RED);

        PolygonOptions BeaconHillPolygon = new PolygonOptions()
                .add(beaconHillPoint1)
                .add(beaconHillPoint2)
                .add(beaconHillPoint3)
                .add(beaconHillPoint4)
                .add(beaconHillPoint5)
                .add(beaconHillPoint6)
                .add(beaconHillPoint7)
                .add(beaconHillPoint8)
                .add(beaconHillPoint9)
                .add(beaconHillPoint10)
                .add(beaconHillPoint11)
                .add(beaconHillPoint12)
                .add(beaconHillPoint13)
                .add(beaconHillPoint14)
                .add(beaconHillPoint15)
                .add(beaconHillPoint16)
                .add(beaconHillPoint17)
                .add(beaconHillPoint18)
                .add(beaconHillPoint19)
                .add(beaconHillPoint20)
                .add(beaconHillPoint21);
        BeaconHillPolygon.strokeColor(Color.GREEN);

        PolygonOptions DowntownPolygon = new PolygonOptions()
                .add(downtownPoint1)
                .add(downtownPoint2)
                .add(downtownPoint3)
                .add(downtownPoint4)
                .add(downtownPoint5)
                .add(downtownPoint6)
                .add(downtownPoint7)
                .add(downtownPoint8)
                .add(downtownPoint9)
                .add(downtownPoint10)
                .add(downtownPoint11)
                .add(downtownPoint12)
                .add(downtownPoint13)
                .add(downtownPoint14)
                .add(downtownPoint15)
                .add(downtownPoint16)
                .add(downtownPoint17)
                .add(downtownPoint18)
                .add(downtownPoint19)
                .add(downtownPoint20)
                .add(downtownPoint21)
                .add(downtownPoint22)
                .add(downtownPoint23)
                .add(downtownPoint24)
                .add(downtownPoint25)
                .add(downtownPoint26)
                .add(downtownPoint27)
                .add(downtownPoint28)
                .add(downtownPoint29)
                .add(downtownPoint30)
                .add(downtownPoint31)
                .add(downtownPoint32)
                .add(downtownPoint33)
                .add(downtownPoint34);

        DowntownPolygon.strokeColor(Color.YELLOW);

        //DowntownPolygon.strokeColor(R.color.Seashell)
        //DowntownPolygon.strokeColor(R.color.nuclearOrange);

        String s=String.valueOf(R.color.nuclearOrange);
        Log.wtf("the fuckin' color", s);

        //area1.setBackgroundColor(Color.parseColor("Navy"));

        //DowntownPolygon.strokeColor(Color.);

        PolygonOptions BayVillagePolygon = new PolygonOptions()
                .add(bayVillagePoint1)
                .add(bayVillagePoint2)
                .add(bayVillagePoint3)
                .add(bayVillagePoint4)
                .add(bayVillagePoint5)
                .add(bayVillagePoint6)
                .add(bayVillagePoint7)
                .add(bayVillagePoint8)
                .add(bayVillagePoint9);
        BayVillagePolygon.strokeColor(Color.BLUE);
        //BayVillagePolygon.strokeColor(R.color.teal_200);

        Polygon northEndDrawnBoundry = mMap.addPolygon(NorthEndPolygon);
        Polygon westEndDrawnBoundry = mMap.addPolygon(WestEndPolygon);
        Polygon BostonCommonDrawnBoundry = mMap.addPolygon(BostonCommonPolygon);
        Polygon BeaconHillDrawnBoundry = mMap.addPolygon(BeaconHillPolygon);
        Polygon DowntownDrawnBoundry = mMap.addPolygon(DowntownPolygon);
        Polygon BayVillageDrawnBoundry = mMap.addPolygon(BayVillagePolygon);

        LatLng[] northEndLatLongArray = new LatLng [] {northEndpoint1, northEndpoint2, northEndpoint3, northEndpoint4, northEndpoint5, northEndpoint6, northEndpoint7, northEndpoint8, northEndpoint9, northEndpoint10, northEndpoint11};

        List<LatLng> northEndLatLongList = new ArrayList<>(Arrays.asList(northEndpoint1, northEndpoint2, northEndpoint3, northEndpoint4, northEndpoint5, northEndpoint6, northEndpoint7, northEndpoint8, northEndpoint9, northEndpoint10, northEndpoint11));

        /*if(PolyUtil.containsLocation(northEndMarker, northEndLatLongList, false)) {
            Toast.makeText(MapsActivity.this, "YES!!!", Toast.LENGTH_LONG).show();
            System.out.println("YESSS!!!");

        } else {
            Toast.makeText(MapsActivity.this, "NO!!!", Toast.LENGTH_LONG).show();
            System.out.println("NOO!!!");
        }*/

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