package com.example.efimenko_v_21;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textViewWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewWelcome = findViewById(R.id.textViewWelcome);

        String username = getIntent().getStringExtra("username");

        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("Привет, " + username + "!");
        ForegroundColorSpan nameColorSpan = new ForegroundColorSpan(Color.GREEN);

        spannableStringBuilder.setSpan(nameColorSpan, 7, 7 + username.length() + 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        ForegroundColorSpan defaultColorSpan = new ForegroundColorSpan(Color.BLACK);
        spannableStringBuilder.setSpan(defaultColorSpan, 0, 7, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableStringBuilder.setSpan(defaultColorSpan, 7 + username.length() + 1, spannableStringBuilder.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        textViewWelcome.setText(spannableStringBuilder);

        View imageButton3 = findViewById(R.id.imageButton3);

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent0 = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent0);

                finish();
            }
        });
        View openWebsiteButton = findViewById(R.id.buttonBr);

        openWebsiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://natk.ru/stud-grad/schedule";

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);

            }
        });

        ImageButton imageButton4 = findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(SecondActivity.this, HistoryActivity.class);
                startActivity(intent2);

                finish();
            }
        });
    }
}