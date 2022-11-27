package crudContatos;

public class Contato {
	
	private int id;
	private int numero;
	private String nome;
	private String email;
	private Endereco endereco;
	private int dataNascimento;
	
	public Contato(int id, int numero, String nome, String email, Endereco endereco, int dataNascimento) {
		this.id = id;
		this.numero = numero;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		}
	
	@Override
	public String toString() {
		return "\n ID DO CONTATO" + id + "\n NOME DO CONTATO:" + nome + "\n EMAIL DO CONTATO:" + email + "\n NUMERO DE TELEFONE DO CONTATO" 
		+ numero + "\n ENDERECO DO CONTATO:" + endereco.toString() + "\n DATA DE NASCIMENTO DO CONTATO:" + dataNascimento ;

	}
}
