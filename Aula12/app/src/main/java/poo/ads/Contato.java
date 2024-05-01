package poo.ads;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contato {
    String nome;
    String sobrenome;
    LocalDate dataNascimento;
    ArrayList<Telefone>telefones = new ArrayList<>();
    ArrayList<Email>emails = new ArrayList<>();

    public Contato(LocalDate dataNascimento, String nome, String sobrenome) {
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    public boolean adicionaTelefone(String r, String n){
        Telefone t = new Telefone(r,n);
        return telefones.add(t);
    }
    public boolean adicionaEmail(String r, String n){
        Email e = new Email(r,n);
        return emails.add(e);
    }
    public boolean removeTelefone(String r){
        return telefones.removeIf(elemento->elemento.getRotulo().equals(r));
    }
    public boolean removeEmail(String r){
        return emails.removeIf(elemento->elemento.getRotulo().equals(r));
    }
    public boolean updateTelefone(String r, String n) {
        for (Telefone t : telefones) {
            if (t.getRotulo().contains(r)){
                t = new Telefone(r, n);
                t.setValor(n);
                return true;
            }
        }
        return false;
    }

    public boolean updateEmail(String r, String e){
        for (Email email : emails){
            if (email.getRotulo().contains(r)){
                email = new Email(r,e);
                return email.setValor(e);
            }
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

    public ArrayList<Email> getEmails() {
        return emails;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", Sobrenome='" + sobrenome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", telefones=" + telefones +
                ", emails=" + emails +
                '}';
    }
}
