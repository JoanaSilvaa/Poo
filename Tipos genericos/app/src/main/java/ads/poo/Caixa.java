package ads.poo;

// o T implica que o tipo é passado como parametro junto com a classe
public class Caixa <T>{

    //pode armazenar qualquer classe
    private T conteudo;

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }
}
