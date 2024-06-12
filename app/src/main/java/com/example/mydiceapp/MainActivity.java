package com.example.mydiceapp;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView image1 = findViewById(R.id.image1);
        final int [] diceimg = {R.drawable.dc1, R.drawable.dice6,R.drawable.dice3, R.drawable.dice2,R.drawable.dice5,R.drawable.dice6};

        Button obj = findViewById(R.id.button);
        obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random obj1 = new Random();
                int randomno = obj1.nextInt(6);

                image1.setImageResource(diceimg[randomno]);
                Toast.makeText(MainActivity.this, "Your dice is rolled for you", Toast.LENGTH_SHORT ) .show();

            }

        });





    }
}