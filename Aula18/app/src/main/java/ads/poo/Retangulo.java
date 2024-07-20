package ads.poo;

public class Retangulo extends ObjetoDesenho {
    private Ponto verticel;
    private Ponto verticeF;

    public Retangulo(Ponto verticel, Ponto verticeF) {
        this.verticel = verticel;
        this.verticeF = verticeF;
    }

    @Override
    public String desenhar() {
        return "Desenha Retangulo";
    }
}
