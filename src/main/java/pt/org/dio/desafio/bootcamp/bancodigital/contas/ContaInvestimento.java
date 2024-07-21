package pt.org.dio.desafio.bootcamp.bancodigital.contas;

import java.util.ArrayList;

public class ContaInvestimento extends Conta {

    public String extrato() {

        ArrayList<Object> informacoes = new ArrayList();
        informacoes = super.informacaoConta();

        return "=====================================" + System.lineSeparator() +
               "======Extrato=Conta=Ivestimento======" + System.lineSeparator() +
               "Agencia: " + informacoes.get(0)  + 
               "Conta: "   + informacoes.get(1)  + System.lineSeparator() +
               "Saldo: R$" + informacoes.get(1)  + System.lineSeparator() +
               "=====================================";
    }
}