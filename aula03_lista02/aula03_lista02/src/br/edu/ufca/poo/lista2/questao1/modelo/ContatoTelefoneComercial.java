package br.edu.ufca.poo.lista2.questao1.modelo;

public class ContatoTelefoneComercial extends ContatoTelefone {
	/** Construtor. */
	public ContatoTelefoneComercial(String nome, String telefone) {
		super(nome, telefone);
	}

	@Override
	public String getTipo() {
		return "Comercial";
	}
}

