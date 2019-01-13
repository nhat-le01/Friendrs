package com.example.android.homework3_suggestion2;

import android.content.Intent;
import android.media.Rating;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        RatingBar r = (RatingBar) findViewById(R.id.ratingBar);
        Intent intent = getIntent();
        int currentViewdId = intent.getIntExtra("id", 0);
        r.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Intent goBack = new Intent();
                goBack.putExtra("Rating", String.valueOf(rating));
                //goBack.putExtra("Id", currentViewdId);
                setResult(RESULT_OK, goBack);
                finish();
            }
        });
        //Intent intent = getIntent();
        ImageView currentImage = (ImageView) findViewById(R.id.img);
        //int currentViewdId = intent.getIntExtra("id", 0);
        if(currentViewdId == R.id.chandlerImage) {
            currentImage.setImageResource(R.drawable.chandlerpreview);
        }
        else if (currentViewdId == R.id.phoebeImage) {
            currentImage.setImageResource(R.drawable.phoebepreview);
        }
        else if (currentViewdId == R.id.rachelImage) {
            currentImage.setImageResource(R.drawable.rachelpreview);
        }

        else if (currentViewdId == R.id.rossImage) {
            currentImage.setImageResource(R.drawable.rosspreview);
        }
        else if (currentViewdId == R.id.monicaImage) {
            currentImage.setImageResource(R.drawable.monicapreview);
        }
        else if (currentViewdId == R.id.joeyImage) {
            currentImage.setImageResource(R.drawable.joeypreview);
        }

    }


}
