package crudContatos;

public class contatos {
	
	private int numero;
	private String nome;
	private String email;
	private Endereco endereco;
	private int dataNascimento;
	
	public contatos(int numero, String nome, String email, Endereco endereco, int dataNascimento) {
		this.numero = numero;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		}
	
	@Override
	public String toString() {
		return "não implementado"

	}
}
