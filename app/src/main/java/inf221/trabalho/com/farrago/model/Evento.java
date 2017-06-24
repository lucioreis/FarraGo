package inf221.trabalho.com.farrago.model;

import com.j256.ormlite.field.DatabaseField;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

public class Evento implements Serializable {

	@DatabaseField(generatedId = true)
	public int idEvento;

	public String nomeDoEvento;

	public String cidade;

	public Date data;

	public Time horario;

	public int faixaEtaria;

	@DatabaseField(canBeNull = false, foreign = true, foreignAutoRefresh = true)
	public Ingresso ingresso;

	public int numeroDeIngressos;

	public String tag;

	public Evento(){}

	public Evento(String nEv, String cid, Date dt, Time h, int fxE, Ingresso ing, int nIng){
		this.nomeDoEvento = nEv;
		this.cidade = cid;
		this.data = dt;
		this.horario = h;
		this.faixaEtaria = fxE;
		this.ingresso = ing;
		this.numeroDeIngressos = nIng;
	}

	public String getNomeDoEvento() {
		return this.nomeDoEvento;
	}

	/**
	 *
	 * @param nomeDoEvento
	 */
	public void setNomeDoEvento(String nomeDoEvento) {
		this.nomeDoEvento = nomeDoEvento;
	}

	public String getLocal() {
		return this.cidade;
	}

	/**
	 *
	 * @param local
	 */
	public void setLocal(String local) {
		this.cidade = local;
	}

	public Date getData() {
		return this.data;
	}

	/**
	 *
	 * @param data
	 */
	public void setData(Date data) {
		this.data = data;
	}

	public Time getHorario() {
		return this.horario;
	}

	/**
	 *
	 * @param horario
	 */
	public void setHorario(Time horario) {
		this.horario = horario;
	}

	public int getFaixaEtaria() {
		return this.faixaEtaria;
	}

	/**
	 *
	 * @param faixaEtaria
	 */
	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public Ingresso getIngresso() {
		return this.ingresso;
	}

	/**
	 *
	 * @param ingresso
	 */
	public void setIngresso(Ingresso ingresso) {
		this.ingresso = ingresso;
	}

	public int getNumeroDeIngressos() {
		return this.numeroDeIngressos;
	}

	/**
	 *
	 * @param numeroDeIngressos
	 */
	public void setNumeroDeIngressos(int numeroDeIngressos) {
		this.numeroDeIngressos = numeroDeIngressos;
	}

	/**
	 *
	 * @param numeroDeIngressos
	 * @param preco
	 * @param tipoDeIngresso
	 */
	/*public void cadastraIngressos(int numeroDeIngressos, float preco, int lote, int tipoDeIngresso) {
		ingresso = new Ingresso(numeroDeIngressos, preco, lote, tipoDeIngresso);
		this.numeroDeIngressos = numeroDeIngressos;
	}*/

}