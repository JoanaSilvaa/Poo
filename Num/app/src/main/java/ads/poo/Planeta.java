package ads.poo;

public enum Planeta {
    MERCURIO(1),
    VENUS(2),
    TERRA(3),
    MARTE(4),
    JUPTER(5),
    SATURNO(6),
    URANO(7),
    NETURNO(8);

    private int posicao;

    Planeta(int posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return "Planeta{" +
                "posicao=" + posicao +
                '}';
    }
}
