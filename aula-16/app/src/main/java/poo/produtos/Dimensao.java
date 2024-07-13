package poo.produtos;

public class Dimensao {
    private int altura;
    private int larura;
    private int profundidade;

    public Dimensao(int altura, int larura, int profundidade) {
        this.altura = altura;
        this.larura = larura;
        this.profundidade = profundidade;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLarura() {
        return larura;
    }

    public void setLarura(int larura) {
        this.larura = larura;
    }

    public int getProfundidade() {
        return profundidade;
    }

    public void setPeso(int profundidade) {
        this.profundidade = profundidade;
    }

    public String toString() {
        return "altura: " + altura + ", larura: " + larura + ", profundidade: " + profundidade;
    }
}

