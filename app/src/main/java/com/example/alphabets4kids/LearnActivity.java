package com.example.alphabets4kids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class LearnActivity extends AppCompatActivity {

    ImageButton Prev,Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        Prev= findViewById(R.id.prevBtn);
        Next = findViewById(R.id.nextBtn);
        final int[] Count = {1};
        Prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Count[0] > 1)
                {
                    Count[0]--;
                    SetAssets(Count[0]);
                }
            }
        });

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Count[0] < 9)
                {
                    Count[0]++;
                    SetAssets(Count[0]);
                }
            }
        });

    }


    public void back(View view) {
        startActivity(new Intent(LearnActivity.this, MainActivity.class));
    }



    public void SetAssets (int c)
    {
        TextView Digit = findViewById(R.id.digit);
        TextView Num = findViewById(R.id.num);
        ImageView Image = findViewById (R.id.image);
        switch (c)
        {
            case 1:
                Digit.setText(R.string.Digit1);
                Num.setText(R.string.Num1);
                Image.setImageResource(R.drawable.one);
                break;
            case 2:
                Digit.setText(R.string.Digit2);
                Num.setText(R.string.Num2);
                Image.setImageResource(R.drawable.two);
                break;
            case 3:
                Digit.setText(R.string.Digit3);
                Num.setText(R.string.Num3);
                Image.setImageResource(R.drawable.three);
                break;
            case 4:
                Digit.setText(R.string.Digit4);
                Num.setText(R.string.Num4);
                Image.setImageResource(R.drawable.four);
                break;
            case 5:
                Digit.setText(R.string.Digit5);
                Num.setText(R.string.Num5);
                Image.setImageResource(R.drawable.five);
                break;
            case 6:
                Digit.setText(R.string.Digit6);
                Num.setText(R.string.Num6);
                Image.setImageResource(R.drawable.six);
                break;
            case 7:
                Digit.setText(R.string.Digit7);
                Num.setText(R.string.Num7);
                Image.setImageResource(R.drawable.seven);
                break;
            case 8:
                Digit.setText(R.string.Digit8);
                Num.setText(R.string.Num8);
                Image.setImageResource(R.drawable.eight);
                break;
            case 9:
                Digit.setText(R.string.Digit9);
                Num.setText(R.string.Num9);
                Image.setImageResource(R.drawable.nine);
                break;
        }
    }
}