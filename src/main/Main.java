package main;

public class Main {

    public static void main(String[] args) {
        int i;
    	int numQuestoesMultiplaEscolha = 1;
        int numQuestoesVerdadeiroFalso = 1;
        int numQuestoesAberta = 1;
        
        int numQuestoesTotal = numQuestoesAberta + numQuestoesMultiplaEscolha + numQuestoesVerdadeiroFalso;
        MultiplaEscolha[] questao = new MultiplaEscolha[numQuestoesMultiplaEscolha];

        for (i = 0; i < numQuestoesMultiplaEscolha; i++) {
            questao[i] = new MultiplaEscolha();
            questao[i].setEnunciado("Qual é a capital de Pernambuco?");
            questao[i].setAlternativas(new String[]{"Recife", "Olinda", "Caruaru"});
        }
        
        questao[0].addAlternativa("Salvador", 3);
        questao[0].addAlternativa("Manaus", 4);
        
        System.out.println(questao[0].getEnunciado());
        String[] alternativas = questao[0].getAlternativas();
        for (i = 0; i < alternativas.length; i++) {
            System.out.println(alternativas[i]);
        }
    }
}
