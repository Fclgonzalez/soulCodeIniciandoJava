public class ContaEspecial extends Conta{

    private final String atendimento = "Com prioridade";
    private double limiteEspecial;
    private double saldoLimite;

    public ContaEspecial(String titularConta, String numeroConta, String numeroAgencia, double saldo, double limiteEspecial) {
        super(titularConta, numeroConta, numeroAgencia, saldo);
        this.limiteEspecial = limiteEspecial;
        this.saldoLimite = limiteEspecial;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Essa conta especial tem um limite de: "+ getLimiteEspecial());
        System.out.println("Essa conta especial tem atendimento do tipo: "+ getAtendimento());
    }

    @Override
    public void sacar(double valor) {
        System.out.println("-------- " + this.getTitularConta() + " -------");
        if (valor <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque efetuado com secesso");
            System.out.println("Seu novo saldo é: " + this.getSaldo());
        } else if((this.getSaldo() + this.getSaldoLimite()) > valor){
            System.out.println("Seu saldo é insuficiente, você usará seu limite especial.");
            this.setSaldoLimite(this.getSaldoLimite() - (valor - this.getSaldo()));
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque efetuado com sucesso. Seu novo saldo é: " + this.getSaldo());
            System.out.println("Seu novo saldo do limite é: " + this.getSaldoLimite());
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    @Override
    public void depositar(double valor) {
        System.out.println("-------- " + this.getTitularConta() + " -------");
        this.setSaldo(this.getSaldo() + valor);
        if(this.getSaldo() >= 0) {
            this.setSaldoLimite(this.getLimiteEspecial());
        } else {
            this.setSaldoLimite(this.getSaldoLimite() + valor);
            }
        System.out.println("Depósito efetuado com sucesso. Seu novo saldo é: " + this.getSaldo());
        System.out.println("Seu novo saldo limite é: " + this.getSaldoLimite());

    }


    public String getAtendimento() {
        return atendimento;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getSaldoLimite() {
        return saldoLimite;
    }

    public void setSaldoLimite(double saldoLimite) {
        this.saldoLimite = saldoLimite;
    }
}
