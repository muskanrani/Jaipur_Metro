package com.example.metro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class station extends AppCompatActivity {
    ListView lv;
    static String r;
    String st[]={"Chandpole","Civil_Lines","Mansarovar","New_Aatish_Market","Railway_Station","Ram_Nagar","Sindhi_Camp","Shyam_Nagar","Vivek_Vihar"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station);

        lv=findViewById(R.id.listview);

        ArrayAdapter<String> arr= new ArrayAdapter<String>(station.this,R.layout.support_simple_spinner_dropdown_item,st);
        lv.setAdapter(arr);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                r=(String) parent.getItemAtPosition(position);
                Intent obj5=new Intent(station.this,page.class);
                startActivity(obj5);
            }
        });
    }
}
