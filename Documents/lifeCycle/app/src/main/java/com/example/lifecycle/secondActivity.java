package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class secondActivity extends AppCompatActivity {
    TextView showName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        showName = findViewById(R.id.showName);

        Bundle extra = getIntent().getExtras();


        if(extra != null) {
            showName.setText(extra.getString("name"));
            Log.d("Guess Name", " " + extra.getString("guess"));
            Log.d("Guess Number", " " + extra.getInt("number"));
        }


//        if(getIntent().getStringExtra("name") != null) {
//            Log.d("stuff"," "+ getIntent().getStringExtra("guess"));
//            showName.setText(getIntent().getStringExtra("name"));
//        }
    }
}
