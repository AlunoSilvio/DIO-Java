package pt.org.dio.bootcamp.desafio.modelagemiphone;

import pt.org.dio.bootcamp.desafio.modelagemiphone.*;
import java.util.Scanner;

/** Classe principal.
  */

public class IPhone {
     
     public static void main(String[] args) { //Método principal.
    
        Scanner lerTela = new Scanner(System.in);
        try {
        
            System.out.println ("Entre com: 1 - para escultar músicas " + 
                                           "2 - para fazer navegar na internet" +
                                           "3 - para acessar o telefone");
            byte opcao = Byte.parseByte (lerTela.nextLine ());
            
            switch (opcao) { //Menu de seleção.
            
                case 1 : reproduzirMusica (); break;
                case 2 : navegarInternet ();  break;
                case 3 : chamadasTelefonica (); break;
                default : System.out.println ("Opção inválida, desligando o iPhone");
            }
        }
        
        catch (NumberFormatException e) { //Exceção, caso não seja digitado um número.
            System.out.println ("São aceitos apenas números, desligando o iPhone");
        }
        
        finally {
            lerTela.close();
        }
    }
    
    private static void reproduzirMusica () { //Método tocar música.
    
        System.out.println ("Entre com: 1 - tocar a música. " + 
                                       "2 - pausar a música. " +
                                       "3 - para acessar o telefone. ");
        Scanner lerTela = new Scanner(System.in);
        byte opcao = Byte.parseByte (lerTela.nextLine ());
        
        //Objeto para reproduzir música.
        ReprodutorMusical reproduzirMusica = new SmartPhone ();
        String musica = "I Love You";
        
        switch (opcao) { //Menu de seleção da reprodução de música.
            
                case 1 :  reproduzirMusica.tocar(); break;
                case 2 :  reproduzirMusica.pausar(); break;
                case 3 :  reproduzirMusica.setSelecionarMusica(musica); break;
                default : System.out.println ("Opção inválida, desligando o iPhone");
        }
    }
    
    private static void chamadasTelefonica () { //Método do aparelho telefonico.
    
        System.out.println ("Entre com: 1 - Ligar. " + 
                                       "2 - Atender chamada. " +
                                       "3 - Correio de voz.");
        Scanner lerTela = new Scanner(System.in);
        byte opcao = Byte.parseByte (lerTela.nextLine ());
        
        //Objeto para aparelho telefônico. 
        AparelhoTelefonico celular = new SmartPhone();
        String numero = "+55 81 9.1234-5678";
                
        switch (opcao) { //Menu seleção do aparelho celular.
            
                case 1 : celular.setLigar(numero); break;
                case 2 : celular.atender(); break;
                case 3 : celular.iniciarCorreioVoz(); break;
                default : System.out.println ("Opção inválida, desligando o iPhone");
        }
    }
    
    private static void navegarInternet () { //Método do navegador de internet.
    
        System.out.println ("Entre com: 1 - Acessar site. " + 
                                       "2 - Adicionar nova aba. " +
                                       "3 - Atualizar site.");
        Scanner lerTela = new Scanner(System.in);
        byte opcao = Byte.parseByte (lerTela.nextLine ());
        
        //Objeto para navegar na internet.
        NavegadorInternet navegador = new SmartPhone();
        String url = "dio.me";
        
        switch (opcao) { //Menu de seleção do navegador de internet.
            
                case 1 : navegador.setExibirPagina(url); break;
                case 2 : navegador.adicionarNovaAba(); break;
                case 3 : navegador.atualizarPagina(); break;
                default : System.out.println ("Opção inválida, desligando o iPhone");
        }
    }
}
