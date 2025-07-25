package com.example.assingment2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Computer extends AppCompatActivity {

    Button proccessor,ram,rom,motherboard,input,output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_computer);


        proccessor = findViewById(R.id.button_cpu);
        motherboard = findViewById(R.id.button_motherboard);
        ram = findViewById(R.id.button_ram);
        rom = findViewById(R.id.button_storage);
        input = findViewById(R.id.button_input);
        output = findViewById(R.id.button_output);

        proccessor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Proccesor.class));
            }
        });
        motherboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Motherboard.class));
            }
        });
        ram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Ram.class));
            }
        });
        rom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Rom.class));
            }
        });
        input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Input_devices.class));
            }
        });
        output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Output_devices.class));
            }
        });


    }
}