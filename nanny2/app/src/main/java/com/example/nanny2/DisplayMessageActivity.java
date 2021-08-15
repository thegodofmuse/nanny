package com.example.nanny2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.concurrent.atomic.AtomicReference;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        //Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        //String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        //从MainActivity那里传递消息

        //Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        //textView.setText(message);
        //从MainActivity传递消息
    }
}