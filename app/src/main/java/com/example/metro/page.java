package com.example.metro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

import java.security.cert.Extension;

public class page extends AppCompatActivity implements View.OnClickListener {
    Button b4,b5,f,t;
    AutoCompleteTextView e1,e2;
    String data;
    String stations[]={"Chandpole","Civil_Lines","Mansarovar","New_Aatish_Market","Railway_Station","Ram_Nagar","Sindhi_Camp","Shyam_Nagar","Vivek_Vihar"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        b4=findViewById(R.id.button5);
        b5=findViewById(R.id.button6);
        f=findViewById(R.id.button3);
        t=findViewById(R.id.button4);
        e1=findViewById(R.id.editText3);
        e2=findViewById(R.id.editText4);

        f.setOnClickListener(this);
        t.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);

        e1.setText(station.r);
        e2.setText(station1.r1);

        ArrayAdapter<String> arr;
        arr=new ArrayAdapter<>(page.this,R.layout.support_simple_spinner_dropdown_item,stations);
        e1.setAdapter(arr);
        e2.setAdapter(arr);
        e1.setThreshold(1);
        e2.setThreshold(1);
        e1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                data=(String) parent.getItemAtPosition(position);
                e1.setText(data);
            }
        });
        e2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                data=(String) parent.getItemAtPosition(position);
                e2.setText(data);
            }
        });
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button3){
            Intent obj3=new Intent(page.this,station.class);
            startActivity(obj3);
        }
        if(v.getId()==R.id.button4){
            Intent obj4=new Intent(page.this,station1.class);
            startActivity(obj4);
        }
        if(v.getId()==R.id.button5){

        }
        if(v.getId()==R.id.button6){
        Intent obj5=new Intent(page.this,others.class);
        startActivity(obj5);
        }
    }
}
