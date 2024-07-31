package ads.poo;

public enum Valor {
    AS(1, "A"),
    DOIS(2, "2"),
    TRES(3, "3"),
    QUARTO(4, "4"),
    CINCO(5, "5"),
    SEIS(6, "6"),
    SETE(7, "7"),
    OITO(8, "8"),
    NOVE(9, "9"),
    DEZ(10, "10"),
    VALETE(11, "J"),
    DAMA(12, "Q"),
    REI(13, "R"),;

    private int num;
    private String sigla;

    Valor(int num, String sigla) {
        this.num = num;
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return sigla + "\n";
    }
}
