package poo.ads;

import java.util.ArrayList;

public class Agenda {
    ArrayList <Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public boolean adiciona(Contato c){
        return contatos.add(c);
    }

    public boolean removeContato(String n, String s) {
       return contatos.removeIf(elemento->elemento.getNome().equals(n));
    }

    public boolean adicionaTelefone(String r, String n, Contato c){
        return c.adicionaTelefone(r,n);
    }

    public boolean adicionaEmail(String r, String n, Contato c){
        return c.adicionaEmail(r,n);
    }


    public boolean updateTelefone(String r, String n, Contato c){
        return c.updateTelefone(r,n);
    }

    public boolean updateEmail(String r, String n, Contato c){
        return c.updateEmail(r,n);
    }

    public boolean removeTelefone(String r,Contato c){
        return c.removeTelefone(r);
    }

    public boolean removeEmail(String r,Contato c){
        return c.removeEmail(r);
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "contatos=" + contatos +
                '}';
    }
}
