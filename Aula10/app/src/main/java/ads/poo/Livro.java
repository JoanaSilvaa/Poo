package ads.poo;

import java.util.ArrayList;

public class Livro {
    private  String titulo;
    private  Double preco;
    private  ArrayList<Autor>autores;
    private  String isbn; //13


    public Livro(String isbn, ArrayList<Autor> autores, Double preco, String titulo) {
        this.titulo = titulo;
        this.autores = autores;
        this.preco = preco;
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (Autor autor :  this.autores){
            sb.append(autor);
        }
        return String.format("Isbn: %s, Titulo %s, preço %d, autores:\n" +
                "%s", isbn, titulo,preco,sb);
    }

    public boolean addAutor(Autor a){
        return this.autores.add(a);
    }

}
