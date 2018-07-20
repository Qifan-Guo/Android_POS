package com.qifan.bestwingpos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getIntent().getStringExtra("UserName")!=null){
            Toast.makeText(this,getIntent().getStringExtra("UserName"),Toast.LENGTH_SHORT).show();
        }
    }
}
