package poo.ads;

public class Horario {

    private String [] dezena = {"","Dez","Vinte","Trinta", "Quarenta","Cinquenta"};
    private String [] unidade = {"","um","dois","tres", "quatro","cinco","seis", "sete","oito","nove"};
    private String [] unidadeHora = {"","uma","duas","tres", "quatro","cinco","seis", "sete","oito","nove"};
    private int hora;
    private int segudos;
    private int minutos;

    private final int MIN = 00;


    public Horario(int segudos, int minutos, int hora) {
        if(setHora(hora) == false){
            this.hora = MIN;
            this.minutos = MIN;
            this.segudos = MIN;
        }else{
            if (setMinutos(minutos) == false){
                this.hora = MIN;
                this.minutos = MIN;
                this.segudos = MIN;
            }
            else {
                if (setSegudos(segudos) == false){
                    this.hora = MIN;
                    this.minutos = MIN;
                    this.segudos = MIN;
                }
                else {
                    this.hora = hora;
                    this.segudos = segudos;
                    this.minutos = minutos;
                }
            }
        }
    }

    public Horario() {
        this.hora = MIN;
        this.segudos = MIN;
        this.minutos = MIN;
    }

    public boolean setHora(int hora) {
        if (hora < MIN || hora > 23) {
            return false;
        }
        else {
            this.hora = hora;
            return true;
        }
    }

    public boolean setMinutos(int minutos) {
        if ((minutos < MIN) || (minutos > 59)) {
            return false;
        }
        else {
            this.minutos = minutos;
            return true;
        }
    }

    public boolean setSegudos(int segudos) {
        if (segudos < MIN || segudos > 59) {
            return false;
        }
        else {
            this.segudos = segudos;
            return true;
        }
    }
    public String toString() {
        return hora + ":" + minutos + ":" + segudos;
    }

    public String extenso(Horario s){
        int auxH, aux1H,auxM, aux1M, auxS, aux1S;
        auxH = s.hora/10;
        aux1H = s.hora % 10;
        auxM = s.minutos/10;
        aux1M = s.minutos % 10;
        auxS = s.segudos/10;
        aux1S = s.segudos % 10;

        return dezena[auxH] + unidadeHora[aux1H] + " hora, "+dezena[auxM] + unidade[aux1M] + " minutos e "+dezena[auxS]+ unidade[aux1S] + " segundos";
    }

    public int totalSegundos(Horario s){
        int resultado;
        resultado = s.segudos + (s.minutos * 60) + (s.hora * 3600);
        return resultado;
    }

    public double subtracaoHora(Horario s){
        double resultado, resultado2;
        resultado = s.segudos + (s.minutos * 60) + (s.hora * 3600);
        resultado2 = this.segudos + (this.minutos * 60) + (this.hora * 3600);
        return resultado2 - resultado;
    }
}
