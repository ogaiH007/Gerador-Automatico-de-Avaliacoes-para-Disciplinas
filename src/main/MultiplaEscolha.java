package main;

public class MultiplaEscolha extends Questao{
	
	private String[] alternativas;
	private int alternativaCorreta;
	
	public String[] getAlternativas() {
		return alternativas;
	}
	public void setAlternativas(String alternativa, int posicaoAlternativa) {
		this.alternativas[posicaoAlternativa] = alternativa;
	}
	public int getAlternativaCorreta() {
		return alternativaCorreta;
	}
	public void setAlternativaCorreta(int alternativaCorreta) {
		this.alternativaCorreta = alternativaCorreta;
	}
}
