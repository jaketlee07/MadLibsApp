package com.example.madlibsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void storyOne(View v)
    {
        Intent intent = new Intent(this, StoryOne.class);

        startActivity(intent);
    }
    public void storyTwo(View v)
    {
        Intent intent = new Intent(this, StoryOne.class);

        startActivity(intent);
    }
    public void storyThree(View v)
    {
        Intent intent = new Intent(this, StoryOne.class);


        startActivity(intent);
    }
}
