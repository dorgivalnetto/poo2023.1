package br.edu.ufca.poo.lista2.questao1.modelo;

public class ContatoTelefoneResidencial extends ContatoTelefone {
	/** Construtor. */
	public ContatoTelefoneResidencial(String nome, String telefone) {
		super(nome, telefone);
	}

	@Override
	public String getTipo() {
		return "Residencial";
	}
}