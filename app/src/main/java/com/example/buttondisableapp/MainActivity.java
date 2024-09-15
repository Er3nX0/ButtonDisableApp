package com.example.buttondisableapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    TextView showValue;
    private Button buttonDisable; // Deklaracja przycisku
    private Button buttonEnable;
    private int counter = 0; // Deklaracja licznika wciśnięć

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicjalizacja licznika
        showValue = (TextView) findViewById(R.id.counter);

        // Inicjalizacja przycisku poprzez ID z pliku XML
        buttonDisable = findViewById(R.id.buttonDisable);
        buttonEnable = findViewById(R.id.buttonEnable);

        // Ustawienie nasłuchiwania na kliknięcie przycisku
        buttonDisable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Po kliknięciu przycisk zostaje dezaktywowany a licznik zwiększa swoją wartość o 1
                buttonDisable.setEnabled(false);
                counter++;
                showValue.setText(Integer.toString(counter));


                // Wyświetlenie powiadomienia
                Toast.makeText(MainActivity.this, "Przycisk został wyłączony", Toast.LENGTH_SHORT).show();
            }
        });
        // Ustawienie nasłuchiwania na aktywacje przycisku "Kliknij mnie"
        buttonEnable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Po kliknięciu przycisk "Kliknij mnie" zostanie aktywowany
                buttonDisable.setEnabled(true);
            }
        });
    }
}