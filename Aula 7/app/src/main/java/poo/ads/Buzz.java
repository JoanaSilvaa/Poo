package poo.ads;
import java.util.Random;

public class Buzz {


    private boolean asas;
    private boolean capaceteRetratil;
    private String [] frases = {"Oi, eu sou o Buzz Lightyear !", "Embora você tenha tentado acabar comigo, a vingança não é um ideal que promovemos no meu planeta.",
            "Nunca duvidei de mim mesmo, Comandante, e não vou começar agora!", "Ao infinito e além!", "Comando estrelar", "Não sou um boneco"
    };

    public boolean isCapaceteAberto(){
        return capaceteRetratil;
    }


    public String laser(){
        return "Disparando laser";
    }

    public String braco(){
        return "Gospeando";
    }

    public boolean abrirCapacete(){
        capaceteRetratil = ! capaceteRetratil;
        return capaceteRetratil;
    }

    public boolean abrirAsas(){
        this.asas = ! this.asas;
        if(asas){
            return true;
        }else {
            return false;
        }
    }

    public String falar(){
        Random r = new Random();
        int i = r.nextInt(6);
        return frases[i];
    }
}
