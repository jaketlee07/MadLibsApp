package com.example.madlibsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CreatedStory extends AppCompatActivity {

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
    public static final String TEXT12 = "text12";

    String strToDisplay = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_created_story);

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
        String text12 = intent.getStringExtra(TEXT12);

        strToDisplay = "Pizza was invented by a " + text1 + " " + text2 +
                " chef named " + text3 + ". To make a pizza you need to take a lump of " + text4 +
                ", and make a thin round " + text5 + " " + text6 + ". Then you cover it with " + text7 +
                " sauce, " + text8 + " cheese, and fresh chopped " + text9 +
                ". Next you have to bake it in a very hot " + text10 + ". When it is done, cut it into " +
                text11 + " " + text12 +  ".";
        TextView str = (TextView) findViewById(R.id.story);
        str.setText(strToDisplay);
    }

    public void share(View v)
    {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, strToDisplay);
        String chooserTitle = getString(R.string.chooser);
        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
        startActivity(chosenIntent);
    }
    public void goBack(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);
    }
}
