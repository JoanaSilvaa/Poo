package poo.ads;

public class Caneta {

    private String cor = "preta";
    private int tinta = 10;


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
