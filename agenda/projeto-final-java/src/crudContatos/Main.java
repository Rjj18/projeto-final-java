package crudContatos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	public static void main(String [] args) {
		
		ArrayList<Contato> bancoDeDadosContatos = new ArrayList<Contato>();
		
		Scanner scanner = new Scanner(System.in);
		Boolean continua = true;
		int menu = 0;
		
		
		do {
			System.out.println("\n SELECIONE UMA OPCAO:\n");
			System.out.println("1- Adicionar novo cliente.\n");
			System.out.println("2- Remover um cliente.\n");
			System.out.println("3- Listar todos os clientes:\n");
			
			menu = scanner.nextInt();
			
			switch(menu) {
			case 1:
				Contato contato = cadastrarContato(bancoDeDadosContatos.size());
				bancoDeDadosContatos.add(contato);
				break;
			case 2:
				break;
				
			case 3:
				imprimirContatos(bancoDeDadosContatos);
				break;
			}
			
		} while (continua);
		
		
	}
		private static void imprimirContatos(ArrayList<Contato> bancoDeDadosContatos) {
		System.out.println("\n----IMPRIMINDO LISTA DE CLIENTES----");
		
		for (Contato contato: bancoDeDadosContatos) {
			System.out.println(contato.toString());
			
		}
	}
		public static Contato cadastrarContato(int tamanhoLista) {
			Scanner scanner = new Scanner(System.in);
			String numero, nome, email, rua, cidade, estado, dataNascimento;
			
			System.out.println("\n Digite o numero do contato:");
			numero = scanner.nextLine();
			
			System.out.println("\n Digite o nome do contato:");
			nome = scanner.nextLine();
			
			System.out.println("\n Digite o email do contato:");
			email = scanner.nextLine();
			
			System.out.println("\n Digite a rua do contato:");
			rua = scanner.nextLine();
			
			System.out.println("\n Digite a cidade do contato:");
			cidade = scanner.nextLine();
			
			System.out.println("\n Digite o estado do contato:");
			estado = scanner.nextLine();
			
			System.out.println("\n Digite a data de nascimento do contato:");
			dataNascimento = scanner.nextLine();
			
			Endereco endereco = new Endereco(rua, cidade, estado);
			Contato contato = new Contato(tamanhoLista + 1, numero, nome, email, endereco, dataNascimento);
			return contato;
			
			
			
			
		}
}
