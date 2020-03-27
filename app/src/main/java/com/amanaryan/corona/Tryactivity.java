package com.amanaryan.corona;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tryactivity extends AppCompatActivity {
    ConstraintLayout home,tips;
    TextView homeInactive,homeActive,tipsInactive,tipsActive;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tipsInactive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homeActive.setVisibility(View.GONE);
                homeInactive.setVisibility(View.VISIBLE);
                tipsInactive.setVisibility(View.GONE);
                tipsActive.setVisibility(View.VISIBLE);
                home.setVisibility(View.GONE);
                tips.setVisibility(View.VISIBLE);



            }
        });

    }
}
