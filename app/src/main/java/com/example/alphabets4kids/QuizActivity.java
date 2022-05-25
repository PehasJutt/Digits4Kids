package com.example.alphabets4kids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {
    Button opt1,opt2,opt3,skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        opt1=findViewById(R.id.opt1);
        opt2=findViewById(R.id.opt2);
        opt3=findViewById(R.id.opt3);
        skip = findViewById(R.id.skip);
        final int[] count = {1};
        final int[] score = {0};

        opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count[0] == 2 || count[0] == 4)
                {
                    score[0]++;
                    updateScore(score[0]);
                    if (count[0] == 5)
                    {
                        String s = String.valueOf(score[0]);
                        Intent intent = new Intent(QuizActivity.this,ScoreBoard.class);
                        intent.putExtra("score", s);
                        startActivity(intent);
                    }
                    else
                    {
                        count[0]++;
                        SetAssets(count[0]);
                    }

                }
                else if (count[0]<5)
                {
                    count[0]++;
                    SetAssets(count[0]);
                }
                else
                {
                    String s = String.valueOf(score[0]);
                    Intent intent = new Intent(QuizActivity.this,ScoreBoard.class);
                    intent.putExtra("score", s);
                    startActivity(intent);
                }

            }
        });

        opt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count[0] == 1)
                {
                    score[0]++;
                    updateScore(score[0]);
                    if (count[0] == 5)
                    {
                        String s = String.valueOf(score[0]);
                        Intent intent = new Intent(QuizActivity.this,ScoreBoard.class);
                        intent.putExtra("score", s);
                        startActivity(intent);
                    }
                    else
                    {
                        count[0]++;
                        SetAssets(count[0]);
                    }

                }
                else if (count[0]<5)
                {
                    count[0]++;
                    SetAssets(count[0]);
                }
                else
                {
                    String s = String.valueOf(score[0]);
                    Intent intent = new Intent(QuizActivity.this,ScoreBoard.class);
                    intent.putExtra("score", s);
                    startActivity(intent);
                }
            }
        });

        opt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count[0] == 3 || count[0] == 5)
                {
                    score[0]++;
                    updateScore(score[0]);
                    if (count[0] == 5)
                    {
                        String s = String.valueOf(score[0]);
                        Intent intent = new Intent(QuizActivity.this,ScoreBoard.class);
                        intent.putExtra("score", s);
                        startActivity(intent);
                    }
                    else
                    {
                        count[0]++;
                        SetAssets(count[0]);
                    }

                }
                else if (count[0]<5)
                {
                    count[0]++;
                    SetAssets(count[0]);
                }
                else
                {
                    String s = String.valueOf(score[0]);
                    Intent intent = new Intent(QuizActivity.this,ScoreBoard.class);
                    intent.putExtra("score", s);
                    startActivity(intent);
                }
            }
        });

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count[0]<5)
                {
                    count[0]++;
                    SetAssets(count[0]);
                }
                else
                {
                    String s = String.valueOf(score[0]);
                    Intent intent = new Intent(QuizActivity.this,ScoreBoard.class);
                    intent.putExtra("score", s);
                    startActivity(intent);
                }
            }
        });

    }

    public void updateScore (int s)
    {
        TextView score = findViewById(R.id.Score);
        switch (s)
        {
            case 1:
                score.setText("1 / 5");
                break;
            case 2:
                score.setText("2 / 5");
                break;
            case 3:
                score.setText("3 / 5");
                break;
            case 4:
                score.setText("4 / 5");
                break;
            case 5:
                score.setText("5 / 5");
                break;
        }

    }

    public void SetAssets (int c)
    {
        TextView Num = findViewById(R.id.Qnum);
        ImageView Image = findViewById(R.id.QuestImg);
        Button opt1 = findViewById(R.id.opt1);
        Button opt2 = findViewById(R.id.opt2);
        Button opt3 = findViewById(R.id.opt3);
        switch (c)
        {
            case 1:
                Num.setText(R.string.Q1);
                Image.setImageResource(R.drawable.seven);
                opt1.setText(R.string.Opt1);
                opt2.setText(R.string.Opt7);
                opt3.setText(R.string.Opt5);

                break;
            case 2:
                Num.setText(R.string.Q2);
                Image.setImageResource(R.drawable.eight);
                opt1.setText(R.string.Opt8);
                opt2.setText(R.string.Opt6);
                opt3.setText(R.string.Opt5);

                break;
            case 3:
                Num.setText(R.string.Q3);
                Image.setImageResource(R.drawable.six);
                opt1.setText(R.string.Opt8);
                opt2.setText(R.string.Opt7);
                opt3.setText(R.string.Opt6);

                break;
            case 4:
                Num.setText(R.string.Q4);
                Image.setImageResource(R.drawable.one);
                opt1.setText(R.string.Opt1);
                opt2.setText(R.string.Opt5);
                opt3.setText(R.string.Opt7);

                break;
            case 5:
                Num.setText(R.string.Q5);
                Image.setImageResource(R.drawable.five);
                opt1.setText(R.string.Opt7);
                opt2.setText(R.string.Opt1);
                opt3.setText(R.string.Opt5);

                break;

        }
    }
}