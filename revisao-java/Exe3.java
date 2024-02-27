import java.util.Random;
import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner entrada = new Scanner(System.in);

        int Resultado = r.nextInt(101);

        //declarando um vetor com 100 posiçoes
        int[] vet = new int[100];

        int Resposta = -1;

        while (Resultado != Resposta){

            System.out.print("Entre com um numero de 0 a 100: ");
            Resposta = entrada.nextInt();

            if (Resultado == Resposta){
                System.out.println("Resposta correta");
            } else if (Resposta > 100) {
                System.out.println("Entrada invalida");
            } else{
                vet[Resposta]++;
                if (vet[Resposta] > 1){
                    System.out.println("Você já tentou "+ vet[Resposta] + " vezes");
                }
            }

        }

    }
}