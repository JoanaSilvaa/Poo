package poo.produtos;

public class Celular extends SemFio{
    private String sistemaOperacional;

    public Celular(String codigo, String numSerie, String modelo, float peso, Dimensao dim, float frequencia, int canais, float distancia, String sistemaOperacional) {
        super(codigo, numSerie, modelo, peso, dim, frequencia, canais, distancia);
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
}
