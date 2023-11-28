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

    private EditText txtNumero1;
    private EditText txtNumero2;
    private TextView txtResultado;
    private Button btnSumar;
    private SumaViewModel sumaViewModel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtNumero1 = findViewById(R.id.txtNumero1);
        txtNumero2 = findViewById(R.id.txtNumero2);
        txtResultado = findViewById(R.id.txtResultado);
        btnSumar = findViewById(R.id.btnSumar);

        // Agrega esta línea para inicializar el SumaViewModel
        sumaViewModel = new ViewModelProvider(this).get(SumaViewModel.class);

        sumaViewModel.getResultado().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer resultado) {
                txtResultado.setText("Resultado: " + resultado);
            }
        });

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1 = Integer.parseInt(txtNumero1.getText().toString());
                int numero2 = Integer.parseInt(txtNumero2.getText().toString());
                sumaViewModel.setResultado(numero1, numero2);
            }
        });
    }


}
