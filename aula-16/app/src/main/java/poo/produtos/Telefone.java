package poo.produtos;

public class Telefone {
    private String codigo;
    private String numSerie;
    private String modelo;
    protected float peso;
    private Dimensao dim;

    public Telefone(String codigo, String numSerie, String modelo, float peso, Dimensao dim) {
        this.codigo = codigo;
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.peso = peso;
        this.dim = dim;
    }

    //@Override
    public String imprimirDados() {
        return "Telefone possui codigo: " + codigo + ", numSerie: " + numSerie + ", modelo: " + modelo + ", peso: " + peso + ", dim: " + dim;
    }

}
