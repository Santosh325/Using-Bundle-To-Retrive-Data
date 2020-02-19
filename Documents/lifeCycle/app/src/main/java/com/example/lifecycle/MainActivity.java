package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button showName;
    private EditText name;
    private String getName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showName = findViewById(R.id.showName);
        name = findViewById(R.id.name);

        showName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName = name.getText().toString().trim();
                if(getName.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Please Enter a text",Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this,secondActivity.class);
                    intent.putExtra("name",getName);
                    intent.putExtra("guess","james");
                    intent.putExtra("number",40);
                    startActivity(intent);
                }

            }
        });

        Log.d("Cycle","OnCreate Called()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Cycle","OnStart Called()");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("Cycle","OnResume Called()");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Cycle","OnPause Called()");

    }



    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Cycle","OnStop Called()");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Cycle","OnDestroy Called()");

    }
}
