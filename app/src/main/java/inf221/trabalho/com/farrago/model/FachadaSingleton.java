package inf221.trabalho.com.farrago.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by lucio on 6/21/2017.
 */

public final class FachadaSingleton {
    private static final FachadaSingleton ourInst = new FachadaSingleton();
    private List<String> nomeDeCidade, tags;
    private  List<Date> dataDasFEstas;

    private Comprador comprador;

    private FachadaSingleton(){}

    private enum Filtro{ CIDADE_EVENTO, CIDADE_INGRESSO, TEMA, TAG, NOME }
    private boolean cidade, preço, nomeDoEvento, reputacao, data, tema, faixa, tag;
    private List<String> filtros;
    private void daoCidades(){
        //TODO-Implementar com o banco de dados
        if(nomeDeCidade == null){
            nomeDeCidade = new ArrayList<>();
        }
        nomeDeCidade.add("Acapulco");
        nomeDeCidade.add("Vicosa");
    }

    private void daoTags(){
        //TODO - Deve buscar todas as tags disponiveis no banco de dados, cho que nao precisa ficar no bd mas ta aqui so por garantia
    }

    private void daoTema(){
        //TODO - Deve buscar os temas no banco de dados
    }
    private void daoUser(){
        //TODO- Busca dados do usuario
    }

    public void setFiltros(List<String> l){
        filtros = l;
    }

    public List getNomeDeCidades(){
        return nomeDeCidade;
    }

    public List getEventos(String nomeDeAlgumaCidade, Date data, String[] tags, String tema){
        //TODO - Implementar: Recebe os filtros e retorna uma Lista com os eventos
        throw new UnsupportedOperationException();
    }
    public List getEventosPorCida(String nomeDeAlgumaCidade, String nomeDoEvento, boolean reputacaoDosVendedores){
        //TODO - Implementar: Recebe os filtros e retorna uma Lista com os eventos
        //se reputacao e true tem que considerar uma certa reputacaa, tem que checar nos documentos
        throw new UnsupportedOperationException();
    }

    public static FachadaSingleton getOurInst(){ return ourInst;}

}
