package com.example.demo_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageButton slides = (ImageButton) findViewById(R.id.slide);

        ImageView dot1 = (ImageView) findViewById(R.id.dot1);
        ImageView dot2 = (ImageView) findViewById(R.id.dot2);
        ImageView dot3 = (ImageView) findViewById(R.id.dot3);
        TextView textView = (TextView) findViewById(R.id.textView4);

        Button button = (Button) findViewById(R.id.button_next);





        View.OnClickListener onClickListener = new View.OnClickListener() {
            final int[] tick = {0};
            @Override
            public void onClick(View v) {
                if (tick[0] == 0){
                    slides.setImageResource(R.drawable.secondslide);
                    dot1.setImageResource(R.drawable.ellipse_3);
                    dot2.setImageResource(R.drawable.ellipse_1);
                    textView.setText("Вы быстро узнаете о результатах");
                    tick[0] += 1;
                } else if (tick[0] == 1) {
                    slides.setImageResource(R.drawable.thirdslide);
                    dot1.setImageResource(R.drawable.ellipse_3);
                    dot2.setImageResource(R.drawable.ellipse_3);
                    dot3.setImageResource(R.drawable.ellipse_1);
                    textView.setText("Наши врачи всегда наблюдают за вашими показателями здоровья");
                    button.setText("Завершить");
                    tick[0] += 1;
                }


            }
        };
        slides.setOnClickListener(onClickListener);



        View.OnClickListener listenerSkip = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);


            }
        };
        button.setOnClickListener(listenerSkip);



    }
    public void startNewActivity(View v) {

    }
}