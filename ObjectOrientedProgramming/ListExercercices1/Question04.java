import java.util.Scanner;
public class Question04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Question03 voto = new Question03();
        int numDeBusca = sc.nextInt();

        if(numDeBusca == voto.exibirNumVoto()){
            voto.contarVoto();
        }else{
            System.out.println("Nome não encontrado");
        }
        System.out.printf("O candidato %s de número %d tem um total de %d voto(s)\n",voto.exibirNomeCandidato(), voto.exibirNumVoto(), voto.exibirCountVotos());
    }
}
