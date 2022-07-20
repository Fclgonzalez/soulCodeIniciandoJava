public class Circulo extends Figura{

    private double raio;
    private final double pi = Math.PI;

    public Circulo(String nome, String cor, double raio) throws FiguraException, RuntimeException  {
        super(nome, cor);
        if( raio % 2 != 0) {
            throw new FiguraException("O raio do círculo não pode ter valor ímpar.");
        } else if ( raio < 0) {
            throw new RuntimeException("O raio do círculo não pode ter valor negativo.");
        }
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return getPi() * Math.pow(getRaio(),2);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }
}
