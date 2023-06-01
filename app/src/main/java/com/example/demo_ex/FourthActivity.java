package com.example.demo_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.chaos.view.PinView;

public class FourthActivity extends AppCompatActivity {


        protected void onCreate(Bundle savedInstanceState) {

            PinView pinView = (PinView) findViewById(R.id.);
            pinView.requestFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            inputMethodManager.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);

            pinView.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    if (s.toString().length() == 4) {
                        Toast.makeText(getApplicationContext(), "Text", Toast.LENGTH_LONG).show();

                    }
                }
            });

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
                    if (tick[0] == 0) {
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
                    Intent intent = new Intent(com.example.demo_ex.FourthActivity.this, ThirdActivity.class);
                    startActivity(intent);


                }
            };
            button.setOnClickListener(listenerSkip);


        }

        public void startNewActivity(View v) {

        }
    }
