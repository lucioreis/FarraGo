package inf221.trabalho.com.farrago.model;

import com.j256.ormlite.dao.Dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import java.sql.SQLException;
import java.util.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import inf221.trabalho.com.farrago.R;
import inf221.trabalho.com.farrago.model.DatabaseHelper;
import inf221.trabalho.com.farrago.model.Ingresso;
import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.Dao;

public final class FachadaSingleton extends Activity {
    private static final FachadaSingleton ourInst = new FachadaSingleton();

    private DatabaseHelper databaseHelper = null;
    private Dao<Ingresso, Integer> IngressoDao;
    private List<Ingresso> ingressos = new ArrayList<>();

    private Dao<Evento, Integer> EventoDao;
    private List<Evento> eventos = new ArrayList<>();

    private Dao<CompradorIngresso, Integer> CompradorIngressoDao;
    private List<CompradorIngresso> compradorIngressos = new ArrayList<>();

    private Dao<Comprador, Integer> CompradorDao;
    private List<Comprador> compradores = new ArrayList<>();

    private List<String> nomeDeCidade, tags;
    private  List<Date> dataDasFestas = new ArrayList<>();

    private Comprador comprador;

    private FachadaSingleton(){}

    private enum Filtro{ CIDADE_EVENTO, CIDADE_INGRESSO, TEMA, TAG, NOME }
    private boolean cidade, preço, nomeDoEvento, reputacao, data, tema, faixa, tag;
    private List<String> filtros;
    private void daoCidades(){
        if(nomeDeCidade == null){
            nomeDeCidade = new ArrayList<>();
        }
        if(EventoDao == null){
            try {
                EventoDao = getHelper().getEventoDao();
                eventos = EventoDao.queryForAll();
            } catch (SQLException e) {
                // OI OI
            }
            Date d = new Date();
            for(int i = 0; i < eventos.size(); i++)
                if(eventos.get(i).data.after(d) || eventos.get(i).data.equals(d))
                    eventos.remove(i);
        }

        Set<String> cidadesDiferentes = new HashSet<>();
        for(int i = 0; i < eventos.size(); i++){
            if(!cidadesDiferentes.contains(eventos.get(i).cidade)) {
                cidadesDiferentes.add(eventos.get(i).cidade);
                nomeDeCidade.add(eventos.get(i).cidade);
            }
        }

    }

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.busca_tab_ingressos);
    }*/

    private DatabaseHelper getHelper() {
        if (databaseHelper == null) {
            databaseHelper = OpenHelperManager.getHelper(this, DatabaseHelper.class);
        }
        return databaseHelper;
    }

    private void daoTags(){
        if(tags == null){
            tags = new ArrayList<>();
        }
        if(EventoDao == null){
            try {
                EventoDao = getHelper().getEventoDao();
                eventos = EventoDao.queryForAll();
            } catch (SQLException e) {
                // OI OI
            }
            Date d = new Date();
            for(int i = 0; i < eventos.size(); i++)
                if(eventos.get(i).data.after(d) || eventos.get(i).data.equals(d))
                    eventos.remove(i);
        }

        Set<String> tagsDiferentes = new HashSet<>();
        for(int i = 0; i < eventos.size(); i++){
            if(!tagsDiferentes.contains(eventos.get(i).tag)) {
                tagsDiferentes.add(eventos.get(i).tag);
                tags.add(eventos.get(i).tag);
            }
        }
    }

    private void daoTema(){
        daoTags();
    }

    private void daoUser(){
        int idUser = 123456; // Nao existe login no nosso sistema. Entao tem que supor um id de usuario
        if(CompradorDao == null){
            try {
                CompradorDao = getHelper().getCompradorDao();
                compradores = CompradorDao.queryForAll();
            }  catch (SQLException e) {
                // OI OI
            }
        }
        if(CompradorIngressoDao == null){
            try {
                CompradorIngressoDao = getHelper().getCompradorIngressoDao();
                compradorIngressos = CompradorIngressoDao.queryForAll();
            } catch (SQLException e) {
                // OI OI
            }
        }
        List<Ingresso> meusIngressos = new ArrayList<>();
        int cpf=-1;

        for(int i = 0; i < compradores.size(); i++)
            if(compradores.get(i).getIdComprador() == idUser){
                cpf = compradores.get(i).getCpf();
                break;
            }

        for(int i = 0; i < compradorIngressos.size(); i++){
            if(compradorIngressos.get(i).comprador.idComprador == idUser)
                meusIngressos.add(compradorIngressos.get(i).ingresso);
        }

        comprador.setCpf(cpf);
        comprador.setMeusIngressos(meusIngressos);
    }

    public void setFiltros(List<String> l){
        filtros = l;
    }

    public List getNomeDeCidades(){
        return nomeDeCidade;
    }

    public List getEventos(String nomeDeAlgumaCidade, Date data, String[] tags, String tema){
        List<Evento> eventosSemFiltros = new ArrayList<>();
        Date d = new Date();
        if(EventoDao == null){
            try {
                EventoDao = getHelper().getEventoDao();
                eventos = EventoDao.queryForAll();
            } catch (SQLException e) {
                // OI OI
            }
            for(int i = 0; i < eventos.size(); i++)
                if(eventosSemFiltros.get(i).data.after(d) || eventosSemFiltros.get(i).data.equals(d))
                    eventos.remove(i);
        }
        eventosSemFiltros = eventos;
        if(nomeDeAlgumaCidade != null && !nomeDeAlgumaCidade.isEmpty()){ // selecionar por nome
            for(int i = 0; i < eventosSemFiltros.size(); i++){
                if(!eventosSemFiltros.get(i).cidade.equals(nomeDeAlgumaCidade))
                    eventosSemFiltros.remove(i);
            }
        }
        if(data != null){ // selecionar por data
            for(int i = 0; i < eventosSemFiltros.size(); i++){
                if(eventosSemFiltros.get(i).data.after(data) || eventosSemFiltros.get(i).data.equals(data))
                    eventosSemFiltros.remove(i);
            }
        }
        if(tags != null && tags.length > 0) { // selecionar por tag
            for (int i = 0; i < eventosSemFiltros.size(); i++) {
                boolean deu = false;
                for (int j = 0; j < tags.length; j++) {
                    if (eventosSemFiltros.get(i).tag.equals(tags[i]))
                        deu = true;
                }
                if (!deu) eventosSemFiltros.remove(i);
            }
        }
        // Nao existe filtro de tema. Existe um problema na documentacao relacionado a esse campo
        return eventosSemFiltros; // todos filtros aplicados
    }
    public List<Ingresso> getIngressosPorCida(String nomeDeAlgumaCidade, String nomeDoEvento, int reputacaoDosVendedores){
        List<Ingresso> ingressosSemFiltros;
        if(IngressoDao == null){
            try {
                IngressoDao = getHelper().getIngressoDao();
                ingressos = IngressoDao.queryForAll();
            } catch (SQLException e) {
                // OI OI
            }
            for(int i = 0; i < ingressos.size(); i++)
                if(!ingressos.get(i).disponivel) ingressos.remove(i);
        }
        ingressosSemFiltros = ingressos;

        for(int i = 0; i < ingressosSemFiltros.size(); i++)
            if(ingressosSemFiltros.get(i).vendedor.getAvaliacao() < reputacaoDosVendedores)
                ingressosSemFiltros.remove(i);

        if(nomeDeAlgumaCidade != null && !nomeDeAlgumaCidade.isEmpty()){
            for(int i = 0; i < ingressosSemFiltros.size(); i++)
                if(!ingressosSemFiltros.get(i).cidade.equals(nomeDeAlgumaCidade))
                    ingressosSemFiltros.remove(i);
        }

        return ingressosSemFiltros; // filtros aplicados

    }

    public static FachadaSingleton getOurInst(){ return ourInst;}

}
