package com.example.testeo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MetodoSuperUltraCool();
    }
    public void MetodoSuperUltraCool() {
        System.out.println("HOLA QUE TAL SOY COLOSAL");
    }

}