package com.example.quizway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_category);

        Button button_geography = findViewById(R.id.geography);
        Button button_sports = findViewById(R.id.sports);

        button_geography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGeography();
            }
        });

        button_sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSports();
            }
        });
    }

    public void openGeography()
    {
        Intent intent=new Intent(SelectCategory.this,QuizGeography.class);
        startActivity(intent);
    }

    public void openSports()
    {
        Intent intent=new Intent(SelectCategory.this,QuizSports.class);
        startActivity(intent);
    }
}