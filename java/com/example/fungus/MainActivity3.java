
package com.example.fungus;

import androidx.appcompat.app.AppCompatActivity;

import android. content. Intent;
import android.view.View;
import android. widget. Button;
import android.os.Bundle;

public class MainActivity3 extends AppCompatActivity {
    private Button button1;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        button1 = (Button) findViewById(R.id.button_play);
        button2 = (Button) findViewById(R.id.button_settings);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(intent);
            }
        });

    }

}