package com.example.o602593.scoreboard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView teamAScoreLabel;
    TextView teamBScoreLabel;
    Button left2pointsButton;
    Button left3pointsButton;
    Button left5pointsButton;
    Button right2pointsButton;
    Button right3pointsButton;
    Button right5pointsButton;
    Button resetButton;

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewsById();
    }

    private void findViewsById() {
        teamAScoreLabel = (TextView) findViewById(R.id.team_A_score);
        teamBScoreLabel = (TextView) findViewById(R.id.team_B_score);

        left2pointsButton = (Button) findViewById(R.id.left_2_points);
        left3pointsButton = (Button) findViewById(R.id.left_3_points);
        left5pointsButton = (Button) findViewById(R.id.left_5_points);

        right2pointsButton = (Button) findViewById(R.id.right_2_points);
        right3pointsButton = (Button) findViewById(R.id.right_3_points);
        right5pointsButton = (Button) findViewById(R.id.right_5_points);

        resetButton = (Button) findViewById(R.id.reset_button);

        left2pointsButton.setOnClickListener(this);
        left3pointsButton.setOnClickListener(this);
        left5pointsButton.setOnClickListener(this);
        right2pointsButton.setOnClickListener(this);
        right3pointsButton.setOnClickListener(this);
        right5pointsButton.setOnClickListener(this);
        resetButton.setOnClickListener(this);
    }

    public void updateScore(int scoreToDisplay, TextView textView)
    {
        textView.setText(String.valueOf(scoreToDisplay));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.left_2_points:
                scoreA += 2;
                updateScore(scoreA, teamAScoreLabel);
                break;
            case R.id.left_3_points:
                scoreA += 3;
                updateScore(scoreA, teamAScoreLabel);
                break;
            case R.id.left_5_points:
                scoreA += 5;
                updateScore(scoreA, teamAScoreLabel);
                break;

            case R.id.right_2_points:
                scoreB += 2;
                updateScore(scoreB, teamBScoreLabel);
                break;
            case R.id.right_3_points:
                scoreB += 3;
                updateScore(scoreB, teamBScoreLabel);
                break;
            case R.id.right_5_points:
                scoreB += 5;
                updateScore(scoreB, teamBScoreLabel);
                break;
            case R.id.reset_button:
                scoreA = 0;
                scoreB = 0;
                updateScore(scoreA, teamAScoreLabel);
                updateScore(scoreB, teamBScoreLabel);
        }
    }
}

