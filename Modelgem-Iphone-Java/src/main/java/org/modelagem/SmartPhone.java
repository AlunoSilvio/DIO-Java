package org.modelagem;

import org.modelagem.funcionalidades.aparelhotelefonico.AparelhoTelefonico;
import org.modelagem.funcionalidades.navegadorinternet.NavegadorInternet;
import org.modelagem.funcionalidades.reprodutormusical.ReprodutorMusical;

/** Está classe implementa algumas funções básicas daquilo que seria um celular inteligente.
  */

public class SmartPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    
    //Implementação dos métodos da interface ReprodutorMusical.
    
    @Override
    public void tocar () { //Método para iniciar a reprodução de uma música.
        System.out.println("Tocando uma música.");
    }
    
    @Override
    public void pausar (){ //Método para realizar um intervalo na reprodução de uma música.
        System.out.println("Música em Pause.");
    }
    
    @Override
    public void setSelecionarMusica (String musica) { //Método que seleciona uma música específica para reproduzir.
        System.out.println("Música: " + musica + " selecionada.");
    }
    
    //Implementação dos métodos da interface AparelhoTelefonico.
    
    @Override
    public void setLigar (String numero) { //Método que realiza a ligação para um número específico. 
        System.out.println("Ligando para: " + numero);
    }
    
    @Override
    public void atender () { //Método que atende uma ligação.
        System.out.println("Ligação atendida.");
    }
    
    @Override
    public void iniciarCorreioVoz () { //Método que acessa o correio de Voz.
        System.out.println("Iniciar Correio de voz.");
    }
    
    //Implementação dos métodos da interface NavegadorInternet.
    
    @Override
    public void setExibirPagina (String url) { //Método que acessa uma página específica na internet.
        System.out.println("Acessar site: " + url);
    }
    
    @Override
    public void adicionarNovaAba () { //Método que adiciona uma nova aba no navegador.
        System.out.println("Nova aba aberta.");
    }
    
    @Override
    public void atualizarPagina () { //Médodo que atualiza a atual página da internet.
        System.out.println("Página atualizada.");
    }
}
