package com.etalance.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import android.app.AlertDialog;
public class MainActivity extends AppCompatActivity {

    public static final String MY_TAG = "the_custom_message";
    private EditText text_password;
    private Button btnView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListnerOnButton();
        //Log.i(MY_TAG,"onCreate");
    }
   public void onButtonClick(View v)
   {
       EditText e1=(EditText)findViewById(R.id.editText);
       EditText e2=(EditText)findViewById(R.id.editText2);
       TextView t1=(TextView)findViewById(R.id.textView);
       int num1=Integer.parseInt(e1.getText().toString());
       int num2=Integer.parseInt(e2.getText().toString());
       int sum=num1+num2;
       t1.setText(Integer.toString(sum));
   }

  public void addListnerOnButton()
  {
      Log.i(MY_TAG,"OnClickView");
      text_password=(EditText)findViewById(R.id.passWord);
      btnView=(Button)findViewById(R.id.View);
      btnView.setOnClickListener(
              new View.OnClickListener(){
                  public void onClick(View v){

                 Toast.makeText(
                 MainActivity.this,text_password.getText(),Toast.LENGTH_SHORT
                 ).show();
                  }
              }
      );
  }
    public void onNextClick(View v)
    {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
    public void onExitClick(View v)
    {
        AlertDialog.Builder a_builder =new AlertDialog.Builder(MainActivity.this);
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
