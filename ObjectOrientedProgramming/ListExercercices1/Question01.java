import java.util.Scanner;
public class Question01 {
    static void mediaNumeros(int num1, int num2){
        int resultado = (num1 + num2)/2;
        System.out.println(resultado);
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        mediaNumeros(num1, num2);

        sc.close();
    }
}
