package ads.poo;

public class Arqueiro extends Personagem {
    private int flechas;

    public Arqueiro(int flechas) {
        super(35, 2, 1);
        this.flechas = flechas;
    }

    public int getFlechas() {
        return flechas;
    }


    public String mover() {
        return super.mover() + "O arqueiro está se movendo";
    }

    @Override
    public String atacar() {
        return super.atacar() + "O arqueiro está se movendo";
    }

    public void setFlechas(int flechas) {
        this.flechas = flechas;
    }

    public String toString() {
        return "Arqueiro{" +
                "flechas=" + flechas +
                '}';
    }
}

