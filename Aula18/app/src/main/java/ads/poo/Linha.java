package ads.poo;

public class Linha extends ObjetoDesenho {
    private Ponto inicio, fim;

    public Linha(Ponto inicio, Ponto fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    @Override
    public String desenhar() {
        return "Desenha Linha";
    }
}
