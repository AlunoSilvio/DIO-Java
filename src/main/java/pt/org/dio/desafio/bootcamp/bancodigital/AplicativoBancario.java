package pt.org.dio.desafio.bootcamp.bancodigital;

import pt.org.dio.desafio.bootcamp.bancodigital.contas.Conta;
import pt.org.dio.desafio.bootcamp.bancodigital.contas.ContaCorrente;
//import pt.org.dio.desafio.bootcamp.bancodigital.contas.ContaPoupanca;

public class AplicativoBancario {

    public static void main(String[] args){

        Conta contaCorrente = new ContaCorrente();
        System.out.println(contaCorrente.extrato());
    }
}