/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package poo.ads;


public class App {
    public static void main(String[] args) {

        Horario h = new Horario(00,20,1);
        Horario v = new Horario(30,20,1);

        System.out.println(h.toString());

        System.out.println(v.subtracaoHora(h));

        System.out.println(h.extenso(h));
    }
}