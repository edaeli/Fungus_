package com.example.fungus;

import androidx.appcompat.app.AppCompatActivity;

import android. content. Intent;
import android.view.View;
import android. widget. Button;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    private Button button2;
    private Button button3;

    // change 1
    // change 2
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2 = (Button) findViewById(R.id.button_login);
        button3 = (Button) findViewById(R.id.button_register);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,MainActivity5.class);
                startActivity(intent);
            }
        });
    }
}