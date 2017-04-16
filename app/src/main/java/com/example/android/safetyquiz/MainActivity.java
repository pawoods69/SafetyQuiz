package com.example.android.safetyquiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScoreView = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);
        mButtonChoice4 = (Button) findViewById(R.id.choice4);

        updateQuestion();

        //Start of Listener for Button 1
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Data for Button

                if (mButtonChoice1.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if(mQuestionNumber<=9){
                        updateQuestion();
                    } else {
                        Toast.makeText(MainActivity.this, "Quiz Over! Your score is " + mScore + " Points.", Toast.LENGTH_SHORT).show();
                    }
                    //This is the TOAST for the answer
                    Toast.makeText(MainActivity.this, "CORRECT", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Sorry That's Not Correct", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }


            }
        });

        //End Listener Button1

        //Start of Listener for Button 2
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Data for Button

                if (mButtonChoice2.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if(mQuestionNumber<=9){
                        updateQuestion();
                    } else {
                        Toast.makeText(MainActivity.this, "Quiz Over! Your score is " + mScore + " Points.", Toast.LENGTH_SHORT).show();
                    }
                    //This is the TOAST for the answer
                    Toast.makeText(MainActivity.this, "CORRECT", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Sorry That's Not Correct", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }


            }
        });

        //End Listener Button2

        //Start of Listener for Button 3
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Data for Button

                if (mButtonChoice3.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if(mQuestionNumber<=9){
                        updateQuestion();
                    } else {
                        Toast.makeText(MainActivity.this, "Quiz Over! Your score is " + mScore + " Points.", Toast.LENGTH_SHORT).show();
                    }

                    //This is the TOAST for the answer
                    Toast.makeText(MainActivity.this, "CORRECT", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Sorry That's Not Correct", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }


            }
        });

        //End Listener Button3

        //Start of Listener for Button 4
        mButtonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Data for Button

                if (mButtonChoice4.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if(mQuestionNumber<=9){
                        updateQuestion();
                    } else {
                        Toast.makeText(MainActivity.this, "Quiz Over! Your score is " + mScore + " Points.", Toast.LENGTH_SHORT).show();
                    }
                    //This is the TOAST for the answer
                    Toast.makeText(MainActivity.this, "CORRECT", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Sorry That's Not Correct", Toast.LENGTH_SHORT).show();
                    updateQuestion();

                }


            }
        });
//        Toast.makeText(MainActivity.this, "Quiz Over! Your score is " + mScore + " Points.", Toast.LENGTH_SHORT).show();
        //End Listener Button4
    }

    private void updateQuestion() {
        mQuestionView.setText(mQuestionLibrary.getQuestions(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;



    }

    private void updateScore(int point) {
        mScoreView.setText("" + mScore);



    }

    public void restart (View view) {
        //Toast then restart
        Toast.makeText(MainActivity.this, "Quiz Over! Your score is " + mScore + " Points.", Toast.LENGTH_SHORT).show();
        updateQuestion();



    }
}
