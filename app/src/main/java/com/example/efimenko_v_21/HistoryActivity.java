package com.example.efimenko_v_21;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.TextView;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        ImageButton imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HistoryActivity.this, SecondActivity.class);
                startActivity(intent);

                finish();
            }
        });

        CheckBox checkbox5 = findViewById(R.id.checkBox5);
        TextView textView4 = findViewById(R.id.textView4);
        textView4.setTextColor(Color.GRAY);
        checkbox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textView4.setTextColor(Color.BLACK);
                } else {
                    textView4.setTextColor(Color.GRAY);
                }
            }
        });

        CheckBox checkbox6 = findViewById(R.id.checkBox6);
        TextView textView5 = findViewById(R.id.textView5);
        textView5.setTextColor(Color.GRAY);
        checkbox6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textView5.setTextColor(Color.BLACK);
                } else {
                    textView5.setTextColor(Color.GRAY);
                }
            }
        });

        CheckBox checkbox4 = findViewById(R.id.checkBox4);
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setTextColor(Color.GRAY);
        checkbox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textView3.setTextColor(Color.BLACK);
                } else {
                    textView3.setTextColor(Color.GRAY);
                }
            }
        });


    }
}