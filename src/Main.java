import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Entre com seu nome: ");
        String Nome = teclado.next(); // lendo cadeia de caracteres

        System.out.print("Entre com o ano que você nasceu: ");
        int Ano = teclado.nextInt(); // lendo inteiro

        System.out.print("Entre com o ano atual: ");
        int Atual = teclado.nextInt(); // lendo inteiro

        int Idade = Atual - Ano;

        System.out.println(Nome + ", possui "+ Idade + " anos ");
    }
}