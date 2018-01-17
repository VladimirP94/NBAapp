package com.example.android.nbaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button login = (Button) findViewById(R.id.button_login);
       login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent start=(new Intent(Main2Activity.this, MainActivity.class));
                startActivity(start);
            }
        });
    }
}