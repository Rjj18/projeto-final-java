package crudContatos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	public static void main(String [] args) {
		
		ArrayList<Contato> bancoDeDadosContatos = new ArrayList<Contato>();
		
		try (Scanner scanner = new Scanner(System.in)) {
			Boolean continua = true;
			int menu = 0;
			
			
			do {
				System.out.println("\n SELECIONE UMA OPCAO:\n");
				System.out.println("1- Adicionar novo cliente.\n");
				System.out.println("2- Remover um cliente.\n");
				System.out.println("3- Listar todos os clientes:\n");
				System.out.println("4- Consultar lista de contatos por nome:\n");
				System.out.println("5- Consultar lista de contatos por cpf:\n");
				
				menu = scanner.nextInt();
				
				switch(menu) {
				case 1:
					Contato contato = cadastrarContato(bancoDeDadosContatos.size());
					bancoDeDadosContatos.add(contato);
					break;
				
				case 2:
					int id;
					System.out.println("\nInforme o ID do usuario a ser removido: ");
					id = scanner.nextInt();
					bancoDeDadosContatos.remove(id - 1);
					break;
					
				case 3:
					imprimirContatos(bancoDeDadosContatos);
					break;
					
				case 4:
				
				System.out.println(buscaNome(bancoDeDadosContatos));
					
				case 5:
					
				}
				
			} while (continua);
		}		
		
	}
		private static void imprimirContatos(ArrayList<Contato> bancoDeDadosContatos) {
		System.out.println("\n----IMPRIMINDO LISTA DE CLIENTES----");
		
		for (Contato contato: bancoDeDadosContatos) {
			System.out.println(contato.toString());
			}
		}
		
		
		public static Contato cadastrarContato(int tamanhoLista) {
			Scanner scanner = new Scanner(System.in);
			
			String nome, email, rua, cidade, estado;
			int numeroTelefone, dia, mes, ano, cpf;
			
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
			
			System.out.println("\n Digite o dia de nascimento do contato:");
			dia = scanner.nextInt();
			
			System.out.println("\n Digite o m??s de nascimento do contato:");
			mes = scanner.nextInt();
			
			System.out.println("\n Digite o ano de nascimento do contato:");
			ano = scanner.nextInt();
			
			System.out.println("\n Digite o CPF do contato:");
			cpf = scanner.nextInt();
			
			System.out.println("\n Digite o n??mero de telefone do contato:");
			numeroTelefone = scanner.nextInt();
	
			Endereco endereco = new Endereco(rua, cidade, estado);
			
			DataDeNascimento dataDeNascimento = new DataDeNascimento(dia, mes, ano);
			
			Contato contato = new Contato(tamanhoLista + 1, nome, email, endereco, dataDeNascimento, cpf, numeroTelefone);
			
			return contato;			
						
		}
		public static Contato buscaNome (ArrayList<Contato> bancoDeDadosContatos) {
			
			Scanner scanner = new Scanner(System.in);
			String nomeInformado;
		
			for(Contato contato: bancoDeDadosContatos) {
				
				System.out.println("\n Digite o nome do contato:");
				nomeInformado = scanner.nextLine();
				 
				if (contato.getNome().equals(nomeInformado)) {
					
					return contato; }
			}
			return null;
		}
		
}
