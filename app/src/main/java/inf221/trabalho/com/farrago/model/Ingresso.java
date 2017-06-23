package inf221.trabalho.com.farrago.model;

import java.io.Serializable;
import com.j256.ormlite.field.DatabaseField;

public class Ingresso implements Serializable {

	@DatabaseField(generatedId = true)
	public int idIngresso;

	@DatabaseField(canBeNull = false, foreign = true, foreignAutoRefresh = true)
	public Evento evento;

	@DatabaseField(canBeNull = false, foreign = true, foreignAutoRefresh = true)
	public Vendedor vendedor;

	public int numero;

	public int lote;

	public float preco;

	public String cidade;

	public int tipoDeIngresso;
	// 0 -> ingresso do organizador | 1 -> ingresso vendedor

	public boolean disponivel;

	public Ingresso() {
	}

	public Ingresso(Evento ev, Vendedor ven, int num, int lt, float pr, String cid, int tpI, boolean disp) {
		this.evento = ev;
		this.vendedor = ven;
		this.numero = num;
		this.lote = lt;
		this.preco = pr;
		this.cidade = cid;
		this.tipoDeIngresso = tpI;
		this.disponivel = disp;
	}

}
//	public void setEvento(Evento e){
//		evento = e;
//	}
//	public Evento getEvento(){
//		return evento;
//	}
//
//	public Integer getNumero() {
//		return this.numero;
//	}
//
//	/**
//	 *
//	 * @param numero
//	 */
//	public void setNumero(Integer numero) {
//		this.numero = numero;
//	}
//
//	public Float getPreco() {
//		return this.preco;
//	}
//
//	/**
//	 *
//	 * @param preco
//	 */
//	public void setPreco(Float preco) {
//		this.preco = preco;
//	}
//
//	public Integer getLote() {
//		return this.lote;
//	}
//
//	/**
//	 *
//	 * @param lote
//	 */
//	public void setLote(Integer lote) {
//		this.lote = lote;
//	}
//
//	public int getTipoDeIngresso() {
//		return this.tipoDeIngresso;
//	}
//
//	/**
//	 *
//	 * @param tipoDeIngresso
//	 */
//	public void setTipoDeIngresso(int tipoDeIngresso) {
//		this.tipoDeIngresso = tipoDeIngresso;
//	}
//
//	@Override
//	public String toString(){
//		return evento.getNomeDoEvento();
//	}
