package ads.poo;

public class Cavaleiro extends Personagem {

    private String armadura;
    public Cavaleiro(String armadura) {
        super(50, 3, 2);
        this.armadura = armadura;
    }

    public String getArmadura() {
        return armadura;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }

    public String mover() {
        return super.mover() + "Cavaleiro está se movendo";
    }

    public String atacar() {
        return "Cavaleiro atacou";
    }
}
