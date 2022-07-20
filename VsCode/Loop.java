public class Loop {
    public static void main(String[] args) {
        
        // loop for

        for (int contador = 0; contador < 11; contador++) {
            System.out.println(contador);
        }


        // loop while

        int contador = 1;

        while(contador <= 10){
            System.out.println(contador);
            contador++;
        }

        // loop do while

        contador = 20;

        do{
            System.out.println(contador);
            contador++;
        } while (contador <= 10);

    }
}
