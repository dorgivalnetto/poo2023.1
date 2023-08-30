package br.edu.ufca.poo.lista2.questao10;

//Fábrica de lâmpadas: cria objetos que seguem a interface Lampada.
public class FabricaLampada {
	
    /** Classe interna aninhada que representa uma lâmpada incandescente. */
	static class Incandescente implements Lampada {
		
		@Override
		public void ligar() {
			System.out.println("Ligou incandescente.");
		}

		
		@Override
		public void desligar() {
			System.out.println("Desligou incandescente.");
		}
	}

	/** Classe interna aninhada que representa uma lâmpada fluorescente. */
	static class Fluorescente implements Lampada {
		
		@Override
		public void ligar() {
			System.out.println("Ligou fluorescente.");
		}

		
		@Override
		public void desligar() {
			System.out.println("Desligou fluorescente.");
		}
	}
	
	/** Constrói uma lâmpada, selecionando o tipo dependendo do parâmetro. */
	public Lampada construir(boolean fluorescente) {
		return fluorescente ? new Fluorescente() : new Incandescente();
	}
}

