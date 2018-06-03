package com.example.dkish.randompaymentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import java.util.Random;


public class MainActivity extends AppCompatActivity {
    int S=0;
    Random rand = new Random();
    int generated = rand.nextInt(100);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView target = (TextView) findViewById(R.id.randomamt);
        target.setText(generated+"");
    }
    public void display(int number) {
        TextView amount = (TextView) findViewById(R.id.change);
        amount.setText(number+"");
        if(number==generated){
            TextView end = (TextView) findViewById(R.id.useramt);
            end.setText("Congratulations! You have payed the amount.");
        }
        else if(number>generated){
            TextView end = (TextView) findViewById(R.id.useramt);
            end.setText("You have made a blunder. Start the app again.");
        }

    }

    public void addOne(View view){
        S+=1;
        display(S);
    }
    public void addTwo(View view){
        S+=2;
        display(S);
        }
    public void addFive(View view){
        S+=5;
        display(S);
    }
    public void addTen(View view){
        S+=10;
        display(S);
    }


}


