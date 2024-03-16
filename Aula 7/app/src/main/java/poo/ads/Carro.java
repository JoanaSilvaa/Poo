package poo.ads;

public class Carro {
    //Atributos da classe
    private int velocidade;
    //se não informar a velocidade atual inicia com 0
    //velocidade maxima = 200
    //velocidade minima = 0


    public Carro(int velocidade) {
        this.velocidade = velocidade;
    }

    public Carro() {
        this(0);
    }

    public double getVelocidade() {
        return velocidade;
    }

    public int setVelocidade(int velocidade) {
        if ((velocidade < 0) && (velocidade >200)){
            velocidade = 0 ;
        }
        else {
            velocidade = velocidade;
        }
        return velocidade;
    }

    //métodos
    public int acelerador(int v){
        if ((velocidade+v) <= 200){
            velocidade+=v;
            return velocidade;
        }
        velocidade = 200;
        return velocidade;
    }
    public int freiar(int v){
        //velocidade minima = 0
        if ((velocidade-v) >= 0){
            velocidade-=v;
            return velocidade;
        }
        velocidade = 0;
        return velocidade;
    }


    public double obterVelocidade(){
        return velocidade;
    }
}
