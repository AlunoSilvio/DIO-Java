package org.modelagem.funcionalidades.aparelhotelefonico;

/** Essa interface representa as funções de um aparelho telefônico como um celular.
  * Não foi feita uma abstração completa de um celular pois o exercício trata-se de uma abstração básica do celular.
  * Abstração exigida no exercício -> Aparelho Telefônico Métodos: ligar(String numero), atender(), iniciarCorreioVoz() 
  */
  
public interface AparelhoTelefonico {

    public void setLigar (String numero);
    public void atender ();
    public void iniciarCorreioVoz ();
}
