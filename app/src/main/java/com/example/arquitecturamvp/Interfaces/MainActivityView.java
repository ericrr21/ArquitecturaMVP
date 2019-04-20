package com.example.arquitecturamvp.Interfaces;

public interface MainActivityView {

    /*
    * Se colocan los metodos a utilizarse para manejar la IU
    * */

    //Colocar el resultado en TextView
    void SetResult(String resultado);
    // Mostrar Error con Toast
    void ShowError(String error);
}
