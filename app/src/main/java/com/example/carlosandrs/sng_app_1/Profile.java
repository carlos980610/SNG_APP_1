package com.example.carlosandrs.sng_app_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class Profile extends AppCompatActivity {

    ProgressBar prb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        prb =(ProgressBar)findViewById(R.id.progressBar);
        prb.setProgress(70);

        GridView gridview = (GridView) findViewById(R.id.gridview);

        gridview.setAdapter(new ImageAdapter(this));


        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                /*Toast.makeText(Profile.this, "" + position, Toast.LENGTH_SHORT)
                        .show();*/
                Intent i = new Intent(getApplicationContext(), SingleViewActivity.class);
                // Pass image index
                i.putExtra("id", position);
                startActivity(i);
            }
        });

    }


}
