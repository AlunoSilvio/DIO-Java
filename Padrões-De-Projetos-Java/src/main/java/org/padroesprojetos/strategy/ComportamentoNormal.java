/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.padroesprojetos.strategy;
/**
 *
 * @author user
 */
public class ComportamentoNormal implements Comportamento{
    
    @Override
    public void mover(){
        System.out.println("Movendo-se normalmente...");
    }
}
