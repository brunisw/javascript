public class Question03{
    private int numVoto = 13;
    private String nomeCandidato = "lula";
    private int countVotos = 0;

    Question03(int numeroDoCandidato, String nomeDoCandidato, int quantVotos){
        super();
        this.numVoto = numeroDoCandidato;
        this.nomeCandidato = nomeDoCandidato;
        this.countVotos = quantVotos;
        
    }

    Question03(){}

    void contarVoto(){
        countVotos++;
    }
    int exibirNumVoto(){
        return numVoto;
    }
    String exibirNomeCandidato(){
        return nomeCandidato;
    }
    int exibirCountVotos(){
        return countVotos;
    }

}