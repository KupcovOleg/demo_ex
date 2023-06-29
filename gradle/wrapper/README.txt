package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnCLickPop(View view) {
        LinearLayout ln = findViewById(R.id.// айди LinearLayout внутри которого элементы("пцр тест"));
        ln.removeAllViews();
        for (int i = 0; i < 5; i++) {
            ln.addView(getLayoutInflater().inflate(R.layout.// название xml файла в который мы вынесли эелемент("пцр тест"), null));
        }
    }

    public void OnCLickPop(View view) {
        LinearLayout ln = findViewById(R.id.// айди LinearLayout внутри которого элементы("пцр тест"));
                ln.removeAllViews();
        for (int i = 0; i < 5; i++) {
            ln.addView(getLayoutInflater().inflate(R.layout.// название xml файла в который мы вынесли эелемент("пцр тест"), null));
        }
    }

    public void OnCLickPop(View view) {
        LinearLayout ln = findViewById(R.id.// айди LinearLayout внутри которого элементы("пцр тест"));
                ln.removeAllViews();
        for (int i = 0; i < 5; i++) {
            ln.addView(getLayoutInflater().inflate(R.layout.// название xml файла в который мы вынесли эелемент("пцр тест"), null));
        }
    }
}



<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity3">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_marginLeft="15sp"
        android:layout_marginRight="15sp"
        android:orientation="vertical">

        <EditText
            android:id="@+id/editTextText2"
            android:layout_width="match_parent"
            android:layout_height="48sp"
            android:ems="10"
            android:hint="Искать Анализы"
            android:inputType="text" />

        <ScrollView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:scrollbars="none">

            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:orientation="vertical">

                <TextView
                    android:id="@+id/textView2"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:text="Акции и новости"
                    android:textColor="#939396"
                    android:textSize="17sp" />

                <HorizontalScrollView
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:scrollbars="none">

                    <LinearLayout
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:orientation="horizontal">

                        <ImageView
                            android:id="@+id/imageView3"
                            android:layout_width="match_parent"
                            android:layout_height="match_parent"
                            app:srcCompat="@drawable/banner" />

                        <ImageView
                            android:id="@+id/imageView2"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            app:srcCompat="@drawable/banner" />

                        <ImageView
                            android:id="@+id/imageView4"
                            android:layout_width="match_parent"
                            android:layout_height="match_parent"
                            app:srcCompat="@drawable/banner" />

                        <ImageView
                            android:id="@+id/imageView5"
                            android:layout_width="match_parent"
                            android:layout_height="match_parent"
                            app:srcCompat="@drawable/banner" />

                        <ImageView
                            android:id="@+id/imageView6"
                            android:layout_width="match_parent"
                            android:layout_height="match_parent"
                            app:srcCompat="@drawable/banner" />

                        <ImageView
                            android:id="@+id/imageView7"
                            android:layout_width="match_parent"
                            android:layout_height="match_parent"
                            app:srcCompat="@drawable/banner" />

                        <ImageView
                            android:id="@+id/imageView8"
                            android:layout_width="match_parent"
                            android:layout_height="match_parent"
                            app:srcCompat="@drawable/banner" />
                    </LinearLayout>
                </HorizontalScrollView>

                <TextView
                    android:id="@+id/textView"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:text="Каталог анализов" />

                <HorizontalScrollView
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:scrollbars="none">

                    <LinearLayout
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:orientation="horizontal">

                        <Button
                            android:id="@+id/button3"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginRight="70sp"
                            android:layout_weight="1"
                            android:backgroundTint="#F5F5F9"
                            android:padding="30sp"
                            android:text="Популярное"
                            android:onClick="OnCLickPop"
                            android:textColor="#7E7E9A" />

                        <Button
                            android:id="@+id/button2123"
                            android:layout_width="wrap_content"
                            android:onClick="OnCLickCovid"
                            android:layout_height="wrap_content"
                            android:layout_marginRight="70sp"
                            android:layout_weight="1"
                            android:backgroundTint="#F5F5F9"
                            android:padding="30sp"
                            android:text="Covid"
                            android:textColor="#7E7E9A" />

                        <Button
                            android:id="@+id/butto123n4"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_weight="1"
                            android:backgroundTint="#F5F5F9"
                            android:padding="30sp"
                            android:text="Комплексные" android:onClick="OnCLickComp"
                            android:textColor="#7E7E9A" />
                    </LinearLayout>
                </HorizontalScrollView>


                <LinearLayout
                    android:layout_width="match_parent"
                    android:id="@+id/list1"
                    android:layout_height="wrap_content"
                    android:orientation="vertical">

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_marginBottom="25sp"
                        android:background="@drawable/backzemlya"
                        android:backgroundTint="#99E4E8F5"
                        android:orientation="vertical">

                        <TextView
                            android:id="@+id/textView6"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginLeft="15sp"
                            android:layout_marginTop="15sp"
                            android:layout_marginBottom="25sp"
                            android:text="ПЦР-тест на определение РНК коронавируса стандартный"
                            android:textSize="16sp" />

                        <LinearLayout
                            android:layout_width="match_parent"
                            android:layout_height="match_parent"
                            android:layout_marginLeft="15sp"
                            android:orientation="horizontal">

                            <LinearLayout
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:layout_marginRight="175sp"
                                android:orientation="vertical">

                                <TextView
                                    android:id="@+id/textView8"
                                    android:layout_width="match_parent"
                                    android:layout_height="wrap_content"
                                    android:text="2 ня"
                                    android:textColor="#939396"
                                    android:textSize="17sp" />

                                <TextView
                                    android:id="@+id/textView9"
                                    android:layout_width="match_parent"
                                    android:layout_height="wrap_content"
                                    android:text="1800 ₽"
                                    android:textSize="17sp" />
                            </LinearLayout>

                            <Button
                                android:id="@+id/button"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:backgroundTint="#1A6FEE"
                                android:text="Добавить" />
                        </LinearLayout>
                    </LinearLayout>

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_marginBottom="25sp"
                        android:background="@drawable/backzemlya"
                        android:backgroundTint="#99E4E8F5"
                        android:orientation="vertical">

                        <TextView
                            android:id="@+id/textView10"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginLeft="15sp"
                            android:layout_marginTop="15sp"
                            android:layout_marginBottom="25sp"
                            android:text="Клинический анализ крови с лейкоцитарной формулировкой"
                            android:textSize="16sp" />

                        <LinearLayout
                            android:layout_width="match_parent"
                            android:layout_height="match_parent"
                            android:layout_marginLeft="15sp"
                            android:orientation="horizontal">

                            <LinearLayout
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:layout_marginRight="175sp"
                                android:orientation="vertical">

                                <TextView
                                    android:id="@+id/textView11"
                                    android:layout_width="match_parent"
                                    android:layout_height="wrap_content"
                                    android:text="1 нень"
                                    android:textColor="#939396"
                                    android:textSize="17sp" />

                                <TextView
                                    android:id="@+id/textView12"
                                    android:layout_width="match_parent"
                                    android:layout_height="wrap_content"
                                    android:text="640 ₽"
                                    android:textSize="17sp" />
                            </LinearLayout>

                            <Button
                                android:id="@+id/button1"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:backgroundTint="#1A6FEE"
                                android:text="Добавить" />
                        </LinearLayout>
                    </LinearLayout>

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_marginBottom="25sp"
                        android:background="@drawable/backzemlya"
                        android:backgroundTint="#99E4E8F5"
                        android:orientation="vertical">

                        <TextView
                            android:id="@+id/textView13"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginLeft="15sp"
                            android:layout_marginTop="15sp"
                            android:layout_marginBottom="25sp"
                            android:text="Биохимический анализ крови, базовый"
                            android:textSize="16sp" />

                        <LinearLayout
                            android:layout_width="match_parent"
                            android:layout_height="match_parent"
                            android:layout_marginLeft="15sp"
                            android:orientation="horizontal">

                            <LinearLayout
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:layout_marginRight="175sp"
                                android:orientation="vertical">

                                <TextView
                                    android:id="@+id/textView14"
                                    android:layout_width="match_parent"
                                    android:layout_height="wrap_content"
                                    android:text="1 нень"
                                    android:textColor="#939396"
                                    android:textSize="17sp" />

                                <TextView
                                    android:id="@+id/textView15"
                                    android:layout_width="match_parent"
                                    android:layout_height="wrap_content"
                                    android:text="2440 ₽"
                                    android:textSize="17sp" />
                            </LinearLayout>

                            <Button
                                android:id="@+id/button2"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:backgroundTint="#1A6FEE"
                                android:text="Добавить" />
                        </LinearLayout>
                    </LinearLayout>

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_marginBottom="25sp"
                        android:background="@drawable/backzemlya"
                        android:backgroundTint="#99E4E8F5"
                        android:orientation="vertical">

                        <TextView
                            android:id="@+id/textView16"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginLeft="15sp"
                            android:layout_marginTop="15sp"
                            android:layout_marginBottom="25sp"
                            android:text="СОЭ (венозная кровь)"
                            android:textSize="16sp" />

                        <LinearLayout
                            android:layout_width="match_parent"
                            android:layout_height="match_parent"
                            android:layout_marginLeft="15sp"
                            android:orientation="horizontal">

                            <LinearLayout
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:layout_marginRight="175sp"
                                android:orientation="vertical">

                                <TextView
                                    android:id="@+id/textView17"
                                    android:layout_width="match_parent"
                                    android:layout_height="wrap_content"
                                    android:text="1 нень"
                                    android:textColor="#939396"
                                    android:textSize="17sp" />

                                <TextView
                                    android:id="@+id/textView18"
                                    android:layout_width="match_parent"
                                    android:layout_height="wrap_content"
                                    android:text="240 ₽"
                                    android:textSize="17sp" />
                            </LinearLayout>

                            <Button
                                android:id="@+id/button4"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:backgroundTint="#1A6FEE"
                                android:text="Добавить" />
                        </LinearLayout>
                    </LinearLayout>

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_marginBottom="25sp"
                        android:background="@drawable/backzemlya"
                        android:backgroundTint="#99E4E8F5"
                        android:orientation="vertical">

                        <TextView
                            android:id="@+id/textView20"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginLeft="15sp"
                            android:layout_marginTop="15sp"
                            android:layout_marginBottom="25sp"
                            android:text="Общий анализ мочи"
                            android:textSize="16sp" />

                        <LinearLayout
                            android:layout_width="match_parent"
                            android:layout_height="match_parent"
                            android:layout_marginLeft="15sp"
                            android:orientation="horizontal">

                            <LinearLayout
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:layout_marginRight="175sp"
                                android:orientation="vertical">

                                <TextView
                                    android:id="@+id/textView21"
                                    android:layout_width="match_parent"
                                    android:layout_height="wrap_content"
                                    android:text="1 нень"
                                    android:textColor="#939396"
                                    android:textSize="17sp" />

                                <TextView
                                    android:id="@+id/textView22"
                                    android:layout_width="match_parent"
                                    android:layout_height="wrap_content"
                                    android:text="350 ₽"
                                    android:textSize="17sp" />
                            </LinearLayout>

                            <Button
                                android:id="@+id/button5"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:backgroundTint="#1A6FEE"
                                android:text="Добавить" />
                        </LinearLayout>
                    </LinearLayout>

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_marginBottom="25sp"
                        android:background="@drawable/backzemlya"
                        android:backgroundTint="#99E4E8F5"
                        android:orientation="vertical">

                        <TextView
                            android:id="@+id/textView23"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginLeft="15sp"
                            android:layout_marginTop="15sp"
                            android:layout_marginBottom="25sp"
                            android:text="Тироксин свободный (Т4 свободный)"
                            android:textSize="16sp" />

                        <LinearLayout
                            android:layout_width="match_parent"
                            android:layout_height="match_parent"
                            android:layout_marginLeft="15sp"
                            android:orientation="horizontal">

                            <LinearLayout
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:layout_marginRight="175sp"
                                android:orientation="vertical">

                                <TextView
                                    android:id="@+id/textView24"
                                    android:layout_width="match_parent"
                                    android:layout_height="wrap_content"
                                    android:text="1 нень"
                                    android:textColor="#939396"
                                    android:textSize="17sp" />

                                <TextView
                                    android:id="@+id/textView25"
                                    android:layout_width="match_parent"
                                    android:layout_height="wrap_content"
                                    android:text="680 ₽"
                                    android:textSize="17sp" />
                            </LinearLayout>

                            <Button
                                android:id="@+id/button6"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:backgroundTint="#1A6FEE"
                                android:text="Добавить" />
                        </LinearLayout>

                    </LinearLayout>

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_marginBottom="25sp"
                        android:background="@drawable/backzemlya"
                        android:backgroundTint="#99E4E8F5"
                        android:orientation="vertical">

                        <TextView
                            android:id="@+id/textView26"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginLeft="15sp"
                            android:layout_marginTop="15sp"
                            android:layout_marginBottom="25sp"
                            android:text="Группа крови + Резус-фактор"
                            android:textSize="16sp" />

                        <LinearLayout
                            android:layout_width="match_parent"
                            android:layout_height="match_parent"
                            android:layout_marginLeft="15sp"
                            android:orientation="horizontal">

                            <LinearLayout
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:layout_marginRight="175sp"
                                android:orientation="vertical">

                                <TextView
                                    android:id="@+id/textView27"
                                    android:layout_width="match_parent"
                                    android:layout_height="wrap_content"
                                    android:text="1 нень"
                                    android:textColor="#939396"
                                    android:textSize="17sp" />

                                <TextView
                                    android:id="@+id/textView28"
                                    android:layout_width="match_parent"
                                    android:layout_height="wrap_content"
                                    android:text="750 ₽"
                                    android:textSize="17sp" />
                            </LinearLayout>

                            <Button
                                android:id="@+id/button7"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:backgroundTint="#1A6FEE"
                                android:text="Добавить" />
                        </LinearLayout>
                    </LinearLayout>


                </LinearLayout>


            </LinearLayout>

        </ScrollView>

    </LinearLayout>

</androidx.constraintlayout.widget.ConstraintLayout>




---------------------------------------------------------------------------------------------------------
Мое

    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        }, 2000);
    }

    public void GoBack(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }






public void startNewActivity(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

---------------------------------------------------------------------------------------------------------

                  MainActivity

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }

    public void OnCLickPop(View view) {
        LinearLayout ln = findViewById(R.id.list1);
        ln.removeAllViews();
        for (int i = 0; i < 5; i++) {
            ln.addView(getLayoutInflater().inflate(R.layout.element, null));
        }
    }

    public void OnCLickCovid(View view) {
        LinearLayout ln = findViewById(R.id.list1);
        ln.removeAllViews();
        for (int i = 0; i < 3; i++) {
            ln.addView(getLayoutInflater().inflate(R.layout.element, null));
        }
    }

    public void OnCLickComp(View view) {
        LinearLayout ln = findViewById(R.id.list1);
        ln.removeAllViews();
        for (int i = 0; i < 2; i++) {
            ln.addView(getLayoutInflater().inflate(R.layout.element, null));
        }
    }
}

---------------------------------------------------------------------------------------------------------
                      activity_main.xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity3">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_marginLeft="15sp"
        android:layout_marginRight="15sp"
        android:orientation="vertical">

        <EditText
            android:id="@+id/editTextText2"
            android:layout_width="match_parent"
            android:layout_height="48sp"
            android:hint="Искать Анализы"
            android:inputType="text" />

        <ScrollView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:scrollbars="none">

            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:orientation="vertical">

                <TextView
                    android:id="@+id/textView2"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:text="Акции и новости"
                    android:textColor="#939396"
                    android:textSize="17sp" />

                <HorizontalScrollView
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:scrollbars="none">

                    <LinearLayout
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:orientation="horizontal">

                        <ImageView
                            android:id="@+id/imageView3"
                            android:layout_width="match_parent"
                            android:layout_height="match_parent"
                            app:srcCompat="@drawable/banner" />

                        <ImageView
                            android:id="@+id/imageView2"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            app:srcCompat="@drawable/banner" />

                        <ImageView
                            android:id="@+id/imageView4"
                            android:layout_width="match_parent"
                            android:layout_height="match_parent"
                            app:srcCompat="@drawable/banner" />

                        <ImageView
                            android:id="@+id/imageView5"
                            android:layout_width="match_parent"
                            android:layout_height="match_parent"
                            app:srcCompat="@drawable/banner" />

                    </LinearLayout>
                </HorizontalScrollView>

                <TextView
                    android:id="@+id/textView"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_marginTop="10sp"
                    android:text="Каталог анализов" />

                <HorizontalScrollView
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:scrollbars="none">

                    <LinearLayout
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:orientation="horizontal">

                        <Button
                            android:id="@+id/button3"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginRight="70sp"
                            android:layout_weight="1"
                            android:backgroundTint="#F5F5F9"
                            android:onClick="OnCLickPop"
                            android:padding="30sp"
                            android:text="Популярное"
                            android:textColor="#7E7E9A" />

                        <Button
                            android:id="@+id/button2123"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginRight="70sp"
                            android:layout_weight="1"
                            android:backgroundTint="#F5F5F9"
                            android:onClick="OnCLickCovid"
                            android:padding="30sp"
                            android:text="Covid"
                            android:textColor="#7E7E9A" />

                        <Button
                            android:id="@+id/butto123n4"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_weight="1"
                            android:backgroundTint="#F5F5F9"
                            android:onClick="OnCLickComp"
                            android:padding="30sp"
                            android:text="Комплексные"
                            android:textColor="#7E7E9A" />
                    </LinearLayout>
                </HorizontalScrollView>


                <LinearLayout
                    android:id="@+id/list1"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:orientation="vertical">

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_marginBottom="25sp"
                        android:background="@drawable/backzemlya"
                        android:backgroundTint="#99E4E8F5"
                        android:orientation="vertical">

                        <TextView
                            android:id="@+id/textView6"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginLeft="15sp"
                            android:layout_marginTop="15sp"
                            android:layout_marginBottom="25sp"
                            android:text="ПЦР-тест на определение РНК коронавируса стандартный"
                            android:textSize="16sp" />

                        <LinearLayout
                            android:layout_width="match_parent"
                            android:layout_height="match_parent"
                            android:layout_marginLeft="15sp"
                            android:orientation="horizontal">

                            <LinearLayout
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:layout_marginRight="175sp"
                                android:orientation="vertical">

                                <TextView
                                    android:id="@+id/textView8"
                                    android:layout_width="match_parent"
                                    android:layout_height="wrap_content"
                                    android:text="2 ня"
                                    android:textColor="#939396"
                                    android:textSize="17sp" />

                                <TextView
                                    android:id="@+id/textView9"
                                    android:layout_width="match_parent"
                                    android:layout_height="wrap_content"
                                    android:text="1800 ₽"
                                    android:textSize="17sp" />
                            </LinearLayout>

                            <Button
                                android:id="@+id/button"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:backgroundTint="#1A6FEE"
                                android:text="Добавить" />
                        </LinearLayout>
                    </LinearLayout>

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_marginBottom="25sp"
                        android:background="@drawable/backzemlya"
                        android:backgroundTint="#99E4E8F5"
                        android:orientation="vertical">

                        <TextView
                            android:id="@+id/textView10"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginLeft="15sp"
                            android:layout_marginTop="15sp"
                            android:layout_marginBottom="25sp"
                            android:text="Клинический анализ крови с лейкоцитарной формулировкой"
                            android:textSize="16sp" />

                        <LinearLayout
                            android:layout_width="match_parent"
                            android:layout_height="match_parent"
                            android:layout_marginLeft="15sp"
                            android:orientation="horizontal">

                            <LinearLayout
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:layout_marginRight="175sp"
                                android:orientation="vertical">

                                <TextView
                                    android:id="@+id/textView11"
                                    android:layout_width="match_parent"
                                    android:layout_height="wrap_content"
                                    android:text="1 нень"
                                    android:textColor="#939396"
                                    android:textSize="17sp" />

                                <TextView
                                    android:id="@+id/textView12"
                                    android:layout_width="match_parent"
                                    android:layout_height="wrap_content"
                                    android:text="640 ₽"
                                    android:textSize="17sp" />
                            </LinearLayout>

                            <Button
                                android:id="@+id/button1"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:backgroundTint="#1A6FEE"
                                android:text="Добавить" />
                        </LinearLayout>
                    </LinearLayout>

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_marginBottom="25sp"
                        android:background="@drawable/backzemlya"
                        android:backgroundTint="#99E4E8F5"
                        android:orientation="vertical">

                        <TextView
                            android:id="@+id/textView13"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginLeft="15sp"
                            android:layout_marginTop="15sp"
                            android:layout_marginBottom="25sp"
                            android:text="Биохимический анализ крови, базовый"
                            android:textSize="16sp" />

                        <LinearLayout
                            android:layout_width="match_parent"
                            android:layout_height="match_parent"
                            android:layout_marginLeft="15sp"
                            android:orientation="horizontal">

                            <LinearLayout
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:layout_marginRight="175sp"
                                android:orientation="vertical">

                                <TextView
                                    android:id="@+id/textView14"
                                    android:layout_width="match_parent"
                                    android:layout_height="wrap_content"
                                    android:text="1 нень"
                                    android:textColor="#939396"
                                    android:textSize="17sp" />

                                <TextView
                                    android:id="@+id/textView15"
                                    android:layout_width="match_parent"
                                    android:layout_height="wrap_content"
                                    android:text="2440 ₽"
                                    android:textSize="17sp" />
                            </LinearLayout>

                            <Button
                                android:id="@+id/button2"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:backgroundTint="#1A6FEE"
                                android:text="Добавить" />
                        </LinearLayout>
                    </LinearLayout>

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_marginBottom="25sp"
                        android:background="@drawable/backzemlya"
                        android:backgroundTint="#99E4E8F5"
                        android:orientation="vertical">

                        <TextView
                            android:id="@+id/textView16"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginLeft="15sp"
                            android:layout_marginTop="15sp"
                            android:layout_marginBottom="25sp"
                            android:text="СОЭ (венозная кровь)"
                            android:textSize="16sp" />

                        <LinearLayout
                            android:layout_width="match_parent"
                            android:layout_height="match_parent"
                            android:layout_marginLeft="15sp"
                            android:orientation="horizontal">

                            <LinearLayout
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:layout_marginRight="175sp"
                                android:orientation="vertical">

                                <TextView
                                    android:id="@+id/textView17"
                                    android:layout_width="match_parent"
                                    android:layout_height="wrap_content"
                                    android:text="1 нень"
                                    android:textColor="#939396"
                                    android:textSize="17sp" />

                                <TextView
                                    android:id="@+id/textView18"
                                    android:layout_width="match_parent"
                                    android:layout_height="wrap_content"
                                    android:text="240 ₽"
                                    android:textSize="17sp" />
                            </LinearLayout>

                            <Button
                                android:id="@+id/button4"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:backgroundTint="#1A6FEE"
                                android:text="Добавить" />
                        </LinearLayout>
                    </LinearLayout>

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_marginBottom="25sp"
                        android:background="@drawable/backzemlya"
                        android:backgroundTint="#99E4E8F5"
                        android:orientation="vertical">

                        <TextView
                            android:id="@+id/textView20"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginLeft="15sp"
                            android:layout_marginTop="15sp"
                            android:layout_marginBottom="25sp"
                            android:text="Общий анализ мочи"
                            android:textSize="16sp" />

                        <LinearLayout
                            android:layout_width="match_parent"
                            android:layout_height="match_parent"
                            android:layout_marginLeft="15sp"
                            android:orientation="horizontal">

                            <LinearLayout
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:layout_marginRight="175sp"
                                android:orientation="vertical">

                                <TextView
                                    android:id="@+id/textView21"
                                    android:layout_width="match_parent"
                                    android:layout_height="wrap_content"
                                    android:text="1 нень"
                                    android:textColor="#939396"
                                    android:textSize="17sp" />

                                <TextView
                                    android:id="@+id/textView22"
                                    android:layout_width="match_parent"
                                    android:layout_height="wrap_content"
                                    android:text="350 ₽"
                                    android:textSize="17sp" />
                            </LinearLayout>

                            <Button
                                android:id="@+id/button5"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:backgroundTint="#1A6FEE"
                                android:text="Добавить" />
                        </LinearLayout>
                    </LinearLayout>

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_marginBottom="25sp"
                        android:background="@drawable/backzemlya"
                        android:backgroundTint="#99E4E8F5"
                        android:orientation="vertical">

                        <TextView
                            android:id="@+id/textView23"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginLeft="15sp"
                            android:layout_marginTop="15sp"
                            android:layout_marginBottom="25sp"
                            android:text="Тироксин свободный (Т4 свободный)"
                            android:textSize="16sp" />

                        <LinearLayout
                            android:layout_width="match_parent"
                            android:layout_height="match_parent"
                            android:layout_marginLeft="15sp"
                            android:orientation="horizontal">

                            <LinearLayout
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:layout_marginRight="175sp"
                                android:orientation="vertical">

                                <TextView
                                    android:id="@+id/textView24"
                                    android:layout_width="match_parent"
                                    android:layout_height="wrap_content"
                                    android:text="1 нень"
                                    android:textColor="#939396"
                                    android:textSize="17sp" />

                                <TextView
                                    android:id="@+id/textView25"
                                    android:layout_width="match_parent"
                                    android:layout_height="wrap_content"
                                    android:text="680 ₽"
                                    android:textSize="17sp" />
                            </LinearLayout>

                            <Button
                                android:id="@+id/button6"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:backgroundTint="#1A6FEE"
                                android:text="Добавить" />
                        </LinearLayout>

                    </LinearLayout>

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_marginBottom="25sp"
                        android:background="@drawable/backzemlya"
                        android:backgroundTint="#99E4E8F5"
                        android:orientation="vertical">

                        <TextView
                            android:id="@+id/textView26"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginLeft="15sp"
                            android:layout_marginTop="15sp"
                            android:layout_marginBottom="25sp"
                            android:text="Группа крови + Резус-фактор"
                            android:textSize="16sp" />

                        <LinearLayout
                            android:layout_width="match_parent"
                            android:layout_height="match_parent"
                            android:layout_marginLeft="15sp"
                            android:orientation="horizontal">

                            <LinearLayout
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:layout_marginRight="175sp"
                                android:orientation="vertical">

                                <TextView
                                    android:id="@+id/textView27"
                                    android:layout_width="match_parent"
                                    android:layout_height="wrap_content"
                                    android:text="1 нень"
                                    android:textColor="#939396"
                                    android:textSize="17sp" />

                                <TextView
                                    android:id="@+id/textView28"
                                    android:layout_width="match_parent"
                                    android:layout_height="wrap_content"
                                    android:text="750 ₽"
                                    android:textSize="17sp" />
                            </LinearLayout>

                            <Button
                                android:id="@+id/button7"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:backgroundTint="#1A6FEE"
                                android:text="Добавить" />
                        </LinearLayout>
                    </LinearLayout>


                </LinearLayout>


            </LinearLayout>

        </ScrollView>

    </LinearLayout>

</androidx.constraintlayout.widget.ConstraintLayout>

---------------------------------------------------------------------------------------------------------

			element.xml

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/list1"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginBottom="25sp"
        android:background="@drawable/backzemlya"
        android:backgroundTint="#99E4E8F5"
        android:orientation="vertical">

        <TextView
            android:id="@+id/textView6"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginLeft="15sp"
            android:layout_marginTop="15sp"
            android:layout_marginBottom="25sp"
            android:text="ПЦР-тест на определение РНК коронавируса стандартный"
            android:textSize="16sp" />

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_marginLeft="15sp"
            android:orientation="horizontal">

            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginRight="175sp"
                android:orientation="vertical">

                <TextView
                    android:id="@+id/textView8"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:text="2 ня"
                    android:textColor="#939396"
                    android:textSize="17sp" />

                <TextView
                    android:id="@+id/textView9"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:text="1800 ₽"
                    android:textSize="17sp" />
            </LinearLayout>

            <Button
                android:id="@+id/button"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:backgroundTint="#1A6FEE"
                android:text="Добавить" />
        </LinearLayout>
    </LinearLayout>
</LinearLayout>





