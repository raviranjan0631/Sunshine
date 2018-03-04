package com.example.user.sunshine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textViews;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViews = (TextView)findViewById(R.id.tv_weather_data);
        String args[] = {"12 degree cold", "kha hai yeah", "gojo"};
        for(String arg : args){
            textViews.append(arg+"\n");
        }
    }
}
