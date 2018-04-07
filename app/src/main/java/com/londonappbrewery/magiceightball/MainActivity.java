package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAsk = (Button) findViewById(R.id.buttonAsk);
        final ImageView imageBall = (ImageView) findViewById(R.id.imageBall);
        final int[] ballArray = new int[] {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        buttonAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Magic ball", "Button has been processed");

                Random random = new Random();
                int number = random.nextInt(5);

                imageBall.setImageResource(ballArray[number]);

            }
        });



    }
}
