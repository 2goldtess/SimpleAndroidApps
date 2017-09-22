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

                String joke = jokeBook.getJoke();
                // Update the screen with the new joke
                jokeTextView.setText(joke);

                // Change background color
                jokeLayout.setBackgroundColor(Color.MAGENTA);

            }
        };

        showAnotherJokeButton.setOnClickListener(listener);
    }
}
