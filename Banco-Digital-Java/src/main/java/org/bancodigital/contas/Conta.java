package org.bancodigital.contas;

import java.util.ArrayList;

public abstract class Conta implements InterfaceConta{
    
    private static final short AGENCIA_CENTRAL = 1;
    private static int CONTA = 1;
    private short agencia;
    private int conta;
    private double saldo;

    public void Conta (short agencia) {

        this.agencia = agencia;
        this.conta = CONTA++;
    }

    public void Conta () {

        this.agencia = AGENCIA_CENTRAL;
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
        
        this.setSaldo (this.getSaldo() - saque);
        return this.getSaldo ();
    }

    public double depositar (double deposito) {
        
        this.setSaldo (this.getSaldo() + deposito);
        return this.getSaldo ();
    }

    public double transferencia (double transferencia, Conta contaDestino) {
        
        this.sacar(transferencia);
        contaDestino.depositar(transferencia);
        return this.getSaldo ();
    }

    protected ArrayList<Object> informacaoConta () {

        ArrayList<Object> informacoes = new ArrayList();

        informacoes.add(this.getAgencia());
        informacoes.add(this.getConta());
        informacoes.add(this.getSaldo());

        return informacoes;
    }
}