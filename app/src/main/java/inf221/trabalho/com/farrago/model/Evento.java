package inf221.trabalho.com.farrago.model;

import java.sql.Date;
import java.sql.Time;

public class Evento {

	private String nomeDoEvento;
	private String local;
	private Date data;
	private Time horario;
	private int faixaEtaria;
	private Ingresso ingresso;
	private int numeroDeIngressos;

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
		return this.local;
	}

	/**
	 * 
	 * @param local
	 */
	public void setLocal(String local) {
		this.local = local;
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
	public void cadastraIngressos(int numeroDeIngressos, float preco, int tipoDeIngresso) {
		// TODO - implement Evento.cadastraIngressos
		throw new UnsupportedOperationException();
	}

}