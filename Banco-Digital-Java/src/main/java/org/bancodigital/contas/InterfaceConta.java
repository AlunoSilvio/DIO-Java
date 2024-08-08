package org.bancodigital.contas;

public interface InterfaceConta {

    double sacar (double saque);
    double depositar (double deposito);
    double transferencia (double transferencia, Conta contaDestino);
    
    String extrato();
}
