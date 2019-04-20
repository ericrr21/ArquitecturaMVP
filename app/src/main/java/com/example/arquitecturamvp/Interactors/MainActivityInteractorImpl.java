package com.example.arquitecturamvp.Interactors;

import com.example.arquitecturamvp.Interfaces.MainActivityInteractor;
import com.example.arquitecturamvp.Interfaces.MainActivityPresenter;

public class MainActivityInteractorImpl implements MainActivityInteractor {
    private MainActivityPresenter presenter;
    private double resultado;

    public MainActivityInteractorImpl(MainActivityPresenter presenter) {
    this.presenter = presenter;
    }

    @Override
    public void suma(String num1, String num2) {

        if (num1.equals("") && num2.equals("")){
            presenter.ShowErrorPresenter("Los Campos Estan Vacios");
        }else{
            try {
                resultado = Double.valueOf(num1)+Double.valueOf(num2);
                presenter.Resultado(String.valueOf(resultado));
            }catch (Exception e){
                presenter.ShowErrorPresenter(e.getMessage());
            }

        }

    }
}
