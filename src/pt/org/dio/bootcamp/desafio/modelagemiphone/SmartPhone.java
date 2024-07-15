package pt.org.dio.bootcamp.desafio.modelagemiphone;

import pt.org.dio.bootcamp.desafio.modelagemiphone.funcionalidades.aparelhotelefonico.*;
import pt.org.dio.bootcamp.desafio.modelagemiphone.funcionalidades.navegadorinternet.*;
import pt.org.dio.bootcamp.desafio.modelagemiphone.funcionalidades.reprodutormusical.*;

import java.io.*;

/** Está classe implementa algumas funções básicas daquilo que seria um celular inteligente.
  */

public class SmartPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    
    //Implementação dos métodos da interface ReprodutorMusical.
    
    public void tocar () { //Método para iniciar a reprodução de uma música.
        System.out.println("Tocando uma música.");
    }
    
    public void pausar (){ //Método para realizar um intervalo na reprodução de uma música.
        System.out.println("Música em Pause.");
    }
    
    public void setSelecionarMusica (String musica) { //Método que seleciona uma música específica para reproduzir.
        System.out.println("Música: " + musica + " selecionada.");
    }
    
    //Implementação dos métodos da interface AparelhoTelefonico.
    
    public void setLigar (String numero) { //Método que realiza a ligação para um número específico. 
        System.out.println("Ligando para: " + numero);
    }
    
    public void atender () { //Método que atende uma ligação.
        System.out.println("Ligação atendida");
    }
    
    public void iniciarCorreioVoz () { //Método que acessa o correio de Voz.
        System.out.println("Iniciar Correio de voz");
    }
    
    //Implementação dos métodos da interface NavegadorInternet.
    
    public void setExibirPagina (String url) { //Método que acessa uma página específica na internet.
        System.out.println("Acessar site: " + url);
    }
    
    public void adicionarNovaAba () { //Método que adiciona uma nova aba no navegador.
        System.out.println("Nova aba aberta");
    }
    
    public void atualizarPagina () { //Médodo que atualiza a atual página da internet.
        System.out.println("Página atualizada");
    }
}
