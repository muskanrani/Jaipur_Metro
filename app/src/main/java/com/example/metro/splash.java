package com.example.metro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread th=new Thread(){
            public void run(){
                try{
                    sleep(2000);
                }catch(Exception t){}
                finally {
                    Intent obj9=new Intent(splash.this,page.class);
                    startActivity(obj9);
                    finish();
                }
            }
        } ;
        th.start();
    }
}
