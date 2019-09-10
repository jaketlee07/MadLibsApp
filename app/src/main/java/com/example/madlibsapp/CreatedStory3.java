package com.example.madlibsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CreatedStory3 extends AppCompatActivity {

    public static final String TEXT1 = "text1";
    public static final String TEXT2 = "text2";
    public static final String TEXT3 = "text3";
    public static final String TEXT4 = "text4";
    public static final String TEXT5 = "text5";
    public static final String TEXT6 = "text6";
    public static final String TEXT7 = "text7";
    public static final String TEXT8 = "text8";
    public static final String TEXT9 = "text9";
    public static final String TEXT10 = "text10";
    public static final String TEXT11 = "text11";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_created_story3);

        Intent intent = getIntent();

        String text1 = intent.getStringExtra(TEXT1);
        String text2 = intent.getStringExtra(TEXT2);
        String text3 = intent.getStringExtra(TEXT3);
        String text4 = intent.getStringExtra(TEXT4);
        String text5 = intent.getStringExtra(TEXT5);
        String text6 = intent.getStringExtra(TEXT6);
        String text7 = intent.getStringExtra(TEXT7);
        String text8 = intent.getStringExtra(TEXT8);
        String text9 = intent.getStringExtra(TEXT9);
        String text10 = intent.getStringExtra(TEXT10);
        String text11 = intent.getStringExtra(TEXT11);

        String strToDisplay = text1 + ", " + text2 + " years old was recently exposed for murder. On " + text3 +
                " of last week, " + text1 + " was caught by the " + text4 + " police at " + text5 + "'s " +
                text6 + " house. " + text1 + " was found with " + text7 + " blood on their hands. The murder weapon used was a " +
                text8 + " " + text9 + " which was stolen from teh local Walmart. It is reported that " + text1 +
                " is setenced for " + text10 + " years in the " + text11 + " jail.";
        TextView str = (TextView) findViewById(R.id.story);
        str.setText(strToDisplay);
    }
}
