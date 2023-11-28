package com.example.practica_12_mvvm.Interactos;

public class SumaInteractor {

    public interface SumaListener {
        void onSumaCompleted(int resultado);
    }

    public void sumar(int numero1, int numero2, SumaListener listener) {
        int resultado = numero1 + numero2;
        listener.onSumaCompleted(resultado);
    }
}
