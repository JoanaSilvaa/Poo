/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ads.poo;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        App resposta = new App();

        Scanner linha = new Scanner(System.in);
        char[][] campo_minado = new char[9][9];

        int l = 0;

        while (linha.hasNext())
        {
            String z = linha.next();
            for (int c = 0; c < campo_minado.length; c++) {
                campo_minado[l][c] = z.charAt(c);
            }
            ++l;
        }

        linha.close();

        for (l = 0; l < campo_minado.length; l++) {
            int aux = l;

            for (int c = 0; c < campo_minado.length; c++) {

                int aux_1 = c;

                if (campo_minado[aux][aux_1] == '*') {

                    //Testando posição  x*
                    --aux_1;
                    if (aux_1 >= 0) {
                        resposta.comparacoes(aux,aux_1,campo_minado);
                    }
                    ++aux_1;

                    //Testando posição  *x
                    ++aux_1;
                    if (aux_1 < campo_minado.length) {
                        resposta.comparacoes(aux,aux_1,campo_minado);
                    }

                    //Testando posição  *.
                    //                  .x
                    if (aux_1 < campo_minado.length ){
                        ++aux;
                        if(aux < campo_minado.length) {
                            resposta.comparacoes(aux, aux_1, campo_minado);
                        }
                    }
                    --aux_1;

                    //Testando posição  .*
                    //                  X.
                    --aux_1;
                    if (aux_1 >= 0) {
                        if (aux < campo_minado.length) {
                            resposta.comparacoes(aux,aux_1,campo_minado);
                        }
                    }

                    //Testando posição  *
                    //                  x
                    ++aux_1;
                    if (aux < campo_minado.length) {
                        resposta.comparacoes(aux,aux_1,campo_minado);
                    }
                    --aux;

                    //Testando posição  X
                    //                  *
                    --aux;
                    if (aux >= 0) {
                        resposta.comparacoes(aux,aux_1,campo_minado);
                    }

                    //Testando posição  X.
                    //                  .*
                    if (aux >= 0) {
                        --aux_1;
                        if (aux_1 >= 0) {
                            resposta.comparacoes(aux,aux_1,campo_minado);
                        }
                        ++aux_1;
                    }
                    //Testando posição  .X
                    //                  *.

                    if (aux >= 0) {
                        ++aux_1;
                        if (aux_1 < campo_minado.length) {
                            resposta.comparacoes(aux,aux_1,campo_minado);
                        }
                        --aux_1;
                    }
                    ++aux;
                }
            }

            for (l = 0; l < campo_minado.length; l++) {
                for (int c = 0; c < campo_minado.length; c++) {
                    System.out.print(campo_minado[l][c]);
                }
                System.out.println();
            }

        }
    }

    public static void comparacoes(int aux,int aux_1,char[][] campo_minado) {
        if (campo_minado[aux][aux_1] == '.') {
            campo_minado[aux][aux_1] = '1';
        } else if (campo_minado[aux][aux_1] == '*') {

        } else {
            if (campo_minado[aux][aux_1] == '1') {
                campo_minado[aux][aux_1] = '2';
            }
            else if (campo_minado[aux][aux_1] == '3') {
                campo_minado[aux][aux_1] = '4';
            }
            else if (campo_minado[aux][aux_1] == '4') {
                campo_minado[aux][aux_1] = '5';
            }
            else if (campo_minado[aux][aux_1] == '5') {
                campo_minado[aux][aux_1] = '6';
            }
            else if (campo_minado[aux][aux_1] == '6') {
                campo_minado[aux][aux_1] = '7';
            }
            else if (campo_minado[aux][aux_1] == '7') {
                campo_minado[aux][aux_1] = '8';
            }
        }
    }
}
