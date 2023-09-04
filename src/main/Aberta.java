package main;

public class Aberta extends Questao{
	private String respostaAproximada;
	
	public Aberta(int idQuestao, String enunciado, int nivelDificuldade, String respostaAproximada) {
		super(idQuestao, enunciado, nivelDificuldade);
		this.respostaAproximada = respostaAproximada;
	}
	
	public String getRespostaAproximada() {
		return respostaAproximada;
	}
	public void setRespostaAproximada(String respostaAproximada) {
		this.respostaAproximada = respostaAproximada;
	}
}
