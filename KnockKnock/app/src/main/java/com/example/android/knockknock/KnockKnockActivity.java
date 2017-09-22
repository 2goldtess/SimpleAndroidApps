package com.example.android.knockknock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class KnockKnockActivity extends AppCompatActivity {

    // Declared View variables
    private TextView jokeTextView;
    private Button showAnotherJokeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knock_knock);

        jokeTextView = (TextView) findViewById(R.id.jokeTextView);
        showAnotherJokeButton = (Button) findViewById(R.id.showAnotherJokeButton);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Array of all jokes
                String[] jokes = {
                        "Broken pencil… Broken pencil who? Ah never mind. its a pointless joke",
                        "Baby Owl… Baby Owl who? Baby Owl buy you anything you want, just let me in! It’s freezing out here",
                        "Radio… Radio who? Radio not here I come.",
                        "Dumbbell… Dumbbell who? Dumbbell doesn’t work so I had to knock.",
                        "Spider… Spider who? In spider what everyone says, I kinda’ like you!",
                        "Oink oink… Oink oink who? Make up your mind, are you a pig or an owl?!",
                        "Madam… Madam who? Madam foot is caught in the door!",
                        "Boo!… Boo who? Don’t cry it’s only a joke!",
                        "A herd… A herd who? A herd you were home, so I came over!",
                        "Woo… Woo who? Don’t get so excited, it’s just a joke."
                };

                // The button was click so update the jokeTextView with a new joke
                // Randomly select a joke to display

                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(jokes.length);


                // Select a joke who's array index matches the random number generated
                String joke = jokes[randomNumber];

                // Update the screen with the new joke
                jokeTextView.setText(joke);
            }
        };

        showAnotherJokeButton.setOnClickListener(listener);
    }
}
