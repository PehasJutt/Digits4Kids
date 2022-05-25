package com.example.alphabets4kids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ScoreBoard extends AppCompatActivity {

    TextView score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_board);
        score = findViewById(R.id.OScr);
        Intent intent = getIntent();
        score.setText(intent.getStringExtra("score"));
    }

    public void backHome(View view) {
        startActivity(new Intent(ScoreBoard.this,MainActivity.class));
    }
}