package com.example.practica_12_mvvm.SumaViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SumaViewModel extends ViewModel {
    private MutableLiveData<Integer> resultadoLiveData = new MutableLiveData<>();

    public SumaViewModel() {
        resultadoLiveData.setValue(0);
    }

    public LiveData<Integer> getResultado() {
        return resultadoLiveData;
    }

    public void setResultado(int numero1, int numero2) {
        int resultado = numero1 + numero2;
        resultadoLiveData.setValue(resultado);
    }
}
