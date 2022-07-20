public class EstruturaCondicao {

    public static void main(String[] args) {
        
        // consição if

        boolean condicao = false;

        if (condicao){
            System.out.println("A condição é verdadeira");
        } else {
            System.out.println("A condição é falsa");
        }

        int nota = 80;
        int falta = 4;

        if (nota >= 60 && falta <= 5){
            System.out.println("Aluno aprovado");
        } else if (nota >= 40){
            System.out.println("Aluno em recuperação");
        }
        else {
            System.out.println("Aluno reprovado");
        }

        String resultado = "";
        resultado = (nota >= 60) ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        int posicao = 2;
        switch (posicao) {
            case 1:
                System.out.println("Voce chegou em primeiro lugar");
                break;
            case 2:
                System.out.println("Voce chegou em segundo lugar");
                break;
            case 3:
                System.out.println("Voce chegou em terceiro lugar");
                break;
            case 4: case 5: case 6:
                System.out.println("Voce ganhou um premio de participacao");
                break;
        
            default:
                System.out.println("Voce nao teve colocacao");
                break;
        }

    }
}
