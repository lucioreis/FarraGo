package inf221.trabalho.com.farrago.model;

import com.j256.ormlite.field.DatabaseField;

import java.io.Serializable;
import java.util.*;

public class Comprador extends Perfil implements Serializable {
	private static Comprador comprador = new Comprador();
	@DatabaseField(generatedId = true)
	public int idComprador;
	Collection<Vendedor> vendePara;
	@DatabaseField(unique = true)
	private int cpf;
	private List<Ingresso> meusIngressos;
	private Comprador(){}
	public int getCpf() {
		return this.cpf;
	}
	public int getIdComprador() { return this.idComprador; }

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