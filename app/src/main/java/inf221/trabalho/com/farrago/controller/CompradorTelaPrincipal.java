package inf221.trabalho.com.farrago.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import inf221.trabalho.com.farrago.R;
import inf221.trabalho.com.farrago.model.Ingresso;

public class CompradorTelaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprador_tela_principal);
    }

    public void pesquisar(View v){
        Intent it = new Intent(this, Busca.class);
        startActivity(it);
    }

    public void irParaMeusIngressos(View v){
        Intent it = new Intent(this, MeusIngressos.class);
        startActivity(it);
    }
}
