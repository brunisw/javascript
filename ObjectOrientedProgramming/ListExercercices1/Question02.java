import java.util.Scanner;
public class Question02 {
    static String mesPorExtenso(int numeroMes){
        String mes = "";
        if(numeroMes == 1){
            mes = "janeiro`";
            return mes;
        }
        if(numeroMes == 2){
            mes = "fevereiro";
            return mes;
        }
        if(numeroMes == 3){
            mes = "marco";
            return mes;
        }
        if(numeroMes == 4){
            mes = "abril";
            return mes;
        }
        if(numeroMes == 5){
            mes = "maio";
            return mes;
        }
        if(numeroMes == 6){
            mes = "junho";
            return mes;
        }
        if(numeroMes == 7){
            mes = "julho";
            return mes;
        }
        if(numeroMes == 8){
            mes = "agosto";
            return mes;
        }
        if(numeroMes == 9){
            mes = "setembro";
            return mes;
        }
        if(numeroMes == 10){
            mes = "outubro";
            return mes;
        }
        if(numeroMes == 11){
            mes = "novembro";
            return mes;
        }
        if(numeroMes == 12){
            mes = "dezembro";
            return mes;
        }else{
            return mes;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numMes = sc.nextInt();
        System.out.println(mesPorExtenso(numMes));


    }
}
