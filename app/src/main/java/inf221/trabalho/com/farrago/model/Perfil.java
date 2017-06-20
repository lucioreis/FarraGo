package inf221.trabalho.com.farrago.model;

public class Perfil {

	private String nome;
	private String telefone;
	private String senha;
	private String usuario;
	private String email;

	public String getNome() {
		return this.nome;
	}

	/**
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return this.telefone;
	}

	/**
	 * 
	 * @param telefone
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return this.senha;
	}

	/**
	 * 
	 * @param senha
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getUsuario() {
		return this.usuario;
	}

	/**
	 * 
	 * @param usuario
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}