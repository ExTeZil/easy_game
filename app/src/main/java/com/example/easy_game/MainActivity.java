package com.example.easy_game;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int random_color(){
        int random_color = (int) (Math.random() * 7);
        return random_color;
    }
    void crate_color(int color){
        TextView textView = (TextView) findViewById(R.id.textView2);
       switch (color){
           case 0:
               textView.setTextColor(Color.RED);
               break;
           case 1:
               textView.setTextColor(Color.rgb(255, 165, 0));
               break;
           case 2:
               textView.setTextColor(Color.YELLOW);
               break;
           case 3:
               textView.setTextColor(Color.GREEN);
               break;
           case 4:
               textView.setTextColor(Color.BLUE);
               break;
           case 5:
               textView.setTextColor(Color.rgb(75, 0, 130));
               break;
           case 6:
               textView.setTextColor(Color.rgb(90, 0, 157));
               break;
       }
    }
    int random_text(){
        int random_text = (int) (Math.random() * 7);
        return random_text;
    }

    void create_text (int rand_text){
        TextView textView = (TextView) findViewById(R.id.textView2);
        switch (rand_text) {
            case 0:
                textView.setText("Червоний");
                break;
            case 1:
                textView.setText("Оранежевий");
                break;
            case 2:
                textView.setText("Жовтий");
                break;
            case 3:
                textView.setText("Зелений");
                break;
            case 4:
                textView.setText("Голубий");
                break;
            case 5:
                textView.setText("Синій");
                break;
            case 6:
                textView.setText("Фіолетовий");
                break;

        }
    }



    public void click(View view) {
        int color = random_color();
        crate_color(color);
        int text = random_text();
        create_text(text);
    }
}