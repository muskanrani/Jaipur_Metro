package com.example.metro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class station1 extends AppCompatActivity {
    ListView lv1;
    static String r1;
    String stn[]={"Chandpole","Civil_Lines","Mansarovar","New_Aatish_Market","Railway_Station","Ram_Nagar","Sindhi_Camp","Shyam_Nagar","Vivek_Vihar"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station1);

        lv1=findViewById(R.id.listview1);

        ArrayAdapter<String> arr1= new ArrayAdapter<String>(station1.this,R.layout.support_simple_spinner_dropdown_item,stn);
        lv1.setAdapter(arr1);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                r1=(String) parent.getItemAtPosition(position);
                Intent obj8=new Intent(station1.this,page.class);
                startActivity(obj8);
            }
        });
    }
}
