package br.edu.ufca.poo.lista2.questao1.modelo;

public class ContatoFax extends ContatoTelefone {
	/** Construtor. */
	public ContatoFax(String nome, String telefone) {
		super(nome, telefone);
	}

	@Override
	public String getTipo() {
		return "Fax";
	}
}

