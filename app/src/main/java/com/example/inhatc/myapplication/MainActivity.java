package com.example.inhatc.myapplication;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    LinearLayout layout1;
    LinearLayout layout2;
    CheckBox ch1;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    Button bt1;
    ImageView iv1;
    ImageView iv2;
    ImageView iv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout1 = (LinearLayout)findViewById(R.id.layout1);
        layout2 = (LinearLayout)findViewById(R.id.layout2);

        setCheckBox();
        setButton();
        setRadioButton();
        setImageViwe();
    }

    void setCheckBox(){
        ch1 = (CheckBox)findViewById(R.id.checkbox1);
        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch1.isChecked())
                    layout2.setVisibility(View.VISIBLE);
                else
                    layout2.setVisibility(View.INVISIBLE);
            }
        });
    }

    void setRadioButton(){
        rb1= (RadioButton)findViewById(R.id.radioButton1);
        rb2= (RadioButton)findViewById(R.id.radioButton2);
        rb3= (RadioButton)findViewById(R.id.radioButton3);
        rb1.setChecked(true);
    }

    void setButton(){
        bt1 = (Button)findViewById(R.id.button);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rb1.isChecked()) {
                    iv1.setVisibility(View.VISIBLE);
                    iv2.setVisibility(View.GONE);
                    iv3.setVisibility(View.GONE);
                }
                else if(rb2.isChecked()) {
                    iv1.setVisibility(View.GONE);
                    iv2.setVisibility(View.VISIBLE);
                    iv3.setVisibility(View.GONE);
                }
                else if(rb3.isChecked()){
                    iv1.setVisibility(View.GONE);
                    iv2.setVisibility(View.GONE);
                    iv3.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    void setImageViwe(){
        iv1 = (ImageView)findViewById(R.id.imageView);
        iv2 = (ImageView)findViewById(R.id.imageView2);
        iv3 = (ImageView)findViewById(R.id.imageView3);
    }
}
