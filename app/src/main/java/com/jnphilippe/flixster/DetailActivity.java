package com.jnphilippe.flixster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

import com.jnphilippe.flixster.R;

public class DetailActivity extends AppCompatActivity {
    TextView tvTitle;
    TextView tvOvervier;
     RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);
        tvTitle = findViewById(R.id.tvTitle);
        tvOvervier = findViewById(R.id.tvOverview);
        ratingBar = findViewById(R.id.ratingBar);
        String title = getIntent().getStringExtra("title");
        tvTitle.setText(title);

    }
}