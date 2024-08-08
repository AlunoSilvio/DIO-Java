package org.padroesprojetos.singleton;

/**
 *
 * @author SilvioAntunes
 */
public class SingletonLazyHolder {
    
    private static class InstanceHolder{
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    
    
    private SingletonLazyHolder () {
        
        super();
    }
    
    public static SingletonLazyHolder getInstancia(){

        return InstanceHolder.instancia;
    }
}
