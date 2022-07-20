public class AloMundo{
    public static void main(String[] args){
        System.out.println("Bem vindos ao mundo Java");
        int idade;
        idade = 15;
        System.out.println("A idade é: " + idade);
        System.out.printf("%s", "Exemplo de print com printf");
        System.out.printf("%s", "Exemplo de print com printf");

        // operadores aritméticos
        // soma -> +
        // subtração -> -
        // multiplicação -> *
        // divisão -> /
        // resto da divisão -> %

        int num1 = 5;
        int num2 = 2;
        int resto = 5%2;

        int x = 10;
        long y = 10;

        x = (int) y;

        char letra = 'k';

        float numero = 3;
        
        System.out.printf("%n%.2f%n", numero);

        // Mais sobre atribui��es 

        int a = 1;
        int b = 2;

        a = a + b;          // a += b
        
        a *= b;

        a += b;


        // incremento

        a = a + 1;   // a++

        int i = 5;

        int z;

        z = i + 1;

        System.out.println(z);
        z = ++i;
        System.out.println(z);

        int meuNumero; // tipo primitiva
        Integer meuN; // tipo por referencia

        // double => Double
        // float => Float

        String palavra = "cachorro"; // por referencia

        


    }
}