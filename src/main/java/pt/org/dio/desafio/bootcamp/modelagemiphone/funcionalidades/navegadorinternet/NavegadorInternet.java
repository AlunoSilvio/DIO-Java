package pt.org.dio.desafio.bootcamp.modelagemiphone.funcionalidades.navegadorinternet;

/** Essa interface representa as funções de um navegador de internet.
  * Não foi feita uma abstração completa de um navegador de internet pois o exercício trata-se de uma abstração básica do navegador de internet.
  * Abstração exigida no exercício -> Navegador na Internet Métodos: exibirPagina(String url), adicionarNovaAba(), atualizarPagina()
  */

public interface NavegadorInternet {

    public void setExibirPagina (String url);
    public void adicionarNovaAba ();
    public void atualizarPagina ();
}
