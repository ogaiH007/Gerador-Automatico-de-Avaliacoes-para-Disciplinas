package main;

public abstract class Questao {
	private int idQuestao;
	protected String enunciado;
	protected float nivelDificuldade;
	
	public int getIdQuestao() {
		return idQuestao;
	}
	public void setIdQuestao(int idQuestao) {
		this.idQuestao = idQuestao;
	}
	public String getEnunciado() {
		return enunciado;
	}
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	public float getNivelDificuldade() {
		return nivelDificuldade;
	}
	public void setNivelDificuldade(float nivelDificuldade) {
		this.nivelDificuldade = nivelDificuldade;
	}
	
}
