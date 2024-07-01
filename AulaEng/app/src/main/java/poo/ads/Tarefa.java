package poo.ads;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tarefa {
    private String nome;
    private LocalDate inicio;
    private LocalDate fim;
    private Grupo grupo;
    private ArrayList<Pessoa> participantes = new ArrayList<>();

    public Tarefa(String nome, LocalDate inicio, LocalDate fim, Grupo grupo, ArrayList<Pessoa> participantes) {
        this.nome = nome;
        this.inicio = inicio;
        this.fim = fim;
        this.grupo = grupo;
        this.participantes = participantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFim() {
        return fim;
    }

    public void setFim(LocalDate fim) {
        this.fim = fim;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public ArrayList<Pessoa> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Pessoa> participantes) {
        this.participantes = participantes;
    }

}
