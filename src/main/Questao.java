package main;

public class Questao {
	private int idQuestao;
	protected String enunciado;
	protected int nivelDificuldade;
	
	public Questao(int idQuestao, String enunciado, int nivelDificuldade) {
		super();
		this.idQuestao = idQuestao;
		this.enunciado = enunciado;
		this.nivelDificuldade = nivelDificuldade;
	}
	
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
	public int getNivelDificuldade() {
		return nivelDificuldade;
	}
	public void setNivelDificuldade(int nivelDificuldade) {
		this.nivelDificuldade = nivelDificuldade;
	}
	
}
