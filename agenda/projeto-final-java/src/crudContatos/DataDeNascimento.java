package crudContatos;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(ano, dia, mes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataDeNascimento other = (DataDeNascimento) obj;
		return ano == other.ano && dia == other.dia && mes == other.mes;
	}

}
