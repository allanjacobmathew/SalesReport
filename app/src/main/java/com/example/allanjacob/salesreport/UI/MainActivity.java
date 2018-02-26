package com.example.allanjacob.salesreport.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.allanjacob.salesreport.R;

public class MainActivity extends AppCompatActivity {
   private Button add;
   private  Button viewbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add=findViewById(R.id.add_id);
        viewbtn=findViewById(R.id.viewbutton);
        viewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,ViewActivity.class);
                startActivity(intent);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,AddActivity.class);
                startActivity(intent);

            }
        });



  }}
