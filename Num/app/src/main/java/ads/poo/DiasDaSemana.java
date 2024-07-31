package ads.poo;

import java.awt.desktop.QuitEvent;

public enum DiasDaSemana {
    //DOM, SEG, TER, QUA, QUI, SEX, SAB

    //ou

    DOM(0, "domingo"),
    SEG(1, "segunda-feira"),
    TER(2, "terca-feira"),
    QUA(3, "quarta-feira"),
    QUI(4, "quinta-feira"),
    SEX(5, "sexta-feira"),
    SAB(6, "sabado");

    private int codigo;
    private String extenso;

    DiasDaSemana(int codigo, String extenso) {
        this.codigo = codigo;
        this.extenso = extenso;
    }

    public int getCodigo() {return codigo;}

    public String getExtenso() {return extenso;}

    @Override
    public String toString() {
        return "- " +extenso + "\n";
    }
}
