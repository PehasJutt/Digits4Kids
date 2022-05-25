package com.example.alphabets4kids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void openLearnPage(View view) {
        startActivity(new Intent(MainActivity.this, LearnActivity.class));
    }

    public void openGitHub(View view) {
        String url = "https://github.com/PehasJutt/Digits4Kids";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void openQuizPage(View view) {
        startActivity(new Intent(MainActivity.this, QuizActivity.class));
    }
    //Functions goes here
}