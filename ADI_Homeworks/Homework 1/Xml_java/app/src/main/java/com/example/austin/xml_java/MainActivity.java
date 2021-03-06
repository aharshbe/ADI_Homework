package com.example.austin.xml_java;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button Bluebutton = (Button) findViewById(R.id.Bluebutton);
        Button Purplebutton = (Button) findViewById(R.id.Purplebutton);
        Button Greybutton = (Button) findViewById(R.id.Greybutton);

        //With Joon's help! (He explained the importance of the final portion

        final TextView textView = (TextView) findViewById(R.id.textView);

        View.OnClickListener TurnsButtonBlue = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView ButtonColorBlue = (TextView) findViewById(R.id.Bluebutton);
                textView.setTextColor(Color.BLUE);


            }

        };


        View.OnClickListener TurnsButtonPurple = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView ButtonColorPurple = (TextView) findViewById(R.id.Purplebutton);
                textView.setTextColor(Color.MAGENTA);

            }

        };

        View.OnClickListener TurnsButtonGrey = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView ButtonColorGrey = (TextView) findViewById(R.id.Greybutton);
                textView.setTextColor(Color.GRAY);

            }

        };

        Bluebutton.setOnClickListener(TurnsButtonBlue);
        Purplebutton.setOnClickListener(TurnsButtonPurple);
        Greybutton.setOnClickListener(TurnsButtonGrey);

    }
}










