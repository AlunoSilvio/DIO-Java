package pt.org.dio.desafio.bootcamp.bancodigital.contas;

public interface Conta {
    
    private short agencia;
    private int conta;
    private doble saldo;

    String sacar();
    String depositar();
    String transferir();
}
