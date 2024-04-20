package ads.poo;

import java.util.ArrayList;
import java.util.HashMap;

public class AppLivraria {
    public static void main(String[] args) {

        HashMap<String,Livro> banco = new HashMap<>();


        ArrayList<Autor> autores = new ArrayList<>();
        autores.add(new Autor("joao","brasileiro"));
        autores.add(new Autor("pedro","brasileiro"));
        Livro livro1 = new Livro("1234567891236",autores, 12.5, "abobora");
        banco.put(livro1.getIsbn(),livro1);

        ArrayList<Autor> autoresl1 = new ArrayList<>();
        autoresl1.add(new Autor("joao","brasileiro"));
        Livro livro2 = new Livro("3678952366945",autoresl1, 1295.3, "cenoura");
        banco.put(livro2.getIsbn(),livro2);

        //depois do livro criado adicionar autor


    }
}
