package crudContatos;

import java.util.Objects;

public class Endereco {
	
	private String rua;
	private String cidade;
	private String estado;
	
	public Endereco(String rua, String cidade, String estado) {
		this.rua = rua;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	@Override
	public String toString( ) {
		return "\n ENDERECO DO CONTATO:" + rua + "" + cidade + "/" + estado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cidade, estado, rua);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(cidade, other.cidade) && Objects.equals(estado, other.estado)
				&& Objects.equals(rua, other.rua);
	}
	
}
