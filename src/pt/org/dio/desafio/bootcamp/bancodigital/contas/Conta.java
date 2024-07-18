package pt.org.dio.desafio.bootcamp.bancodigital.contas;

public abstract class Conta {
    
    private static final short AGENCIA_CENTRAL =1;
    private static int CONTA = 1;
    private short agencia;
    private int conta;
    private double saldo;

    public void Conta (shorte agencia){

        this.agencia = agencia;
        this.conta = CONTA++;
    }

    public int getConta () {
        return this.conta;
    }

    public short getAgencia () {
        return this.agencia;
    }

    private void setSaldo (double saldo) {
        this.saldo = saldo;
    }

    private double getSaldo () {
        return this.saldo;
    }

    public double sacar (double saque) {
        return this.setSaldo (this.getSaldo() -= saque);
    }

    public double depositar (double deposito) {
       return this.setSaldo (this.getSaldo() += deposito);
    }

   public double transferencia (double transferencia, Banco banco, Agencia agencia, Conta conta, String nome) {
        System.out.println("R$ " + transferencia + " transferido para " + nome + ", Banco: " + banco + " Agência: " + agencia + " Conta: " + conta);
        return this.setSaldo (this.getSaldo() -= saque);
    }

}
