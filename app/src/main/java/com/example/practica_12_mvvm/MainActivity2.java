package com.example.practica_12_mvvm;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import androidx.appcompat.app.AppCompatActivity;
import com.example.practica_12_mvvm.SumaViewModel.SumaViewModel;

public class MainActivity2 extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private TextView resultado;
    private Button suma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        num1 = findViewById(R.id.txtNumero1);
        num2 = findViewById(R.id.txtNumero2);
        resultado = findViewById(R.id.txtResultado);
        suma = findViewById(R.id.btnSumar);

        SumaViewModel Miviewmodel = new ViewModelProvider(this).get(SumaViewModel.class);

        suma.setOnClickListener(view -> {
            int n1 = Integer.parseInt(num1.getText().toString());
            int n2 = Integer.parseInt(num2.getText().toString());
            ((SumaViewModel) Miviewmodel).Sumar(n1, n2);
        });

        ((SumaViewModel) Miviewmodel).getResultado().observe(this, s -> resultado.setText(s));
    }


}
