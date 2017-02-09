package com.example.o602593.scoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView teamAScore;
    TextView teamBScore;
    Button left2pointsButton;
    Button left3pointsButton;
    Button left5pointsButton;
    Button right2pointsButton;
    Button right3pointsButton;
    Button right5pointsButton;

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewsById();
    }

    private void findViewsById() {
        teamAScore = (TextView) findViewById(R.id.team_A_score);
        teamBScore = (TextView) findViewById(R.id.team_B_score);

        left2pointsButton = (Button) findViewById(R.id.left_2_points);
        left3pointsButton = (Button) findViewById(R.id.left_3_points);
        left5pointsButton = (Button) findViewById(R.id.left_5_points);

        right2pointsButton = (Button) findViewById(R.id.right_2_points);
        right3pointsButton = (Button) findViewById(R.id.right_3_points);
        right5pointsButton = (Button) findViewById(R.id.right_5_points);

        left2pointsButton.setOnClickListener(this);
    }

    public void display(int scoreToDisplay)
    {
        teamAScore.setText(String.valueOf(scoreToDisplay));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.left_2_points:
                scoreA += 2;
                display(scoreA);
                break;
        }
    }
}

