package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score = 0;

    // This method is called when the twoPoints button is clicked
    public void threePoints (View v) {
        score = (score + 3);
        displayForTeamA(score);
    }

    // adds 2 points to score
    public void twoPoints (View view) {
        score = (score +2);
        displayForTeamA(score);
    }

    // adds 1 point to score
    public void freePoint (View view) {
        score = (score + 1);
        displayForTeamA(score);
    }

    // resets score
    public void reset (View view) {
        score = (0);
        displayForTeamA(score);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}

