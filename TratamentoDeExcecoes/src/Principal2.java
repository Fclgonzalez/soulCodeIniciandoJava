import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        try{
            int numero = scan.nextInt();
            System.out.println("O número digitado foi: " + numero);
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: você não digitou um número válido.");
        }catch (Exception e) {
            System.out.println("Erro: você não digitou um número válido" + e.getMessage());
        } finally {
            System.out.println("Obrigatoriamente, você passa por aqui");
        }
    }
}
