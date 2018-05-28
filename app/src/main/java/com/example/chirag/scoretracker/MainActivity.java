package com.example.chirag.scoretracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int wicketA = 0;
    int overA = 0;
    int ballA = 0;
    int scoreB = 0;
    int wicketB = 0;
    int overB = 0;
    int ballB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayScoreA(int score) {
        TextView scoreView = findViewById(R.id.teamAscore);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForWicketA(int score) {
        TextView scoreView = findViewById(R.id.teamAwicket);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBallA(int score) {
        TextView scoreView = findViewById(R.id.teamAball);
        scoreView.setText(String.valueOf(score));
    }

    public void displayOverA(int score) {
        TextView scoreView = findViewById(R.id.teamAover);
        scoreView.setText(String.valueOf(score));
    }

    public void overBallA() {
        if (ballA != 5) {
            ballA++;
            displayBallA(ballA);
        } else {
            overA += 1;
            ballA = 0;
            displayBallA(ballA);
            displayOverA(overA);
        }
    }

    public void outWicketA(View view) {
        if (wicketA != 10) {
            overBallA();
            wicketA += 1;
            displayForWicketA(wicketA);
        }
    }

    public void wideRunA(View view) {
        if (wicketA != 10) {
            scoreA += 1;
            displayScoreA(scoreA);
        }
    }

    public void dotBallA(View view) {
        if (wicketA != 10) {
            overBallA();
            scoreA += 0;
            displayScoreA(scoreA);
        }
    }

    public void oneRunA(View view) {
        if (wicketA != 10) {
            overBallA();
            scoreA += 1;
            displayScoreA(scoreA);
        }
    }

    public void twoRunA(View view) {
        if (wicketA != 10) {
            overBallA();
            scoreA += 2;
            displayScoreA(scoreA);
        }
    }

    public void threeRunA(View view) {
        if (wicketA != 10) {
            overBallA();
            scoreA += 3;
            displayScoreA(scoreA);
        }
    }

    public void fourRunA(View view) {
        if (wicketA != 10) {
            overBallA();
            scoreA += 4;
            displayScoreA(scoreA);
        }
    }

    public void sixRunA(View view) {
        if (wicketA != 10) {
            overBallA();
            scoreA += 6;
            displayScoreA(scoreA);
        }
    }

    public void displayScoreB(int score) {
        TextView scoreView = findViewById(R.id.teamBscore);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForWicketB(int score) {
        TextView scoreView = findViewById(R.id.teamBwicket);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBallB(int score) {
        TextView scoreView = findViewById(R.id.teamBball);
        scoreView.setText(String.valueOf(score));
    }

    public void displayOverB(int score) {
        TextView scoreView = findViewById(R.id.teamBover);
        scoreView.setText(String.valueOf(score));
    }

    public void overBallB() {
        if (ballB != 5) {
            ballB++;
            displayBallB(ballB);
        } else {
            overB += 1;
            ballB = 0;
            displayBallB(ballB);
            displayOverB(overB);
        }
    }

    public void outWicketB(View view) {
        if (wicketB != 10) {
            overBallB();
            wicketB += 1;
            displayForWicketB(wicketB);
        }
    }

    public void wideRunB(View view) {
        if (wicketB != 10) {
            scoreB += 1;
            displayScoreB(scoreB);
        }
    }

    public void dotBallB(View view) {
        if (wicketB != 10) {
            overBallB();
            scoreB += 0;
            displayScoreB(scoreB);
        }
    }

    public void oneRunB(View view) {
        if (wicketB != 10) {
            overBallB();
            scoreB += 1;
            displayScoreB(scoreB);
        }
    }

    public void twoRunB(View view) {
        if (wicketB != 10) {
            overBallB();
            scoreB += 2;
            displayScoreB(scoreB);
        }
    }

    public void threeRunB(View view) {
        if (wicketB != 10) {
            overBallB();
            scoreB += 3;
            displayScoreB(scoreB);
        }
    }

    public void fourRunB(View view) {
        if (wicketB != 10) {
            overBallB();
            scoreB += 4;
            displayScoreB(scoreB);
        }
    }

    public void sixRunB(View view) {
        if (wicketB != 10) {
            overBallB();
            scoreB += 6;
            displayScoreB(scoreB);
        }
    }

    public void playAgain(View view) {
        scoreA = 0;
        wicketA = 0;
        overA = 0;
        ballA = 0;
        scoreB = 0;
        wicketB = 0;
        overB = 0;
        ballB = 0;
        displayBallB(ballB);
        displayOverB(overB);
        displayScoreB(scoreB);
        displayForWicketB(wicketB);
        displayBallA(ballA);
        displayOverA(overA);
        displayScoreA(scoreA);
        displayForWicketA(wicketA);
    }
}
