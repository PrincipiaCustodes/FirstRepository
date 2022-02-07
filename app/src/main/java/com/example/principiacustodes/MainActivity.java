package com.example.principiacustodes;

import android.view.View;

import android.widget.Button;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    /*final Button button0 = (Button)findViewById(R.id.button0);
    final Button button1 = (Button)findViewById(R.id.button1);*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*@Override
    public void onClick(View view) {
        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        switch (view.getId()) {
            case R.id.button0:
                Toast toast0 = Toast.makeText(getApplicationContext(), "Boris", Toast.LENGTH_LONG);
                toast0.show();
            break;
            case R.id.button1:
                Toast toast1 = Toast.makeText(getApplicationContext(), "Pasternack", Toast.LENGTH_LONG);
                toast1.show();
            break;
        }*/

    }
}