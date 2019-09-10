package com.example.madlibsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class StoryTwo extends AppCompatActivity {

    String[] adjectiveArray = {"spicy", "bitter", "wet", "soft", "dry", "green", "blue", "sticky", "rough", "icy"};
    String[] nounArray = {"potato", "park", "paper", "dish", "bottle", "pencil", "calculator", "lamp", "phone", "wallet"};
    String[] numberArray = {"1", "50", "765", "4564", "6", "420", "1000", "42", "4", "98"};
    String[] pluralnounArray = {"potatoes", "parks", "papers", "dishes", "bottles", "pencils", "calculators", "lamps", "phones", "wallets"};
    String[] liquidArray = {"sprite", "milk", "coke", "ink", "chocolate milk", "oil", "gasoline", "root beer", "water", "98"};
    String[] colorArray = {"blue", "red", "purple", "pink", "red", "green", "black", "white", "grey", "yellow"};
    String[] gameArray = {"Monopoly", "Tag", "Tic-Tac-Toe", "Scrabble", "Pokemon", "Mario Kart", "Tetris", "Piano Tiles", "Super Mario", "Minecraft"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_two);
    }

    public void createStory(View v)
    {

        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        EditText editText3 = (EditText) findViewById(R.id.editText3);
        EditText editText4 = (EditText) findViewById(R.id.editText4);
        EditText editText5 = (EditText) findViewById(R.id.editText5);
        EditText editText6 = (EditText) findViewById(R.id.editText6);
        EditText editText7 = (EditText) findViewById(R.id.editText7);
        EditText editText8 = (EditText) findViewById(R.id.editText8);
        EditText editText9 = (EditText) findViewById(R.id.editText9);
        EditText editText10 = (EditText) findViewById(R.id.editText10);
        EditText editText11 = (EditText) findViewById(R.id.editText11);
        EditText editText12 = (EditText) findViewById(R.id.editText12);

        String text1 = editText.getText().toString();
        String text2 = editText2.getText().toString();
        String text3 = editText3.getText().toString();
        String text4 = editText4.getText().toString();
        String text5 = editText5.getText().toString();
        String text6 = editText6.getText().toString();
        String text7 = editText7.getText().toString();
        String text8 = editText8.getText().toString();
        String text9 = editText9.getText().toString();
        String text10 = editText10.getText().toString();
        String text11 = editText11.getText().toString();
        String text12 = editText12.getText().toString();

        Intent intent = new Intent(this, CreatedStory2.class);

        intent.putExtra(CreatedStory.TEXT1, text1);
        intent.putExtra(CreatedStory.TEXT2, text2);
        intent.putExtra(CreatedStory.TEXT3, text3);
        intent.putExtra(CreatedStory.TEXT4, text4);
        intent.putExtra(CreatedStory.TEXT5, text5);
        intent.putExtra(CreatedStory.TEXT6, text6);
        intent.putExtra(CreatedStory.TEXT7, text7);
        intent.putExtra(CreatedStory.TEXT8, text8);
        intent.putExtra(CreatedStory.TEXT9, text9);
        intent.putExtra(CreatedStory.TEXT10, text10);
        intent.putExtra(CreatedStory.TEXT11, text11);
        intent.putExtra(CreatedStory.TEXT12, text12);

        startActivity(intent);
    }

    public void random1(View v)
    {
        EditText editText = (EditText) findViewById(R.id.editText);
        Random rand = new Random();
        int r = rand.nextInt(10);
        editText.setText(pluralnounArray[r]);
    }

    public void random2(View v)
    {
        EditText editText = (EditText) findViewById(R.id.editText2);
        Random rand = new Random();
        int r = rand.nextInt(10);
        editText.setText(numberArray[r]);
    }

    public void random3(View v)
    {
        EditText editText = (EditText) findViewById(R.id.editText3);
        Random rand = new Random();
        int r = rand.nextInt(10);
        editText.setText(adjectiveArray[r]);
    }

    public void random4(View v)
    {
        EditText editText = (EditText) findViewById(R.id.editText4);
        Random rand = new Random();
        int r = rand.nextInt(10);
        editText.setText(nounArray[r]);
    }

    public void random5(View v)
    {
        EditText editText = (EditText) findViewById(R.id.editText5);
        Random rand = new Random();
        int r = rand.nextInt(10);
        editText.setText(gameArray[r]);
    }

    public void random6(View v)
    {
        EditText editText = (EditText) findViewById(R.id.editText6);
        Random rand = new Random();
        int r = rand.nextInt(10);
        editText.setText(adjectiveArray[r]);
    }

    public void random7(View v)
    {
        EditText editText = (EditText) findViewById(R.id.editText7);
        Random rand = new Random();
        int r = rand.nextInt(10);
        editText.setText(colorArray[r]);
    }

    public void random8(View v)
    {
        EditText editText = (EditText) findViewById(R.id.editText8);
        Random rand = new Random();
        int r = rand.nextInt(10);
        editText.setText(liquidArray[r]);
    }

    public void random9(View v)
    {
        EditText editText = (EditText) findViewById(R.id.editText9);
        Random rand = new Random();
        int r = rand.nextInt(10);
        editText.setText(nounArray[r]);
    }

    public void random10(View v)
    {
        EditText editText = (EditText) findViewById(R.id.editText10);
        Random rand = new Random();
        int r = rand.nextInt(10);
        editText.setText(pluralnounArray[r]);
    }

    public void random11(View v)
    {
        EditText editText = (EditText) findViewById(R.id.editText11);
        Random rand = new Random();
        int r = rand.nextInt(10);
        editText.setText(nounArray[r]);
    }

    public void random12(View v)
    {
        EditText editText = (EditText) findViewById(R.id.editText12);
        Random rand = new Random();
        int r = rand.nextInt(10);
        editText.setText(adjectiveArray[r]);
    }

}
