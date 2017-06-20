package inf221.trabalho.com.farrago.model;

import java.util.*;

public class Comprador extends Perfil {

	Collection<Vendedor> vendePara;
	private int cpf;
	private List<Ingresso> meusIngressos;

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

	public List<Ingresso> getMeusIngressos() {
		return this.meusIngressos;
	}

	/**
	 * 
	 * @param meusIngressos
	 */
	public void setMeusIngressos(List<Ingresso> meusIngressos) {
		this.meusIngressos = meusIngressos;
	}


}