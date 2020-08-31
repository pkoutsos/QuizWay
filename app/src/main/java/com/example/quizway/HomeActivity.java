package com.example.quizway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button button_play = findViewById(R.id.play);
        Button button_exit = findViewById(R.id.exit);

        button_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGame();
            }
        });

        button_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExit();
            }
        });
    }

    public void openGame()
    {
        Intent intent=new Intent(HomeActivity.this,SelectCategory.class);
        startActivity(intent);
    }

    public void openExit()
    {
        finish();
        System.exit(0);
    }
}