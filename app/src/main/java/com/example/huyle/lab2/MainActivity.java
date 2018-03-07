package com.example.huyle.lab2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.File;

import static com.example.huyle.lab2.R.id.imageView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnchange = (Button) findViewById(R.id.button);
        btnchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StartBActivity();
            }
        });
    }
    private static final int REQUEST_ACT_B = 1000;
    private void StartBActivity (){
        Intent i = new Intent (MainActivity.this,Main2Activity.class);
        startActivityForResult(i,REQUEST_ACT_B);
        //onActivityResult(1000,RESULT_OK,i);


    }
    protected void onActivityResult (int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode==1000){
            if(resultCode==RESULT_OK){
                TextView t1 = (TextView) findViewById(R.id.textView2);
                String i1 = data.getStringExtra("key_string");
                String i2 = data.getStringExtra("color");
                t1.setText(i1);
                if(i2.equalsIgnoreCase("pink")){
                    t1.setTextColor(getResources().getColor(R.color.pink));
                }
                if(i2.equalsIgnoreCase("purple")){
                    t1.setTextColor(getResources().getColor(R.color.purple));
                }
                if(i2.equalsIgnoreCase("indigo")){
                    t1.setTextColor(getResources().getColor(R.color.indigo));
                }
                if(i2.equalsIgnoreCase("blue")){
                    t1.setTextColor(getResources().getColor(R.color.blue));
                }
                if(i2.equalsIgnoreCase("teal")){
                    t1.setTextColor(getResources().getColor(R.color.teal));
                }
                if(i2.equalsIgnoreCase("green")){
                    t1.setTextColor(getResources().getColor(R.color.green));
                }

            }
        }
    }
}
