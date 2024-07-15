package pt.org.dio.bootcamp.desafio.modelagemiphone.funcionalidades.reprodutormusical;

/** Essa interface representa as funções de reproduzir uma música como um iPad.
  * Não foi feita uma abstração completa de um iPad pois o exercício trata-se de uma abstração básica do iPad.
  * Abstração exigida no exercício -> Reprodutor Musical Métodos: tocar(), pausar(), selecionarMusica(String musica) 
  */

public interface ReprodutorMusical {

    public void tocar ();
    public void pausar ();
    public void setSelecionarMusica (String musica);
}
