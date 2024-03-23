package poo.ads;

public class Horario {

    private int hora;
    private int segudos;
    private int minutos;

    private final int MIN = 0;


    public Horario(int hora, int segudos, int minutos) {
        this.hora = hora;
        this.segudos = segudos;
        this.minutos = minutos;
    }

    public Horario() {
        this.hora = MIN;
        this.segudos = MIN;
        this.minutos = MIN;
    }

    public void setHora(int hora) {
        if (hora < MIN || hora > 23) {
            this.hora = MIN;
        }
        else {
            this.hora = hora;
        }
    }

    public void setMinutos(int minutos) {
        if (minutos < MIN || MIN > 59) {
            this.minutos = MIN;
        }
        else {
            this.minutos = MIN;
        }
    }

    public void setSegudos(int segudos) {
        if (segudos < MIN || MIN > 59) {
            this.segudos = MIN;
        }
        else {
            this.segudos = MIN;
        }
    }
}
