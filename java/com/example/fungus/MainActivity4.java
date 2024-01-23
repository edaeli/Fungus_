package com.example.fungus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android. content. Intent;
import android.view.View;
import android. widget. Button;
import android.os.Bundle;
public class MainActivity4 extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        button = (Button) findViewById(R.id.button_logout);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity4.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}