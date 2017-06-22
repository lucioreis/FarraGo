package inf221.trabalho.com.farrago.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import inf221.trabalho.com.farrago.R;

/**
 * Created by lucio on 6/20/2017.
 */

public class ResultadoDaBusca extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_resultado_da_busca);
    }

    public void aindaemteste(View v){
        startActivity(new Intent(this, ComprarIngresso.class));
        finish();
    }
}
