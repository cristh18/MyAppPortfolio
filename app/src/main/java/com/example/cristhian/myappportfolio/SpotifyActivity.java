package com.example.cristhian.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by Cristhian on 6/24/2015.
 */
public class SpotifyActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spotify);
        getFragmentManager().beginTransaction().add(R.id.spoti_container, new SpotifyFragment()).commit();
    }
}
