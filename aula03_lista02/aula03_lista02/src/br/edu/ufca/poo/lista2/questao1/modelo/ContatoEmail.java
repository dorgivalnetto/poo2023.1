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

	/** @see br.ufes.inf.prog3.lista2.exercicio04.dominio.Contato#getNome() */
	@Override
	public String getNome() {
		return nome;
	}

	/** @see br.ufes.inf.prog3.lista2.exercicio04.dominio.Contato#getContato() */
	@Override
	public String getContato() {
		return email;
	}
	
	/** @see br.ufes.inf.prog3.lista2.exercicio04.dominio.Contato#getTipo() */
	@Override
	public String getTipo() {
		return "Email";
	}
}

