package com.example.csc250_spring2021_mergesort;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText inputET;
    private TextView answerTV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.inputET = this.findViewById(R.id.inputET);
        this.answerTV = this.findViewById(R.id.answerTV);
    }

    public void onFactorialButtonClicked(View v)
    {
        String currValue = this.inputET.getText().toString();
        this.answerTV.setText(currValue);

    }
    public calculateFactorial(int s)
    {
        int factorial(int s)
        {
            if (s <= 1)
            {
                this.answerTV.setText(s + 1);
            }
            else
                this.answerTV.setText(s*factorial(s-1));

        }
    }

}