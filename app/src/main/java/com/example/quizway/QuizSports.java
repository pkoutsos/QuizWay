package com.example.quizway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuizSports extends AppCompatActivity {

    LibrarySports librarySports=new LibrarySports();

    private String answer;
    private int score=0;
    private int number_of_question=0;

    TextView question;
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_geography);

        question = findViewById(R.id.question_geography);
        b1 = findViewById(R.id.select_1);
        b2 = findViewById(R.id.select_2);
        b3 = findViewById(R.id.select_3);
        b4 = findViewById(R.id.select_4);

        updateQuestion();

        //Button one
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText()==answer)
                {
                    score+=1;
                }
                updateQuestion();
            }
        });

        //Button two
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText()==answer)
                {
                    score+=1;
                }
                updateQuestion();
            }
        });

        //Button three
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3.getText()==answer)
                {
                    score+=1;
                }
                updateQuestion();
            }
        });

        //Button four
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4.getText()==answer)
                {
                    score+=1;
                }
                updateQuestion();
            }
        });

    }

    private void updateQuestion()
    {

        if (number_of_question==librarySports.question.length)
        {
            Intent intent=new Intent(QuizSports.this,FinalScore.class);
            intent.putExtra("Value",score);
            startActivity(intent);
        }
        else {
            question.setText(librarySports.getQuestion(number_of_question));
            b1.setText(librarySports.getSelect1(number_of_question));
            b2.setText(librarySports.getSelect2(number_of_question));
            b3.setText(librarySports.getSelect3(number_of_question));
            b4.setText(librarySports.getSelect4(number_of_question));

            answer = librarySports.correct(number_of_question);

            number_of_question++;
        }

    }







}