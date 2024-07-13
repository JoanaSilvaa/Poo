package poo.produtos;

public class SemFio extends Telefone {
    private float frequencia;
    private int canais;
    private float distancia;

    public SemFio(String codigo, String numSerie, String modelo, float peso, Dimensao dim, float frequencia, int canais, float distancia) {
        super(codigo, numSerie, modelo, peso, dim); //invocando o construtor da superclasse
        this.frequencia = frequencia;
        this.canais = canais;
        this.distancia = distancia;
    }

    //Serve para que o método em que estou, seja sobrescrevendo um método que ele herdou
    public String imprimirDados() {
        return "SemFio " + super.imprimirDados() + "frequencia: " + frequencia + ", canais: " + canais + ", distancia: " + distancia;
    }



    //seta aberta, semfio herda de telefone
}
