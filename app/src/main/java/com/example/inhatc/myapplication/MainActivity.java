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
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    LinearLayout layout1;
    LinearLayout layout2;
    RadioGroup rg1;
    CheckBox ch1;
    Button bt1;
    ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout1 = (LinearLayout)findViewById(R.id.layout1);
        layout2 = (LinearLayout)findViewById(R.id.layout2);

        setCheckBox();
        setButton();
        setRadioGroup();
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

    void setRadioGroup(){
        rg1 = (RadioGroup)findViewById(R.id.radioGroup);
    }

    void setButton(){
        bt1 = (Button)findViewById(R.id.button);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(rg1.getCheckedRadioButtonId()==R.id.radioButton1)
                iv1.setImageResource(R.drawable.bori);
            else if(rg1.getCheckedRadioButtonId()==R.id.radioButton2)
                iv1.setImageResource(R.drawable.cat);
            else if(rg1.getCheckedRadioButtonId()==R.id.radioButton3)
                iv1.setImageResource(R.drawable.kiwii);
            }
        });
    }

    void setImageViwe(){
        iv1 = (ImageView)findViewById(R.id.imageView);
    }
}
