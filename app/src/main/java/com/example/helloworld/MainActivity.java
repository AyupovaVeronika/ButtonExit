package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button button_click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void b_exitClick(View view) {
       // TextView  = (TextView) findViewById(R.id.t_fio);
        //button_click  = (Button) findViewById(R.id.b_exit);
        System.exit(0);
    }
}