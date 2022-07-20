
public class Retangulo extends Figura{

    private double lado1;
    private double lado2;

    public Retangulo(String nome, String cor, double lado1, double lado2) throws RuntimeException, FiguraException{
        super(nome, cor);
        if( lado1 % 2 != 0 || lado2 % 2 != 0) {
            throw new FiguraException("Os lados do retângulo não podem ter valores ímpares.");
        } else if ( lado1 <= 0 || lado2 <= 0) {
            throw new RuntimeException("Os lados do retângulo não podem ter valores negativos ou nulos.");
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        return getLado1() * getLado2();
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
}
