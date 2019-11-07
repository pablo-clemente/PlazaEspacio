package com.example.plazaespacio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlantaBaja();
            }
        });
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPiso1();
            }
        });
    }

    public void openPlantaBaja(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openPiso1(){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
