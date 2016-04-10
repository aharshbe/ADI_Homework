package com.example.ahars.first_deliverable;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener gradesClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView);
                EditText editText = (EditText) findViewById(R.id.editText);
                Toast.makeText(MainActivity.this, "You clicked Grade!", Toast.LENGTH_SHORT).show();
                textView.setText(editText.getText());
                textView.setTextColor(Color.MAGENTA);
            }
        };
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(gradesClick);

        View.OnClickListener passFail = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView);
                EditText editText = (EditText) findViewById(R.id.editText);
                Toast.makeText(MainActivity.this, "You clicked Pass or Fail!", Toast.LENGTH_SHORT).show();
                textView.setText(editText.getText());
                textView.setTextColor(Color.BLUE);
            }
        };
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(passFail);

        View.OnClickListener fiveTimes = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView textView = (TextView) findViewById(R.id.textView);
                EditText editText = (EditText) findViewById(R.id.editText);
                Toast.makeText(MainActivity.this, "You clicked 5 times!", Toast.LENGTH_SHORT).show();
                textView.setText(editText.getText());
                textView.setTextColor(Color.GREEN);

            }
        };
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(fiveTimes);





}




    }


















