import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Matematica {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Figura> listaFiguras = new ArrayList<Figura>();

        System.out.println("Digite os dois lados do retângulo: ");

        try{
            double lado1 = scan.nextInt();
            double lado2 = scan.nextInt();
            Retangulo r1 = new Retangulo("Retângulo", "Azul", lado1, lado2 );
            listaFiguras.add(r1);
        } catch (FiguraException e) {
            System.out.println("Erro no valor dos lados: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro: você digitou um número inválido."); // executa antes
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            Circulo c1 = new Circulo("Círculo", "Vermelho", 4);
            listaFiguras.add(c1);
        } catch (FiguraException e) {
            System.out.println("Erro no valor do raio: " + e.getMessage());
        } catch (RuntimeException e) {
        System.out.println("Erro: " + e.getMessage());
        }

        try {
            Triangulo t1 = new Triangulo("Triângulo", "Roxo", 4, 6);
            listaFiguras.add(t1);
        } catch (FiguraException e) {
            System.out.println("Erro no valor das medidas: " + e.getMessage());
        } catch (RuntimeException e) {
        System.out.println("Erro: " + e.getMessage());
        }

        for (Figura figura: listaFiguras) {
            System.out.printf("%s%s%s%.2f%n", "O ", figura.getNome(), " tem área igual a: ", figura.calcularArea());
        }
        
    }
}
