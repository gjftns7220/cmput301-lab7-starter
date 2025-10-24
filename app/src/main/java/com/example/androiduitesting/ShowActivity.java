package com.example.androiduitesting;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {
    public static final String CityName = "city_name";

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);

        TextView cityName = new TextView(this);
        String name = getIntent().getStringExtra(CityName);

        cityName.setText(name != null ? name : "");
        root.addView(cityName);

        Button back = new Button(this);
        back.setText("Back");
        back.setOnClickListener(v -> finish());
        root.addView(back);

        setContentView(root);
    }
}
