package com.example.madlibsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CreatedStory2 extends AppCompatActivity {
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_created_story2);

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

        String strToDisplay = "Schools are closed at Easter time and all the " + text1 + " get " + text2 + " weeks off. The " +
                text3 + "teachers also get a vacation. There are alot of things to do on Easter Vacation. Some kids hang around and watch the " +
                text4 + ". Others go outside and play " + text5 + ". Little kids will color " + text6 + " eggs. The use a package of "+
                text7 + " dye. They pour it in a bowl full of " + text8 + ". Then they dip the " + text9 + " in the bowl and then rinse it off. After the " +
                text10 + " are dried, you place them in the Easter" + text11 + " along with a " + text12 + " chocolate bunny!";
        TextView str = (TextView) findViewById(R.id.story);
        str.setText(strToDisplay);
    }
}
