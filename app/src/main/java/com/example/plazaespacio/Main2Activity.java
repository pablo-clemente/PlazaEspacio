package com.example.plazaespacio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlantaBaja();
            }
        });
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPiso2();
            }
        });
    }

    public void openPlantaBaja(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openPiso2(){
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }
}