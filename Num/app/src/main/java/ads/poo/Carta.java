package ads.poo;

import java.util.Arrays;

public class Carta {

    private Valor valor;
    private Naipe naipe;


    public Carta(Valor valor, Naipe naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public String toString() {
        return "Carta " +
                "valor: " + valor +
                ", naipe: " + naipe;
    }
}
