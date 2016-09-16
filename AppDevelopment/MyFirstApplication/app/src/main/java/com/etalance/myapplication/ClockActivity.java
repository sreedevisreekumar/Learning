package com.etalance.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.TextClock;

public class ClockActivity extends AppCompatActivity {

    private static Button btnSwap;
    private static AnalogClock analogCk;
    private static TextClock textCk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock);
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
    public void onSwapClick(View v)
    {
         btnSwap=(Button)findViewById(R.id.btnSwap);
        analogCk=(AnalogClock)findViewById(R.id.anaLogCk);
        textCk=(TextClock)findViewById(R.id.textCk);
        if(analogCk.getVisibility()==AnalogClock.GONE) {
            analogCk.setVisibility(AnalogClock.VISIBLE);
            textCk.setVisibility(TextClock.GONE);
        }
        else {
            analogCk.setVisibility(AnalogClock.GONE);
            textCk.setVisibility(TextClock.VISIBLE);

        }
    }

}
