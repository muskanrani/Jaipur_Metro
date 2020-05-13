package com.example.metro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class others extends AppCompatActivity implements View.OnClickListener {
    Button m,ps,h,p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others);

        m=findViewById(R.id.button8);
        ps=findViewById(R.id.button9);
        h=findViewById(R.id.button10);
        p=findViewById(R.id.button11);

        m.setOnClickListener(this);
        ps.setOnClickListener(this);
        h.setOnClickListener(this);
        p.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button8)
        {
            Intent obj7=new Intent(others.this,About_Metro.class);
            startActivity(obj7);
        }
        if(v.getId()==R.id.button9)
        {
            Intent obj8=new Intent(others.this,policestation.class);
            startActivity(obj8);
        }
        if(v.getId()==R.id.button10)
        {
            Intent obj9=new Intent(others.this,hospital.class);
            startActivity(obj9);
        }
        if(v.getId()==R.id.button11)
        {}

    }
}
