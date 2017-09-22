package com.example.android.knockknock;


import java.util.Random;

public class JokeBook {
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

    public String getJoke() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(jokes.length);


        // Select a random joke
        return jokes[randomNumber];
    }
}
