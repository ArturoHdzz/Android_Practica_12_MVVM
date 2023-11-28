package com.example.practica_12_mvvm.SumaViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.practica_12_mvvm.Interactos.SumaInteractor;

public class SumaViewModel extends ViewModel {
    private MutableLiveData<String> resultado = new MutableLiveData<>();
    public LiveData<String> getResultado() {
        return resultado;
    }
    public void Sumar(int num1, int num2){
        int rs = SumaInteractor.sumar(num1,num2);
        resultado.setValue(String.valueOf(rs));
    }
}
