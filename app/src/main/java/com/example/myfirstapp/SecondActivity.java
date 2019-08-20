package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        showRandomNumber();
    }

    private static final String TOTAL_COUNT = "total_count";

    public void showRandomNumber(){
        //get text view where random number will be displayed
        TextView randomView = (TextView) findViewById(R.id.textview_random);

        //get text view where the heading is displayed
        TextView headingView = (TextView) findViewById(R.id.textview_label);

        //get count from intent extras
        int count = getIntent().getIntExtra(TOTAL_COUNT, 0);

        Random random = new Random();

        int randomInt = 0;
        if(count > 0){
            randomInt = random.nextInt(count);
        }

        //display random number
        randomView.setText(Integer.toString(randomInt));

        //substitute max value into string source for the heading and update heading
        headingView.setText(getString(R.string.random_heading, count));
    }
}
