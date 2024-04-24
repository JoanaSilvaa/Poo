package ads.poo;

public class Motor {
    private int hp;
    private double cilindrada;

    public Motor(int hp, double cilindrada) {
        this.hp = hp;
        this.cilindrada = cilindrada;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
}
