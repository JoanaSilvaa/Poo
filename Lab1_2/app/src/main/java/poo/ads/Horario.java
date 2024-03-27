package poo.ads;

public class Horario {

    private String [] dezena = {"Zero","Dez","Vinte","Trinta", "Quarenta","Cinquenta"};
    private String [] unidade = {"zero","um","dois","tres", "quatro","cinco","seis", "sete","oito","nove"};
    private String [] unidadeHora = {"zero","uma","duas","tres", "quatro","cinco","seis", "sete","oito","nove"};
    private int hora;
    private int segudos;
    private int minutos;

    private final int MIN = 00;


    public Horario(int hora, int minutos, int segudos) {
        this.hora=0;
        this.minutos=0;
        this.segudos=0;
        this.setHora(hora);
        this.setMinutos(minutos);
        this.setSegudos(segudos);
    }

    public Horario(int hora, int minutos) {
        this.hora=0;
        this.minutos=0;
        this.segudos=0;
        this.setHora(hora);
        this.setMinutos(minutos);
    }

    public Horario() {
        this(0,0,0);
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

        return    ((auxH>0)? dezena[auxH] + " e " : " " )+ ((aux1H==1)? unidadeHora[aux1H] + " hora, " : unidadeHora[aux1H] + " horas, ")
                + ((auxM>0) ?dezena[auxM] + " e ": " e ") +((aux1M==1)?unidade[aux1M] + " minuto " : unidade[aux1M] + " minutos ")
                + ((auxS>0) ?dezena[auxS] + " e ": " e ") + ((aux1S==1)? unidade[aux1S] + " segundo" : unidade[aux1S] + " segundos" );
    }

    public int totalSegundos(){
        int resultado;
        resultado = this.segudos + (this.minutos * 60) + (this.hora * 3600);
        return resultado;
    }

    public double subtracaoHora(Horario s){
        double resultado, resultado2;
        resultado = s.segudos + (s.minutos * 60) + (s.hora * 3600);
        resultado2 = totalSegundos();
        return resultado2 - resultado;
    }
}
