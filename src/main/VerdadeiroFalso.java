package main;

public class VerdadeiroFalso extends Questao{
	private String[] opcoes;
	private char[] opcoesResposta;
	
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
	public void addOpcao(String opcao, int index) {
		if (index >= opcoes.length) {
            // Aumentar o tamanho do array ou usar ArrayList em vez de array regular
            String[] temp = new String[index + 1];
            System.arraycopy(opcoes, 0, temp, 0, opcoes.length);
            opcoes = temp;
        }
        opcoes[index] = opcao;
    }
}
