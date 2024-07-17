package pt.org.dio.desafio.bootcamp.modelagemiphone;

import java.util.Scanner;

/** Classe principal.
  * Descrição: Desafio de abstração da modelagem de um iPhone, usando UML e java.
  * Versão: 0.0
  * Autor: Slvio Antunes da Silva Júnior
  * Recife, 15 de julho de 2024 
  */

public class IPhone {
     
     public static void main(String[] args) {  //Método principal.

        try (Scanner lerTela = new Scanner(System.in)) {
        
            System.out.println ("Entre com: 1 - para escultar músicas. " + 
                                           "2 - para fazer navegar na internet. " +
                                           "3 - para acessar o telefone. ");

            byte opcao = Byte.parseByte (lerTela.nextLine ());
            
            switch (opcao) { //Menu de seleção principal.
            
                case 1 : reproduzirMusica ();
                case 2 : navegarInternet ();
                case 3 : chamadasTelefonica ();
                default : System.out.println ("Opção inválida, desligando o iPhone.");
            }

            lerTela.close();

        }
        
        catch (NumberFormatException e) { //Exceção, caso não seja digitado um número.

            System.out.println ("São aceitos apenas números, desligando o iPhone.");
        }
        //catch (NoSuchElementException e) {}
        finally {}
    }
    
    /*Método escutar música.*/
    private static void reproduzirMusica () {
    
        System.out.println ("Entre com: 1 - tocar a música. " + 
                                       "2 - pausar a música. " +
                                       "3 - para acessar o telefone.");

        try (Scanner lerTela = new Scanner(System.in)) {

            byte opcao = Byte.parseByte (lerTela.nextLine ());
            
            //Objeto para reproduzir música.
            SmartPhone reproduzirMusica = new SmartPhone ();
            String musica = "I Love You";
            
            switch (opcao) { //Menu de seleção da reprodução de música.
                
                    case 1 : reproduzirMusica.tocar();
                    case 2 : reproduzirMusica.pausar();
                    case 3 : reproduzirMusica.setSelecionarMusica(musica);
                    default : System.out.println ("Opção inválida, desligando o iPhone");
            }

            lerTela.close();
        } 
        
        catch (NumberFormatException e){}
    }
    
    /*Método do aparelho telefonico.*/
    private static void chamadasTelefonica () {
    
        System.out.println ("Entre com: 1 - Ligar. " + 
                                       "2 - Atender chamada. " +
                                       "3 - Correio de voz.");

        try (Scanner lerTela = new Scanner(System.in)) {

            byte opcao = Byte.parseByte (lerTela.nextLine ());
            
            //Objeto para aparelho telefônico. 
            SmartPhone celular = new SmartPhone ();
            String numero = "+55 81 9.1234-5678";
                    
            switch (opcao) { //Menu seleção do aparelho celular.
                
                    case 1 : celular.setLigar(numero);
                    case 2 : celular.atender();
                    case 3 : celular.iniciarCorreioVoz();
                    default : System.out.println ("Opção inválida, desligando o iPhone.");
            }

            lerTela.close();
        } 
        
        catch (NumberFormatException e){}
    }
    
    /*Método do navegador de internet.*/
    private static void navegarInternet () {
    
        System.out.println ("Entre com: 1 - Acessar site. " + 
                                       "2 - Adicionar nova aba. " +
                                       "3 - Atualizar site.");

        try (Scanner lerTela = new Scanner(System.in)) {

            byte opcao = Byte.parseByte (lerTela.nextLine ());
            
            //Objeto para navegar na internet.
            SmartPhone navegador = new SmartPhone ();
            String url = "dio.me";
            
            switch (opcao) { //Menu de seleção do navegador de internet.
                
                case 1 : navegador.setExibirPagina(url);
                case 2 : navegador.adicionarNovaAba();
                case 3 : navegador.atualizarPagina();
                default : System.out.println ("Opção inválida, desligando o iPhone.");
            }

            lerTela.close();
        } 
        
        catch (NumberFormatException e) {}
    }
}
