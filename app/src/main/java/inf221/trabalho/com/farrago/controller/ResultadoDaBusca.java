package inf221.trabalho.com.farrago.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import inf221.trabalho.com.farrago.R;
import inf221.trabalho.com.farrago.model.Evento;
import inf221.trabalho.com.farrago.model.Ingresso;

/**
 * Created by lucio on 6/20/2017.
 */

public class ResultadoDaBusca extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstance){
            super.onCreate(savedInstance);
            setContentView(R.layout.activity_resultado_da_busca);
            final ListView listView = (ListView) findViewById(R.id.lista_de_ingressos);
            List<Ingresso> ingressos = new ArrayList<>();



            Evento evento = new Evento();
            evento.setNomeDoEvento("Festa de aniversario de Coragen o Cão Covarde");
            evento.setData(new java.sql.Date(11,11,11));
            evento.setFaixaEtaria(11);
            evento.setHorario(new Time(11,11,11));
            evento.cadastraIngressos(11,11f,11,11);
            evento.setLocal("Casa da Muriel");
            evento.setNumeroDeIngressos(123);
            evento.getIngresso().setEvento(evento);
            ingressos.add(evento.getIngresso());

            ArrayAdapter<Ingresso> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ingressos);

            listView.setAdapter(arrayAdapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    startActivity( ( new Intent(getBaseContext(), ComprarIngresso.class ))
                            .putExtra("evento", ((Ingresso) listView.getItemAtPosition(position)).getEvento()) );
                }
            });
    }

    public void voltar(View v){
        finish();
    }
}
