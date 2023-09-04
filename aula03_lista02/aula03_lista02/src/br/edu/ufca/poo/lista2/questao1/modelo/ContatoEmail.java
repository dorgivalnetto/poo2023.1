package br.edu.ufca.poo.lista2.questao1.modelo;

public class ContatoEmail implements Contato {
	/** Nome da pessoa. */
	protected String nome;
	
	/** Email da pessoa. */
	protected String email;
	
	/** Construtor. */
	public ContatoEmail(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public String getContato() {
		return email;
	}
	
	@Override
	public String getTipo() {
		return "Email";
	}
}

