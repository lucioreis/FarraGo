package inf221.trabalho.com.farrago.model;

import java.io.Serializable;

public class Ingresso implements Serializable {

	private Evento evento;
	private Integer numero;
	private Float preco;
	private Integer lote;
	private int tipoDeIngresso;

	public Ingresso(){}

	public Ingresso(int numero, float preço, int lote, int tipoDeIngresso){
		this.numero = numero;
		this.preco = preço;
		this.lote = lote;
		this.tipoDeIngresso = tipoDeIngresso;
	}

	public void setEvento(Evento e){
		evento = e;
	}
	public Evento getEvento(){
		return evento;
	}

	public Integer getNumero() {
		return this.numero;
	}

	/**
	 * 
	 * @param numero
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Float getPreco() {
		return this.preco;
	}

	/**
	 * 
	 * @param preco
	 */
	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public Integer getLote() {
		return this.lote;
	}

	/**
	 * 
	 * @param lote
	 */
	public void setLote(Integer lote) {
		this.lote = lote;
	}

	public int getTipoDeIngresso() {
		return this.tipoDeIngresso;
	}

	/**
	 * 
	 * @param tipoDeIngresso
	 */
	public void setTipoDeIngresso(int tipoDeIngresso) {
		this.tipoDeIngresso = tipoDeIngresso;
	}

	@Override
	public String toString(){
		return evento.getNomeDoEvento();
	}


}