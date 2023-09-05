package main;

public class MultiplaEscolha extends Questao{
	
	private String[] alternativas;
	private int alternativaCorreta;
	
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
	public void addAlternativa(String alternativa, int index) {
		if (index >= alternativas.length) {
            // Aumentar o tamanho do array ou usar ArrayList em vez de array regular
            String[] temp = new String[index + 1];
            System.arraycopy(alternativas, 0, temp, 0, alternativas.length);
            alternativas = temp;
        }
        alternativas[index] = alternativa;
    }
}
