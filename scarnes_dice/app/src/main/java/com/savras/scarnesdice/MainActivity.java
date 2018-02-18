package com.savras.scarnesdice;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int userTotalScore;
    private int userTurnScore;
    private int pcTotalScore;
    private int pcTurnScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void roll(View view) {
        Random ran = new Random();
        int roll = ran.nextInt(5) + 1;

        ImageView imageView = findViewById(R.id.imageView);
        switch(roll) {
            case 1: {
                imageView.setImageResource(R.drawable.dice1);
            }
            case 2: {
                imageView.setImageResource(R.drawable.dice2);
            }
            case 3: {
                imageView.setImageResource(R.drawable.dice3);
            }
            case 4: {
                imageView.setImageResource(R.drawable.dice4);
            }
            case 5: {
                imageView.setImageResource(R.drawable.dice5);
            }
            case 6: {
                imageView.setImageResource(R.drawable.dice6);
            }
        }

        TextView textView = findViewById(R.id.scorePointTextView);
        textView.setText(roll);
    }
}
