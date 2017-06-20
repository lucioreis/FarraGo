package inf221.trabalho.com.farrago.model;

public class Ingresso {

	private Integer numero;
	private Float preco;
	private Integer lote;
	private int tipoDeIngresso;

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

	private void determinaNumero() {
		// TODO - implement Ingresso.determinaNumero
		throw new UnsupportedOperationException();
	}

	private void determinaLote() {
		// TODO - implement Ingresso.determinaLote
		throw new UnsupportedOperationException();
	}

}