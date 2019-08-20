package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Show a toast
     * @param view -- the view that is clicked
     */

    public void toastMe(View view){
        //Toast myToast = Toast.makeText(this, message, duration);
        Toast myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT);
        myToast.show();
    }

    public void countMe(View view){
        //get the text view
        TextView showCountTextView = (TextView) findViewById(R.id.textView);

        //get value of text view.
        String countString = showCountTextView.getText().toString();
        Integer count = Integer.parseInt(countString);
        count++;

        //display new value in the text
        showCountTextView.setText(count.toString());
    }

    private static final String TOTAL_COUNT = "total_count";

    public void randomMe(View view){
        //create an Intent to start second activity
        Intent randomIntent = new Intent(this, SecondActivity.class);

        //get text view that shows the count
        TextView getNum = (TextView) findViewById(R.id.textView);

        //get value of text view
        String numString = getNum.getText().toString();

        //convert count to an int
        int count = Integer.parseInt(numString);

        //add count to the extras for intent
        randomIntent.putExtra(TOTAL_COUNT, count);

        //start activity
        startActivity(randomIntent);
    }
}
