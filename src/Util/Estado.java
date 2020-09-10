package Util;

public class Estado {
	
	private boolean valor;
	private boolean ehFinal;
	
	public Estado() {
		valor = false;
		ehFinal = false;
	}
	
	public boolean getValor() {
		return valor;
	}

	public void setValor(boolean valor) {
		this.valor = valor;
	}

	public boolean getEhFinal() {
		return ehFinal;
	}

	public void setEhFinal(boolean ehFinal) {
		this.ehFinal = ehFinal;
	}
	
	
}
