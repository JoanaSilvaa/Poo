package ads.poo;

import java.util.Arrays;

public class Disciplina {

    private String sigla;
    //private int [] diasDaSemana;
    private DiasDaSemana[] dias;

    /*public Disciplina(String sigla, int[] diasDaSemana) {
        this.sigla = sigla;
        this.diasDaSemana = diasDaSemana;
    }*/

    public Disciplina(String sigla, DiasDaSemana[] dias) {
        this.sigla = sigla;
        this.dias = dias;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (DiasDaSemana dia : dias) {
            builder.append(dia);
        }
        return "Sigla:" + sigla + "\n" +
                "Dias: " + "\n" + builder.toString();
    }
}
