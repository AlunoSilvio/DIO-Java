package org.bancodigital;

import org.bancodigital.contas.Conta;
import org.bancodigital.contas.ContaCorrente;
//import pt.org.dio.desafio.bootcamp.bancodigital.contas.ContaPoupanca;

public class AplicativoBancario {

    public static void main(String[] args){

        Conta contaCorrente = new ContaCorrente();
        System.out.println(contaCorrente.extrato());
    }
}