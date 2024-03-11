package poo.ads;

public class Buzz {
    private int capaceteRetratil;
    private int frases;
    private int dispararLaser;
    private int braco;
    private boolean asas;


    public int abrir(){
        if (capaceteRetratil == 1){
            --capaceteRetratil;
        }
        else{
            ++capaceteRetratil;
        }
        return capaceteRetratil;
    }

    public int laser(){
        if (dispararLaser == 1){
            --dispararLaser;
        }
        else{
            ++dispararLaser;
        }
        return dispararLaser;
    }


    public int falar(){
        if(frases == 0){
            ++frases;
            System.out.print("Oi, eu sou o Buzz Lightyear !");

        } else if (frases == 1) {
            ++frases;
            System.out.print("Embora você tenha tentado acabar comigo, a vingança não é um ideal que promovemos no meu planeta.");

        } else if (frases == 2){
            ++frases;
            System.out.print("Nunca duvidei de mim mesmo, Comandante, e não vou começar agora!");

        } else if (frases == 3) {
            System.out.print("Nunca duvidei de mim mesmo, Comandante, e não vou começar agora!");
            ++frases;
        } else if (frases == 4) {
            System.out.print("Nunca duvidei de mim mesmo, Comandante, e não vou começar agora!");
            ++frases;
        }else if (frases==5){
            System.out.print("Ao infinito e além!");
             frases = 0;
        }
        return frases;
    }


}
