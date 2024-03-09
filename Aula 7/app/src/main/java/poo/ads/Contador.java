package poo.ads;

public class Contador {
    private int valorAtual;

    public void atribuir(int valor){
        valorAtual = valor;
    }

    public void incrementar(){
        ++valorAtual;
    }

    public int obterValorAtual(){
        return valorAtual;
    }


}
