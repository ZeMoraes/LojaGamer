package br.mc.model;

public class Usuario {
	private int id;
	private String login;
	private String senha;
	private String nome;
	private String email;
	private byte[] foto;
	private String fotoType;
	
	public Usuario(int id, String login, String senha, String nome, String email) {
		this.id = id;
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.email = email;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String getFotoType() {
		return fotoType;
	}

	public void setFotoType(String fotoType) {
		this.fotoType = fotoType;
	}
}
