import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero: ");

        int numero = 0;
        numero = leitor.nextInt();

        System.out.println("O numero digitado foi: " + numero);


    }
}
