package com.example.android.footballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    int redCardCountTeamA = 0;
    int redCardCountTeamB = 0;

    int yellowCardCountTeamA = 0;
    int yellowCardCountTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays red card count for Team A.
     */
    public void displayRedCardCountForTeamA(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red_card_count);
        scoreView.setText(String.valueOf(foul));
    }

    /**
     * Displays yellow card count for Team A.
     */
    public void displayYellowCardCountForTeamA(int count) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow_card_count);
        scoreView.setText(String.valueOf(count));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays red card count for Team A.
     */
    public void displayRedCardCountForTeamB(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red_card_count);
        scoreView.setText(String.valueOf(foul));
    }

    /**
     * Displays yellow card count for Team A.
     */
    public void displayYellowCardCountForTeamB(int count) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow_card_count);
        scoreView.setText(String.valueOf(count));
    }

    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void addOneRedCardForTeamA(View view) {
        redCardCountTeamA = redCardCountTeamA + 1;
        displayRedCardCountForTeamA(redCardCountTeamA);
    }

    public void addOneYellowCardForTeamA(View view) {
        yellowCardCountTeamA = yellowCardCountTeamA + 1;
        displayYellowCardCountForTeamA(yellowCardCountTeamA);
    }

    public void addOneForTeamB(View view) {
        scoreTeamB= scoreTeamB+ 1;
        displayForTeamB(scoreTeamB);
    }

    public void addOneRedCardForTeamB(View view) {
        redCardCountTeamB= redCardCountTeamB+ 1;
        displayRedCardCountForTeamB(redCardCountTeamB);
    }

    public void addOneYellowCardForTeamB(View view) {
        yellowCardCountTeamB= yellowCardCountTeamB+ 1;
        displayYellowCardCountForTeamB(yellowCardCountTeamB);
    }

    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;

        yellowCardCountTeamA = 0;
        yellowCardCountTeamB = 0;

        redCardCountTeamA = 0;
        redCardCountTeamB = 0;

        displayForTeamA(scoreTeamA);
        displayYellowCardCountForTeamA(yellowCardCountTeamA);
        displayRedCardCountForTeamA(redCardCountTeamA);

        displayForTeamB(scoreTeamB);
        displayYellowCardCountForTeamB(yellowCardCountTeamB);
        displayRedCardCountForTeamB(redCardCountTeamB);
    }


}
