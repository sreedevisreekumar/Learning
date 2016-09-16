package com.etalance.myapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.RatingBar;
public class Main2Activity extends AppCompatActivity {
private static CheckBox checkBooks;
private static CheckBox checkMovies;
    private static RadioGroup rgDelivery;
    private static RadioButton rbButton;
    private static RatingBar ratingBar;
    private static TextView textView3;
    private static Button btnRating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listenerForRatingBar();
    }

    public void onClickBooks(View v)
    {
         if(((CheckBox)v).isChecked())
        {
              Toast.makeText(Main2Activity.this,"Books selected",Toast.LENGTH_LONG).show();
        }
    }
    public void onClickMovies(View v)
    {
        if(((CheckBox)v).isChecked())
        {
            Toast.makeText(Main2Activity.this,"Movies selected",Toast.LENGTH_LONG).show();
        }
    }
    public void onButtonClick(View v) {
        StringBuffer result=new StringBuffer();
        checkBooks=(CheckBox) findViewById(R.id.checkBox_Books);
        checkMovies=(CheckBox) findViewById(R.id.checkBox_Movies);
        result.append("Books:").append(checkBooks.isChecked());
        result.append("Movies:").append(checkMovies.isChecked());
        Toast.makeText(Main2Activity.this,result.toString(),Toast.LENGTH_LONG).show();
    }
public void onClickDelivery(View v)
{
    rgDelivery=(RadioGroup)findViewById(R.id.rg_items);
    int selected_id = rgDelivery.getCheckedRadioButtonId();
   rbButton = (RadioButton)findViewById(selected_id);
    Toast.makeText(Main2Activity.this,
            rbButton.getText().toString(),Toast.LENGTH_SHORT ).show();
}
    public void listenerForRatingBar()
    {
        ratingBar=(RatingBar)findViewById((R.id.ratingBar));
        textView3=(TextView)findViewById(R.id.textView3);
        ratingBar.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar,float rating,boolean fromUser){
                        textView3.setText(String.valueOf(rating));
                }
                }
        );
    }
    public void onbtnRatingClick(View v)
    {
        ratingBar=(RatingBar)findViewById((R.id.ratingBar));
        btnRating=(Button)findViewById(R.id.btnRating);
        Toast.makeText(Main2Activity.this,
                String.valueOf(ratingBar.getRating()),
                Toast.LENGTH_SHORT).show();
    }
    public void onNextClick(View v)
    {
        Intent intent = new Intent(this, ClockActivity.class);
        startActivity(intent);
    }
    public void onExitClick(View v)
    {
        AlertDialog.Builder a_builder =new AlertDialog.Builder(Main2Activity.this);
        a_builder.setMessage("Do you want to Close this App !!!")
                .setCancelable(false)
                .setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("No",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog,int which){
                        dialog.cancel();
                    }
                });
        AlertDialog alert =a_builder.create();
        alert.setTitle("Alert !!!");
        alert.show();




    }
}
