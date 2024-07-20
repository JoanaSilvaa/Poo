package ads.poo;

public class Triangulo extends ObjetoDesenho{
    private Ponto v1, v2, v3;

    public Triangulo(Ponto v1, Ponto v2, Ponto v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String desenhar() {
        return "Desenho Triangulo";
    }
}
