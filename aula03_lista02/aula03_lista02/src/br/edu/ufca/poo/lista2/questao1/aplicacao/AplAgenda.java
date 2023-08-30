package br.edu.ufca.poo.lista2.questao1.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.ufca.poo.lista2.questao1.modelo.Contato;
import br.edu.ufca.poo.lista2.questao1.modelo.ContatoEmail;
import br.edu.ufca.poo.lista2.questao1.modelo.ContatoFax;
import br.edu.ufca.poo.lista2.questao1.modelo.ContatoTelefoneCelular;
import br.edu.ufca.poo.lista2.questao1.modelo.ContatoTelefoneComercial;
import br.edu.ufca.poo.lista2.questao1.modelo.ContatoTelefoneResidencial;

public final class AplAgenda {
	private static final Scanner scanner = new Scanner(System.in);
	
	/** Onde são mantidos os contatos. */
	private static List<Contato> contatos = new ArrayList<Contato>();
	
	/** Adiciona um contato. */
	private static void adicionarContato(Contato contato) {
		contatos.add(contato);
	}
	
	/** Obtém um contato, dado o índice. */
	private static Contato obterContato(int indice) {
		if (indice < contatos.size()) return (Contato)contatos.get(indice);
		else return null;
	}
	
	/** Imprime todos os contatos e seus índices. */
	private static void imprimirContatos() {
		if (contatos.size() == 0) System.out.println("\tAgenda vazia.");
		else for (int i = 0; i < contatos.size(); i++) {
			Contato contato = (Contato)contatos.get(i);
			System.out.println("\t" + i + ": " + contato.getNome() + " (" +
				contato.getTipo() + ")");
		}
		System.out.println();
	}
	
	/** Lê do teclado. */
	private static String lerTeclado() {
		return scanner.nextLine();
	}

	/** Método main. */
	public static void main(String[] args) {
		System.out.println("Bem-vindo à Agenda.\n");
		System.out.println("Digite o comando. '?' para ajuda e 'S' para sair.");
		System.out.print("\n> ");
		
		// Lê o comando.
		String comando = lerTeclado();
		
		// Continua pedindo comandos até encontrar o comando S, de sair.
		while (! "S".equalsIgnoreCase(comando)) {
			// Comando ?: ajuda.
			if ("?".equals(comando)) {
				System.out.println(
						"\nCOMANDOS DISPONIVEIS:\n" +
						" ?: Mostra esta lista de comandos;\n\n" +
						" A: Mostra a agenda;\n" +
						" C: Mostra um contato da agenda;\n" +
						" S: Sai do programa;\n\n" +
						"+TR: Adiciona um telefone residencial;\n" +
						"+TT: Adiciona um telefone comercial (trabalho);\n" + 
						"+TC: Adiciona um telefone celular;\n" +
						"+F: Adiciona um fax;\n" +
						"+E: Adiciona um email."
						);
			}
			
			// Comando A: mostrar agenda.
			else if ("A".equalsIgnoreCase(comando)) {
				System.out.println("\nAGENDA:");
				imprimirContatos();
			}
			
			// Comando C: mostrar contato.
			else if ("C".equalsIgnoreCase(comando)) {
				executarMostrarContato();
			}
			
			// Comando +T?: adicionar telefone.
			else if ("+TR".equalsIgnoreCase(comando)) {
				executarAdicionarTelefone('R');
			}
			else if ("+TT".equalsIgnoreCase(comando)) {
				executarAdicionarTelefone('T');
			}
			else if ("+TC".equalsIgnoreCase(comando)) {
				executarAdicionarTelefone('C');
			}
			
			// Comando +F: adicionar fax.
			else if ("+F".equalsIgnoreCase(comando)) {
				executarAdicionarFax();
			}
			
			// Comando +E: adicionar email.
			else if ("+E".equalsIgnoreCase(comando)) {
				executarAdicionarEmail();
			}
			
			// Lê o próximo comando.
			System.out.print("\n> ");
			comando = lerTeclado();
		}
		
		// Fecha o scanner.
		if (scanner != null) scanner.close();
	}
	
	/** Comando C: mostrar contato. */
	public static void executarMostrarContato() {
		// Lê o índice.
		System.out.print("\nNúmero: ");
		String indice = lerTeclado();
		
		// Verifica se é um número.
		if (indice.matches("[0-9]+")) {
			// Converte para inteiro.
			int i = Integer.parseInt(indice);
			
			// Verifica se o índice existe.
			if (i < contatos.size()) {
				// Imprime o contato.
				Contato contato = (Contato)contatos.get(i);
				System.out.println(
						"\nNome: " + contato.getNome() +
						"\n" + contato.getTipo() + ": " + contato.getContato()
						);
			}
			
			// Não existe.
			else System.out.println("Agenda não contém item de número " + i);
		}
		
		// Não é número. 
		else System.out.println("Não é um número.");
	}
		
	/** Comando +T?: adicionar telefone. */
	public static void executarAdicionarTelefone(char tipo) {
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		System.out.print("Telefone: ");
		String telefone = scanner.nextLine();
		
		switch(tipo) {
		case 'R': adicionarContato(new ContatoTelefoneResidencial(nome, telefone)); break;
		case 'T': adicionarContato(new ContatoTelefoneComercial(nome, telefone)); break;
		case 'C': adicionarContato(new ContatoTelefoneCelular(nome, telefone)); break;
		}
	}
	
	/** Comando +F: adicionar fax. */
	public static void executarAdicionarFax() {
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		System.out.print("Fax: ");
		String fax = scanner.nextLine();
		adicionarContato(new ContatoFax(nome, fax));
	}
	
	/** Comando +E: adicionar email. */
	public static void executarAdicionarEmail() {
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		System.out.print("Email: ");
		String email = scanner.nextLine();
		adicionarContato(new ContatoEmail(nome, email));
	}
}