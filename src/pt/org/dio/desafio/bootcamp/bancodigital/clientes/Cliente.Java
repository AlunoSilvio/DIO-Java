package pt.org.dio.desafio.bootcamp.bancodigital.contas;

public interface Cliente {
    
    private String nome;
    private int id;

    public void Cliente (String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public String getNome () {
        return this.nome;
    }
/*
    public void setId (String id) {
        this.id = id;
    }
    
    public String getId () {
        return this.id;
    }
*/

}