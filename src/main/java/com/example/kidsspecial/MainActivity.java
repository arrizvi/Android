package com.example.kidsspecial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=(Button) findViewById(R.id.btnstart);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent alphaIntent=new Intent(MainActivity.this,Alphabetlessor.class);
                startActivity(alphaIntent);
            }
        });
    }
}