package com.example.huyle.lab2;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {

    String colors = "black" ;
    @BindView(R.id.iv1) ImageView i1;
    @BindView(R.id.iv2) ImageView i2;
    @BindView(R.id.iv3) ImageView i3;
    @BindView(R.id.iv4) ImageView i4;
    @BindView(R.id.iv5) ImageView i5;
    @BindView(R.id.iv6) ImageView i6;
    @BindView(R.id.btnSave) Button save;
    @BindView(R.id.viewSample) View v1;
    @BindView(R.id.edt) TextView textElement;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

    }
    @OnClick(R.id.iv1)
    public void iv1(View view) {
        v1.setBackgroundColor(getResources().getColor(R.color.pink));
        textElement.setTextColor(getResources().getColor(R.color.pink));
        colors = "pink";
    }
    @OnClick(R.id.iv2)
    public void iv2(View view) {
        v1.setBackgroundColor(getResources().getColor(R.color.purple));
        textElement.setTextColor(getResources().getColor(R.color.purple));
        colors = "purple";
    }
    @OnClick(R.id.iv3)
    public void iv3(View view) {
        v1.setBackgroundColor(getResources().getColor(R.color.indigo));
        textElement.setTextColor(getResources().getColor(R.color.indigo));
        colors = "pink";
    }
    @OnClick(R.id.iv4)
    public void iv4(View view) {
        v1.setBackgroundColor(getResources().getColor(R.color.blue));
        textElement.setTextColor(getResources().getColor(R.color.blue));
        colors = "blue";
    }
    @OnClick(R.id.iv5)
    public void iv5(View view) {
        v1.setBackgroundColor(getResources().getColor(R.color.teal));
        textElement.setTextColor(getResources().getColor(R.color.teal));
        colors = "teal";
    }
    @OnClick(R.id.iv6)
    public void iv6(View view) {
        v1.setBackgroundColor(getResources().getColor(R.color.green));
        textElement.setTextColor(getResources().getColor(R.color.green));
        colors = "green";
    }
    @OnClick(R.id.btnSave)
    public void button(View view) {
        Intent i = new Intent(Main2Activity.this,MainActivity.class);
        i.putExtra("key_string",textElement.getText().toString());
        i.putExtra("color", colors);
        setResult(RESULT_OK,i);
        finish();
    }
}
