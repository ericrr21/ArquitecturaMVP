package com.example.arquitecturamvp.Presenters;

import com.example.arquitecturamvp.Interactors.MainActivityInteractorImpl;
import com.example.arquitecturamvp.Interfaces.MainActivityInteractor;
import com.example.arquitecturamvp.Interfaces.MainActivityPresenter;
import com.example.arquitecturamvp.Interfaces.MainActivityView;



public class MainActivityPresenterImpl implements MainActivityPresenter {

    private MainActivityView view;
   private MainActivityInteractor interactor;


    public MainActivityPresenterImpl(MainActivityView view) {
        this.view = view;
        interactor = new MainActivityInteractorImpl(this);
    }

    @Override
    public void OperacionSuma(String  num1, String num2) {
        if(view != null){
                interactor.suma(num1,num2);
        }

    }

    @Override
    public void ShowErrorPresenter(String error) {
        if(view != null){
            view.ShowError(error);
        }
    }

    @Override
    public void Resultado(String resultado) {
        if(view != null){
            view.SetResult(resultado);
        }
    }
}
