package main;

public class MultiplaEscolha extends Questao{
	
	private String[] alternativas;
	private int alternativaCorreta;
	
	public MultiplaEscolha(int idQuestao, String enunciado, int nivelDificuldade, String[] alternativas, int alternativaCorreta) {
		super(idQuestao, enunciado, nivelDificuldade);
		this.alternativas = alternativas;
		this.alternativaCorreta = alternativaCorreta;
	}
	
	public String[] getAlternativas() {
		return alternativas;
	}
	public void setAlternativas(String[] alternativas) {
		this.alternativas = alternativas;
	}
	public int getAlternativaCorreta() {
		return alternativaCorreta;
	}
	public void setAlternativaCorreta(int alternativaCorreta) {
		this.alternativaCorreta = alternativaCorreta;
	}
}
