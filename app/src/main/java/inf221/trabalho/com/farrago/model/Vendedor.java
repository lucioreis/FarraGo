package inf221.trabalho.com.farrago.model;

import java.util.*;

public class Vendedor extends Perfil {

	Collection<Comprador> avalia;
	private int cpf;
	private List<Ingresso> ingressosVenda;
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