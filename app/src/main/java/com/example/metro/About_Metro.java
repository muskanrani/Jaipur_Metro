package com.example.metro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class About_Metro extends AppCompatActivity {
    TextView t;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__metro);

        t=findViewById(R.id.textView3);
        img=findViewById(R.id.imageView2);
    }
}
