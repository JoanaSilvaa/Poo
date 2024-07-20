package ads.poo;

public class Ponto extends ObjetoDesenho {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String desenhar() {
        return "Desenho Ponto";
    }
}
