package inf221.trabalho.com.farrago.model;

import java.util.*;

public class Comprador extends Perfil {
	private static Comprador comprador = new Comprador();
	Collection<Vendedor> vendePara;
	private int cpf;
	private List<Ingresso> meusIngressos;
	private Comprador(){}
	public int getCpf() {
		return this.cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public List<Ingresso> getMeusIngressos() {
		return this.meusIngressos;
	}

	public void setMeusIngressos(List<Ingresso> meusIngressos) {
		this.meusIngressos = meusIngressos;
	}

	public void addIngresso(Ingresso ingresso){
		if(meusIngressos == null) meusIngressos = new ArrayList<Ingresso>();
		meusIngressos.add(ingresso);
	}

	public static Comprador getInstance(){
		//TODO - Passar metodo para uma fachadaSingletone
		return comprador;
	}

}