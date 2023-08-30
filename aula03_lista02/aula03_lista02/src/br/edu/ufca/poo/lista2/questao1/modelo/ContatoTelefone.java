package br.edu.ufca.poo.lista2.questao1.modelo;

public abstract class ContatoTelefone implements Contato {
	/** Nome da pessoa. */
	protected String nome;
	
	/** Telefone da pessoa. */
	protected String telefone;
	
	/** Construtor. */
	public ContatoTelefone(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public String getContato() {
		return telefone;
	}
}

