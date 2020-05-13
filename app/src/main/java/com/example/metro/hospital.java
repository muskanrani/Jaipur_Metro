package com.example.metro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hospital extends AppCompatActivity {
ListView lv;
String hos[]={"asfc","saf","sadc"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);
        lv=findViewById(R.id.lstv);
        ArrayAdapter<String> ar;
        ar=new ArrayAdapter<String>(hospital.this,R.layout.support_simple_spinner_dropdown_item,hos);
        lv.setAdapter(ar);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String ho=(String) parent.getItemAtPosition(position);
                Intent obj12=new Intent(hospital.this,displayhospital.class);
                obj12.putExtra("k",ho);
                startActivity(obj12);
            }
        });
    }
}
