package com.example.carlosandrs.sng_app_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class Profile extends AppCompatActivity {

    ProgressBar prb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        prb =(ProgressBar)findViewById(R.id.progressBar);
        prb.setProgress(70);
    }


}
