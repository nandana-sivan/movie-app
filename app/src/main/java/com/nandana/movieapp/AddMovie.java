package com.nandana.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddMovie extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5;
    Button b1,b2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_movie);

        ed1=(EditText) findViewById(R.id.et1);
        ed2=(EditText) findViewById(R.id.et2);
        ed3=(EditText) findViewById(R.id.et3);
        ed4=(EditText) findViewById(R.id.et4);
        ed5=(EditText) findViewById(R.id.et5);
        b1=(Button) findViewById(R.id.bt1);
        b2=(Button) findViewById(R.id.bt2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(ob);
            }
        });

    }
}