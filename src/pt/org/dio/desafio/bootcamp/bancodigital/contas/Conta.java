package pt.org.dio.desafio.bootcamp.bancodigital.contas;

public interface Conta {
    
    private int agencia;
    private int conta;
    private doble saldo;

    public void Conta (int agencia, int conta){

        this.agencia = agencia;
        this conta = conta;
    }

    public void setSaldo (double saldo) {
        this.saldo = saldo;
    }

    public String getSaldo () {
        return this.saldo;
    }

}
