package org.padroesprojetos;

/**
 *
 * @author SilvioAntunes
 */

import org.padroesprojetos.singleton.SingletonEager;
import org.padroesprojetos.singleton.SingletonLazy;
import org.padroesprojetos.singleton.SingletonLazyHolder;

import org.padroesprojetos.strategy.ComportamentoAgressivo;
import org.padroesprojetos.strategy.ComportamentoDefensivo;
import org.padroesprojetos.strategy.ComportamentoNormal;
import org.padroesprojetos.strategy.Comportamento;
import org.padroesprojetos.strategy.Robo;
import org.padroesprojetos.facade.Facade;

public class PadroesProjetos {
    
    public static void main(String[] args) {
        
        //Exemplo Singleton
        System.out.println("Padrão de projeto Singleton!");
        System.out.println("Edereçamento de instancias:");
        
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);
        
        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        
        //Exemplo Extrategy
        System.out.println("\nPadrão de projeto Strategy");
        System.out.println("Movimento de um robô:");
        
        Comportamento defencivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        
        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        
        robo.setComportamento(defencivo);
        robo.mover();
        
        robo.setComportamento(agressivo);
        robo.mover();
        
        System.out.println("\n Padrão de projeto Facade");
        System.out.println("Cadstro de cliente:");
        
        Facade facade = new Facade();
        facade.migrarCliente("Silvio Antunes", "51202555");
    }
}
