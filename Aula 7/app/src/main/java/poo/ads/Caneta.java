package poo.ads;

public class Caneta {

    private String cor;
    private int tinta;

    private final String MARCA = "bic"; //Constatnte não pode ser alterada

    public Caneta(String cor, int tinta) { //metodo construtor, não possui retorno e tem que ter o mesmo nome que a classe
        this.cor = cor;
        this.tinta = tinta;
    }

    public Caneta(String cor) {
        this(cor,100);
    }

    public Caneta() {
        this("vermelha",100);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTinta() {
        return tinta;
    }

    public void setTinta(int tinta) {
        this.tinta = tinta;
    }

    public String desenhando(){
        if (tinta > 0){
            --tinta;
            return "Desenhando com a cor" + cor;
        }
        return "Não é possivel desenhar";
    }
}
