package crudContatos;

import java.util.Objects;

public class Contato {
	
	int id;
	private String nome;
	private String email;
	private Endereco endereco;
	private DataDeNascimento dataDeNascimento;
	private int cpf;
	private int numeroTelefone;
	
	public Contato(int id, String nome, String email, Endereco endereco, DataDeNascimento dataDeNascimento, int cpf,
			int numeroTelefone) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.dataDeNascimento = dataDeNascimento;
		this.cpf = cpf;
		this.numeroTelefone = numeroTelefone;
	}
	
	public String getNome () {	
		return nome;
	}
	
	public int getCpf () {
		
		return cpf;
	}
		
	
	@Override
	public String toString() {
		return "\n ID DO CONTATO" + id + "\n NOME DO CONTATO:" + nome + "\n CPF DO CONTATO: " + cpf + "\n EMAIL DO CONTATO: " + email + "\n ENDERECO DO CONTATO: " + endereco.toString() + "\n DATA DE NASCIMENTO DO CONTATO: " + dataDeNascimento.toString() + "\n CPF DO CONTATO: " + cpf + "\n TELEFONE DO CONTATO: " + numeroTelefone; 
		}
}