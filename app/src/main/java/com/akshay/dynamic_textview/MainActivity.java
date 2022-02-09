package com.akshay.dynamic_textview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    final int delay = 5000;
    int count = 0;
    final Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CountDown();
    }


    private void CountDown() {
        handler.postDelayed(new Runnable() {
            public void run() {
                TextViewCreation();
                count++;
                if (count<=9) {
                    handler.postDelayed(this, delay);
                }

            }
        }, delay);
    }

    private void TextViewCreation() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.rootView);
        TextView textView = new TextView(getApplicationContext());
        textView.setText("It's me Akshay");
        linearLayout.addView(textView);

    }


}