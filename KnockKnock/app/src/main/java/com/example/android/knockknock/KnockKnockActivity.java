package com.example.android.knockknock;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class KnockKnockActivity extends AppCompatActivity {
    JokeBook jokeBook = new JokeBook();
    ColorWheel colorWheel = new ColorWheel();

    // Declared View variables
    private TextView jokeTextView;
    private Button showAnotherJokeButton;
    private RelativeLayout jokeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knock_knock);

        // Assign the views from the layout files to the corresponding variables
        jokeTextView = (TextView) findViewById(R.id.jokeTextView);
        showAnotherJokeButton = (Button) findViewById(R.id.showAnotherJokeButton);
        jokeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);


        // The button was click so update the jokeTextView with a new joke
        // Randomly select a joke to display

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Update the screen with the new joke
                String joke = jokeBook.getJoke();
                jokeTextView.setText(joke);

                // Change background color
                int color = colorWheel.getColor();
                jokeLayout.setBackgroundColor(color);

                // Change button textColor
                showAnotherJokeButton.setTextColor(color);

            }
        };

        showAnotherJokeButton.setOnClickListener(listener);
    }
}
