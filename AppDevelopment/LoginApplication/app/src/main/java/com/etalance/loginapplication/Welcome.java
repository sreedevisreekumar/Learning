package com.etalance.loginapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Welcome extends AppCompatActivity {
private static Button btnstart;
    private static ImageView imgView;
    private int current_image_index=0;
    int[] images={R.mipmap.welcome_star,R.mipmap.thumbs_star,R.mipmap.gold_star};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void OnStartClick(View v){
       btnstart=(Button)findViewById(R.id.btnStart);
        imgView=(ImageView)findViewById(R.id.imageView);
        current_image_index++;
        current_image_index=current_image_index % images.length;
        imgView.setImageResource(images[current_image_index]);
    }

}
