package poo.ads;

public class App {
    public static void main(String[] args) {
        Buzz buzz = new Buzz();

        System.out.println(buzz.falar());

        System.out.println(buzz.laser());

        System.out.println("Capacete aberto? "+ buzz.abrirCapacete());

        System.out.println("Capacete aberto? "+ buzz.abrirCapacete());

        System.out.println("Capacete aberto? "+ buzz.isCapaceteAberto());

        Buzz malvado = new Buzz();

        System.out.println("Capacete aberto? "+ malvado.isCapaceteAberto());


        Caneta caneta = new Caneta();

        caneta.setCor("Azul");

        Pessoa pessoa = new Pessoa();

        pessoa.setCpf("123.456.789.45");
        pessoa.setEmail("ehdfieqdfk@gmail.com");
        pessoa.setNome("Joanma");

        System.out.println(pessoa);
    }
}
