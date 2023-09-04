package main;

public class VerdadeiroFalso extends Questao{
	private String[] opcoes;
	private char[] opcoesResposta;
	
	public VerdadeiroFalso(int idQuestao, String enunciado, int nivelDificuldade, String[] opcoes, char[] opcoesResposta) {
		super(idQuestao, enunciado, nivelDificuldade);
		this.opcoes = opcoes;
		this.opcoesResposta = opcoesResposta;
	}
	
	public String[] getOpcoes() {
		return opcoes;
	}
	public void setOpcoes(String[] opcoes) {
		this.opcoes = opcoes;
	}
	public char[] getOpcoesResposta() {
		return opcoesResposta;
	}
	public void setOpcoesResposta(char[] opcoesResposta) {
		this.opcoesResposta = opcoesResposta;
	}
}
