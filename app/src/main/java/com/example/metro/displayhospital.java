package com.example.metro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class displayhospital extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displayhospital);
        tv=findViewById(R.id.textView4);
        Intent obj13=getIntent();
        tv.setText(obj13.getStringExtra("k"));
    }
}
