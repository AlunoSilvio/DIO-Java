/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.padroesprojetos.subsistema;

/**
 *
 * @author SilvioAntunes
 */
public class CrmService {
    
    private CrmService(){
        super();
    }
    
    public static void gravarCliente(String nome, String cep, String cidade, String estado){
        
        System.out.println("Cliente salvo no sistema CRM");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
