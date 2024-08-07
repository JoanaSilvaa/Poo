/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ads.poo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b;

        try {
            System.out.println("Entre com o número");
            a= ler.nextInt();
            System.out.println("Entre com o númeero");
            b= ler.nextInt();

            double res = a/b;
            System.out.println(a+ "dividido por" + b + "=" + res);
        } catch (InputMismatchException e) {
            System.out.println("Só é permitido números inteiros");
            ler.nextLine();
        } catch (ArithmeticException e) {
            System.out.println("Não é permitido divisor = 0");
            ler.nextLine();
        } catch (Exception e) {
            System.out.println("Valores inválidos");
            ler.nextLine();
        }
        System.out.println("Fim do programa");
    }
}