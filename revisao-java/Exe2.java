public class Exe2 {
    public static void main(String[] args) {

        double Resultado;
        int Valor1, Valor2, Valor3;

        Valor1 = Integer.parseInt(args[0]);
        Valor2 = Integer.parseInt(args[1]);
        Valor3 = Integer.parseInt(args[2]);

        Resultado = (Valor1 * 2) + (Valor2 * 3) ;
        Resultado = (Resultado/5) * 0.9;
        Resultado = Resultado + ( Valor3 * 0.1);

        if(Resultado >= 6){
            System.out.println("Aprovado, com nota final= " + Resultado);
        }
        else{
            System.out.println("Reprovado, com nota final= " + Resultado);
        }
    }
}