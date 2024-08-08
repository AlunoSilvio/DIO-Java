/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.padroesprojetos.facade;

import org.padroesprojetos.subsistema.CepApi;
import org.padroesprojetos.subsistema.CrmService;
/**
 *
 * @author SilvioAntunes
 */
public class Facade {
    
    public void migrarCliente(String nome, String  cep){
        
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
