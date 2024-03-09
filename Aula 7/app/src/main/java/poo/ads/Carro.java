package poo.ads;

public class Carro {
    //Atributos da classe
    private double velocidade;
    private String modelo;

    //métodos
    public void acelerador(double v){
        velocidade+=v;
        //velocidade = velocidade + v;
    }
    public double obterVelocidade(){
        return velocidade;
    }
}
