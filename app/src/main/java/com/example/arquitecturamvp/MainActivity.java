package com.example.arquitecturamvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.arquitecturamvp.Interfaces.MainActivityPresenter;
import com.example.arquitecturamvp.Interfaces.MainActivityView;
import com.example.arquitecturamvp.Presenters.MainActivityPresenterImpl;

public class MainActivity extends AppCompatActivity implements MainActivityView {

    //  Variables de IU
    EditText num1,num2;
    TextView resultado;

    //Presentador
    private MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Cast
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        resultado = findViewById(R.id.resultado);

        //Inicializamos el Presentador
        presenter = new MainActivityPresenterImpl(this);

    }

    @Override
    public void SetResult(String resultado) {

    }

    @Override
    public void ShowError(String error) {
        Toast.makeText(this,error,Toast.LENGTH_LONG).show();
    }


    public void suma(View v) {
        //Llama metodo del Presenters (Comunica Vista con Logica(Interactor))
        presenter.OperacionSuma(num1.getText().toString(),num2.getText().toString());
    }
}
