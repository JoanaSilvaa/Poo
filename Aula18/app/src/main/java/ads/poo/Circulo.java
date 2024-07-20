package ads.poo;

public class Circulo extends ObjetoDesenho {
    private Ponto centro;
    private double raio;

    public Circulo(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }

    @Override
    public String desenhar() {
        return "Desenho Circulo";
    }
}
