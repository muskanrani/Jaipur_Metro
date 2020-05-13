package com.example.metro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class displaypolice extends AppCompatActivity {
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displaypolice);
        t=findViewById(R.id.textView2);
        Intent obj1=getIntent();
        t.setText(obj1.getStringExtra("key"));
    }
}
