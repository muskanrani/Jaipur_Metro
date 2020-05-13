package com.example.metro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class policestation extends AppCompatActivity {
    ListView l;
    String stnname[]={"Mansarovar Police Station, Mansarovar","Police Choki Chandpol","Police Choki Chandpol","Mahesh Nagar Police Station near new aatish market","Sadar Police Station near railway station","Sodala Police Station near ram nagar","Police Station Sindhi Camp","Shyam Nagar Police Station","Police Chowki near vivek vihar"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policestation);
        l=findViewById(R.id.listv);
        ArrayAdapter<String> arr;
        arr=new ArrayAdapter<String>(policestation.this,R.layout.support_simple_spinner_dropdown_item,stnname);
        l.setAdapter(arr);

    l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String r=(String) parent.getItemAtPosition(position);
            Intent obj11=new Intent(policestation.this,displaypolice.class);
            obj11.putExtra("key",r);
            startActivity(obj11);
        }
    });
    }
}
