package com.example.android.homework3_suggestion2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final int CODE_RATING = 1000;
    int newlyRated;
    //public String clickedOn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clickImage(View view) {
        Intent intent = new Intent(this, DetailActivity.class);

        intent.putExtra("id", view.getId());
        newlyRated = view.getId();
        startActivityForResult(intent, CODE_RATING);

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);

        if (requestCode == CODE_RATING) {
            // we are coming back from AddWordActivity
            // intent
            // -> "newword", "newdefn"
            String rating = intent.getStringExtra("Rating");
            //int newlyRated = intent.getIntExtra("Id",0);
            Context context = getApplicationContext();
            CharSequence text = "You rated this character " + rating;
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

            //ImageView img = (ImageView) findViewById(newlyRated);
            //img.setRating(Float.parseFloat(rating));
            if (newlyRated == R.id.chandlerImage) {
                RatingBar r = (RatingBar) findViewById(R.id.chandlerRatingBar);
                r.setRating(Float.parseFloat(rating));
            }
            else if (newlyRated == R.id.phoebeImage) {
                RatingBar r = (RatingBar) findViewById(R.id.phoebeRatingBar);
                r.setRating(Float.parseFloat(rating));
            }
            else if (newlyRated == R.id.joeyImage) {
                RatingBar r = (RatingBar) findViewById(R.id.joeyRatingBar);
                r.setRating(Float.parseFloat(rating));
            }
            else if (newlyRated == R.id.monicaImage) {
                RatingBar r = (RatingBar) findViewById(R.id.monicaRatingBar);
                r.setRating(Float.parseFloat(rating));
            }
            else if (newlyRated == R.id.rachelImage) {
                RatingBar r = (RatingBar) findViewById(R.id.rachelRatingBar);
                r.setRating(Float.parseFloat(rating));
            }
            else if (newlyRated == R.id.rossImage) {
                RatingBar r = (RatingBar) findViewById(R.id.rossRatingBar);
                r.setRating(Float.parseFloat(rating));
            }


            //toast("You added the word: " + newWord);
        }
    }
}
