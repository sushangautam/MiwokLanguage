package com.example.miwoklanguage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //private void openNumbersActivity(View view){
    //    Intent i = new Intent(this, NumbersActivity.class);
    //    startActivity(i); }

    // Find the View that shows the numbers category
    TextView numbers = (TextView) findViewById(R.id.numbers);
    TextView colors = (TextView) findViewById(R.id.colors);
    TextView phrases = (TextView) findViewById(R.id.phrases);
    TextView family = (TextView) findViewById(R.id.family);


    // Set a click listener on that View
    numbers.setOnClickListener(new View.OnClickListener() {
        // The code in this method will be executed when the numbers View is clicked on.
        @Override
        public void onClick(View view) {
            Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
            startActivity(numbersIntent);
        }
    });

        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(numbersIntent);
            }
        });

        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(numbersIntent);
            }
        });

        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(numbersIntent);
            }
        });

    }



}
