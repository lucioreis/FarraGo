package inf221.trabalho.com.farrago.model;

import com.j256.ormlite.field.DatabaseField;

import java.util.*;

public class Vendedor extends Perfil {
	@DatabaseField(generatedId = true)
	int idVendedor;
	Collection<Comprador> avalia;
	@DatabaseField(unique = true)
	private int cpf;
	private List<Ingresso> ingressosVenda;
	@DatabaseField(columnName = "avaliacao")
	private int avaliacao;

	public int getCpf() {
		return this.cpf;
	}

	/**
	 * 
	 * @param cpf
	 */
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public List<Ingresso> getIngressosVenda() {
		return this.ingressosVenda;
	}

	/**
	 * 
	 * @param ingressosVenda
	 */
	public void setIngressosVenda(List<Ingresso> ingressosVenda) {
		this.ingressosVenda = ingressosVenda;
	}

	public int getAvaliacao() {
		return this.avaliacao;
	}

	/**
	 * 
	 * @param avaliacao
	 */
	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}

}