package com.jnphilippe.flixster.Models;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import com.jnphilippe.flixster.R;

import org.parceler.Parcels;

public class DetailActivity extends Activity {
    TextView tvTitle;
    TextView tvOverview;
    RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tvTitle = findViewById((R.id.tvTitle));
        tvOverview = findViewById((R.id.tvOverview));
        ratingBar = findViewById((R.id.ratingBar));
        Movie movie = Parcels.unwrap(getIntent().getParcelableExtra("movie"));
        tvTitle.setText(movie.getTitle());
        tvOverview.setText(movie.getOverview());
        ratingBar.setRating((float) movie.getRating());
    }
}
