package com.example.demo_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        EditText email = (EditText) findViewById(R.id.editTextTextEmailAddress);
        ImageView imageView = (ImageView) findViewById(R.id.imageView4);


        Button button = (Button) findViewById(R.id.button);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this, FourthActivity.class);
                startActivity(intent);
            }
        };
        button.setOnClickListener(onClickListener);

    }
}