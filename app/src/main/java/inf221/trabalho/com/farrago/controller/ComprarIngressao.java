package inf221.trabalho.com.farrago.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import inf221.trabalho.com.farrago.R;

public class ComprarIngressao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprar_ingressao);
    }

    public void efetuarCompra(View v){
//        Intent it = new Intent(this, MeusIngressos.class);
        Intent it = new Intent(this, GerarBoleto.class);
        startActivity(it);
    }
}
