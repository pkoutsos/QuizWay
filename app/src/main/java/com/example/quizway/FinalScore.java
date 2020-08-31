package com.example.quizway;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class FinalScore extends AppCompatActivity {

    TextView score;


    @SuppressLint("SetTextI18n")
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_score);

        score=findViewById(R.id.score);
        int v=(Objects.requireNonNull(getIntent().getExtras()).getInt("Value"));
        System.out.println(v);
        score.setText(" "+v);

        Button button_play_again = findViewById(R.id.play_again);
        Button button_close_app = findViewById(R.id.close_app);

        button_play_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGameAgain();
            }
        });

        button_close_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCloseApp();
            }
        });
    }

    public void openGameAgain()
    {
        Intent intent=new Intent(FinalScore.this,SelectCategory.class);
        startActivity(intent);
    }

    public void openCloseApp()
    {
        FinalScore.this.finish();
        System.exit(0);
    }

}