package Util;
import java.util.ArrayList;

public class Automato {

	private ArrayList<Estado> estados = new ArrayList<Estado>();
	
	public ArrayList<Estado> getEstados() {
		return estados;
	}

	public void setEstados(ArrayList<Estado> estados) {
		this.estados = estados;
	}
	
	public boolean processaPalavra(String palavra, int numExercicio) {
		
		if(numExercicio==1) {
			
			for(int i=0; i<3; i++)
				this.getEstados().add(new Estado());
			
			String[] palavraSeparada = palavra.split("");
			
			//Inicia no estado 0 e seta os estados 0, 1 e 2 como finais
			this.getEstados().get(0).setValor(true);
			this.getEstados().get(0).setEhFinal(true);
			this.getEstados().get(1).setEhFinal(true);
			this.getEstados().get(2).setEhFinal(true);
			System.out.println("Transicao de estados (palavra lida)");
			int posicaoPalavra = 0;
			for(String letra : palavraSeparada) {
				if(letra.equals("a")) {
					if(this.getEstados().get(0).getValor()) {
						System.out.println("estado 0 para 1 (lendo a)");
						if(posicaoPalavra == palavra.length()-1) {
							System.out.println("estado final 1, aceito");
							return true;
						}
						
						this.getEstados().get(0).setValor(false);
						this.getEstados().get(1).setValor(true);
						posicaoPalavra++;
					}
					else if(this.getEstados().get(1).getValor()) {
						System.out.println("estado 1 para 1 (lendo a)");
						if(posicaoPalavra == palavra.length()-1) {
							System.out.println("estado final 1, aceito");
							return true;
						}
						
						posicaoPalavra++;
					}
					else if(this.getEstados().get(2).getValor()) {
						System.out.println("estado 2 para 2 (lendo a)");
						if(posicaoPalavra == palavra.length()-1) {
							System.out.println("estado final 2, rejeitado");
							return false;
						}
						
						posicaoPalavra++;
					}
				}
				else if(letra.equals("b")) {
					if(this.getEstados().get(0).getValor()) {
						System.out.println("estado 0 para 0 (lendo b)");
						if(posicaoPalavra == palavra.length()-1)
							return true;
						
						posicaoPalavra++;
					}
					else if(this.getEstados().get(1).getValor()) {
						System.out.println("estado 1 para 2 (lendo b)");
						if(posicaoPalavra == palavra.length()-1) {
							System.out.println("estado final 2, aceito");
							return true;
						}
						
						this.getEstados().get(1).setValor(false);
						this.getEstados().get(2).setValor(true);
						posicaoPalavra++;
					}
					else if(this.getEstados().get(2).getValor()) {
						System.out.println("estado 2 para 0(lendo b)");
						if(posicaoPalavra == palavra.length()-1) {
							System.out.println("estado final 0, aceito");
							return true;
						}
						
						this.getEstados().get(2).setValor(false);
						this.getEstados().get(0).setValor(true);
						posicaoPalavra++;
					}
				}
			}
		}
		
		else if(numExercicio==2) {
			
			for(int i=0; i<6; i++)
				this.getEstados().add(new Estado());
			
			String[] palavraSeparada = palavra.split("");
			
			//Inicia no estado 0 e seta o estado 1 como final
			this.getEstados().get(0).setValor(true);
			this.getEstados().get(1).setEhFinal(true);
			
			int posicaoPalavra = 0;
			for(String letra : palavraSeparada) {
				if(letra.equals("a")) {
					if(this.getEstados().get(0).getValor()) {
						System.out.println("estado 0 para 1 (lendo a)");
						if(posicaoPalavra == palavra.length()-1) {
							System.out.println("estado final 1, aceito");
							return true;
						}
						
						this.getEstados().get(0).setValor(false);
						this.getEstados().get(1).setValor(true);
						posicaoPalavra++;
					}
					else if(this.getEstados().get(1).getValor()) {
						System.out.println("estado 1 para 3 (lendo a)");
						if(posicaoPalavra == palavra.length()-1) {
							System.out.println("estado final 3, rejeitado");
							return false;
						}
						
						this.getEstados().get(1).setValor(false);
						this.getEstados().get(3).setValor(true);
						posicaoPalavra++;
					}
					else if(this.getEstados().get(2).getValor()) {
						System.out.println("estado 2 para 4 (lendo a)");
						if(posicaoPalavra == palavra.length()-1) {
							System.out.println("estado final 4, rejeitado");
							return false;
						}
						
						this.getEstados().get(2).setValor(false);
						this.getEstados().get(4).setValor(true);
						posicaoPalavra++;
					}
					else if(this.getEstados().get(3).getValor()) {
						System.out.println("estado 3 para 1 (lendo a)");
						if(posicaoPalavra == palavra.length()-1) {
							System.out.println("estado final 1, aceito");
							return true;
						}
						
						this.getEstados().get(3).setValor(false);
						this.getEstados().get(1).setValor(true);
						posicaoPalavra++;
					}
					else if(this.getEstados().get(4).getValor()) {
						System.out.println("estado 4 para 5 (lendo a)");
						if(posicaoPalavra == palavra.length()-1) {
							System.out.println("estado final 5, rejeitado");
							return false;
						}
						
						this.getEstados().get(4).setValor(false);
						this.getEstados().get(5).setValor(true);
						posicaoPalavra++;
					}
					else if(this.getEstados().get(5).getValor()) {
						System.out.println("estado 5 para 4 (lendo a)");
						if(posicaoPalavra == palavra.length()-1) {
							System.out.println("estado final 4, rejeitado");
							return false;
						}
						
						this.getEstados().get(5).setValor(false);
						this.getEstados().get(4).setValor(true);
						posicaoPalavra++;
					}
				}
				else if(letra.equals("b")) {
					if(this.getEstados().get(0).getValor()) {
						System.out.println("estado 0 para 2 (lendo b)");
						if(posicaoPalavra == palavra.length()-1) {
							System.out.println("estado final 2, rejeitado");
							return false;
						}
						
						this.getEstados().get(0).setValor(false);
						this.getEstados().get(2).setValor(true);
						posicaoPalavra++;
					}
					else if(this.getEstados().get(1).getValor()) {
						System.out.println("estado 1 para 2 (lendo b)");
						if(posicaoPalavra == palavra.length()-1) {
							System.out.println("estado final 2, rejeitado");
							return false;
						}
						
						this.getEstados().get(1).setValor(false);
						this.getEstados().get(2).setValor(true);
						posicaoPalavra++;
					}
					else if(this.getEstados().get(2).getValor()) {
						System.out.println("estado 2 para 1 (lendo b)");
						if(posicaoPalavra == palavra.length()-1) {
							System.out.println("estado final 1, aceito");
							return true;
						}
						
						this.getEstados().get(2).setValor(false);
						this.getEstados().get(1).setValor(true);
						posicaoPalavra++;
					}
					else if(this.getEstados().get(3).getValor()) {
						System.out.println("estado 3 para 2 (lendo b)");
						if(posicaoPalavra == palavra.length()-1) {
							System.out.println("estado final 3, rejeitado");
							return false;
						}
						
						this.getEstados().get(3).setValor(false);
						this.getEstados().get(2).setValor(true);
						posicaoPalavra++;
					}
					else if(this.getEstados().get(4).getValor()) {
						System.out.println("estado 4 para 1 (lendo b)");
						if(posicaoPalavra == palavra.length()-1) {
							System.out.println("estado final 1, aceito");
							return true;
						}
						
						this.getEstados().get(4).setValor(false);
						this.getEstados().get(1).setValor(true);
						posicaoPalavra++;
					}
					else if(this.getEstados().get(5).getValor()) {
						System.out.println("estado 5 para 3 (lendo b)");
						if(posicaoPalavra == palavra.length()-1) {
							System.out.println("estado final 3, rejeitado");
							return false;
						}
						
						this.getEstados().get(5).setValor(false);
						this.getEstados().get(3).setValor(true);
						posicaoPalavra++;
					}
				}
			}
		}
		
		if(numExercicio==3) {
			
			for(int i=0; i<4; i++)
				this.getEstados().add(new Estado());
			
			String[] palavraSeparada = palavra.split("");
			
			//Inicia no estado 0 e seta o estado 3 como final
			this.getEstados().get(0).setValor(true);
			this.getEstados().get(3).setEhFinal(true);
			
			int posicaoPalavra = 0;
			for(String letra : palavraSeparada) {
				if(letra.equals("a")) {
					if(this.getEstados().get(0).getValor()) {
						System.out.println("estado 0 para 1 (lendo a)");
						if(posicaoPalavra == palavra.length()-1) {
							System.out.println("estado final 1, rejeitado");
							return false;
						}
						
						this.getEstados().get(0).setValor(false);
						this.getEstados().get(1).setValor(true);
						posicaoPalavra++;
					}
					else if(this.getEstados().get(1).getValor()) {
						System.out.println("estado 1 para 1 (lendo a)");
						if(posicaoPalavra == palavra.length()-1) {
							System.out.println("estado final 1, aceito");
							return true;
						}
						
						posicaoPalavra++;
					}
					else if(this.getEstados().get(2).getValor()) {
						System.out.println("estado 2 para 2 (lendo a)");
						if(posicaoPalavra == palavra.length()-1) {
							System.out.println("estado final 2, rejeitado");
							return false;
						}
						
						posicaoPalavra++;
					}
				}
				else if(letra.equals("b")) {
					if(this.getEstados().get(0).getValor()) {
						System.out.println("estado 0 para 2 (lendo b)");
						if(posicaoPalavra == palavra.length()-1) {
							System.out.println("estado final 2, rejeitado");
							return false;
						}
						
						this.getEstados().get(0).setValor(false);
						this.getEstados().get(2).setValor(true);
						posicaoPalavra++;
					}
					else if(this.getEstados().get(1).getValor()) {
						System.out.println("estado 1 para 1 (lendo b)");
						if(posicaoPalavra == palavra.length()-1) {
							System.out.println("estado final 1, rejeitado");
							return false;
						}
						
						posicaoPalavra++;
					}
					else if(this.getEstados().get(2).getValor()) {
						System.out.println("estado 2 para 2 (lendo b)");
						if(posicaoPalavra == palavra.length()-1) {
							System.out.println("estado final 3, aceito");
							return true;
						}
						
						posicaoPalavra++;
					}
				}
			}
		}
		System.out.println("estado final de erro, rejeitado");
		return false;
		
	}
	
}
