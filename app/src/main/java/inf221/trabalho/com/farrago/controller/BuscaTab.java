package inf221.trabalho.com.farrago.controller;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import inf221.trabalho.com.farrago.R;

/**
 * Created by lucio on 6/22/2017.
 */

public class BuscaTab extends Fragment {
    private int resource;
    private Spinner spinnerNomeDoEvento, spinnerTag, spinnerTema, spinnerCidadesIngressoTab, spinnerCidadesEventoTab;
    private ArrayAdapter<String> arrayAdapter, arrayCidade, arrayTag, arrayTema, arrayNome;

    public BuscaTab(int res){
        resource = res;
    }
    public static BuscaTab builder(int res){
        return new BuscaTab(res);
    }
    public BuscaTab arrayCidade(ArrayAdapter<String> _array){
        arrayCidade = _array;
        return this;
    }
    public BuscaTab arrayTag(ArrayAdapter<String> _array){
        arrayTag = _array;
        return this;
    }
    public BuscaTab arrayTema(ArrayAdapter<String> _array){
        arrayTema = _array;
        return this;
    }
    public BuscaTab arrayNomeDeEvento(ArrayAdapter<String> _array){
        arrayNome = _array;
        return this;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstamce){
        Log.i("erro", "chamou o oncreateView");
        return inflater.inflate(resource, container, false);
    }
    private void fillSpinner(Spinner spin, ArrayAdapter<String> _arrayAdapter){
        if(_arrayAdapter != null) spin.setAdapter(_arrayAdapter);
    }

    private Spinner recoverSpinner(int r){
        return (Spinner) getActivity().findViewById(r);
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        spinnerCidadesEventoTab = recoverSpinner(R.id.spinner_busca_cidade);
        spinnerCidadesIngressoTab = recoverSpinner(R.id.spinner_busca_cidade_tabIngresso);
        spinnerTema = recoverSpinner(R.id.spinner_busca_tema);
        spinnerTag = recoverSpinner(R.id.spinner_busca_tag);
        spinnerNomeDoEvento = recoverSpinner(R.id.spinner_busca_evento);
        fillSpinner(spinnerCidadesEventoTab, arrayCidade);
        fillSpinner(spinnerCidadesIngressoTab, arrayCidade);
        fillSpinner(spinnerTema, arrayTema);
        fillSpinner(spinnerTag, arrayTag);
        fillSpinner(spinnerNomeDoEvento, arrayNome);
    }

    public List getItensSelecionados(){
        List<String> itemSelecionados = new ArrayList<>();
        itemSelecionados.add((String) spinnerCidadesEventoTab.getSelectedItem());
        itemSelecionados.add((String) spinnerCidadesIngressoTab.getSelectedItem());
        itemSelecionados.add((String) spinnerTema.getSelectedItem());
        itemSelecionados.add((String) spinnerTag.getSelectedItem());
        itemSelecionados.add((String) spinnerNomeDoEvento.getSelectedItem());
        return  itemSelecionados;
    }
}