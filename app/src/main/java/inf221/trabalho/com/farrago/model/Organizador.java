package inf221.trabalho.com.farrago.model;

public class Organizador extends Perfil {

	private String nomeFantasia;
	private String nomeDaEmpresa;
	private int CNPJ;
	private String endereco;

	public String getNomeFantasia() {
		return this.nomeFantasia;
	}

	/**
	 * 
	 * @param nomeFantasia
	 */
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getNomeDaEmpresa() {
		return this.nomeDaEmpresa;
	}

	/**
	 * 
	 * @param nomeDaEmpresa
	 */
	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		this.nomeDaEmpresa = nomeDaEmpresa;
	}

	public int getCNPJ() {
		return CNPJ;
	}

	/**
	 * 
	 * @param CNPJ
	 */
	public void setCNPJ(int CNPJ) {
		this.CNPJ = CNPJ;
	}

	public String getEndereco() {
		return this.endereco;
	}

	/**
	 * 
	 * @param endereco
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}