package com.example.game_13042022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    public void randomNumberGenerator()
    {
        Random rand = new Random();
        randomNumber = rand.nextInt( 20)+1;

    }
    public void tebakan(View view)
    {
        String message;
        EditText editTextNumber = (EditText) findViewById(R.id.editTextNumber);
        int tebakAngka = Integer.parseInt(editTextNumber.getText().toString());
        if(tebakAngka < randomNumber)
            message="Naikkan angka!";
        else if(tebakAngka > randomNumber)
            message="Turunkan angka!"
        else
        {
            message="Iya, benar!";
            randomNumberGenerator();
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }
}