package Pacote2;
import Pacote1.*;
public class Supervisor extends Funcionario{
	private String formacao;

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	public String toString() {
		String retorno = super.toString();
		retorno += "Forma��o: "+formacao+"\n";		
		return retorno;
	}
}
