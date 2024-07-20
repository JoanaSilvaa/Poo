package ads.poo;

import java.util.ArrayList;

public class Aldeao extends Personagem implements Guerreiro, Coletador {


    private ArrayList<String>ferramentas = new ArrayList<>();

    public Aldeao(String ferramenta) {
        super(25, 1, 0.8);
        this.ferramentas.add(ferramenta);

    }

    public ArrayList<String> getFerramentas() {
        return ferramentas;
    }

    public void setFerramentas(ArrayList<String> ferramentas) {
        this.ferramentas = ferramentas;
    }


    public String mover() {
        return "O Aldeao está se movendo";
    }


    public String atacar() {
        return "O Aldeao está atacando";
    }
}
