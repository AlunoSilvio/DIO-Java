package org.bancodigital.clientes;

public abstract class Cliente {
    
    private String nome;
    private int id;

    public void Cliente (String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public void getId () {
        this.id = id;
    }
    
    public String getNome () {
        return this.nome;
    }

}