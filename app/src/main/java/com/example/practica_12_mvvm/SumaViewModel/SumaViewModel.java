package com.example.practica_12_mvvm.SumaViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.practica_12_mvvm.Interactos.SumaInteractor;

public class SumaViewModel extends ViewModel {
    private MutableLiveData<Integer> resultadoLiveData = new MutableLiveData<>();
    private SumaInteractor sumaInteractor = new SumaInteractor();

    public SumaViewModel() {
        resultadoLiveData.setValue(0);
    }

    public LiveData<Integer> getResultado() {
        return resultadoLiveData;
    }

    public void setResultado(int numero1, int numero2) {
        sumaInteractor.sumar(numero1, numero2, new SumaInteractor.SumaListener() {
            @Override
            public void onSumaCompleted(int resultado) {
                resultadoLiveData.setValue(resultado);
            }
        });
    }
}
