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


        Caneta bic = new Caneta("Azul", 20);
        Caneta pilot = new Caneta("Preta");




        Pessoa pessoa = new Pessoa("Joanma","123.456.789.45","ehdfieqdfk@gmail.com");

        //pessoa.setCpf("123.456.789.45");
        //pessoa.setEmail("ehdfieqdfk@gmail.com");
        //pessoa.setNome("Joanma");

        System.out.println(pessoa);

        Carro formula1 = new Carro();

        formula1.acelerador(140);

        System.out.println(formula1.obterVelocidade());

        formula1.acelerador(30);

        System.out.println(formula1.obterVelocidade());

    }
}
