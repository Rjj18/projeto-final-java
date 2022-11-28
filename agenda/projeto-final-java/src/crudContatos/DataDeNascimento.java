package crudContatos;

public class DataDeNascimento {
	
	private int dia;
	private int mes;
	private int ano;
	
	public DataDeNascimento(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	@Override
	public String toString( ) {
		return "\n TELEFONE DO CONTATO:" + dia + "/" + mes + "/" + ano;
	}

}
