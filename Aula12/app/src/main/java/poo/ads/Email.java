package poo.ads;

public class Email {
    String rotulo;
    String valor;

    public Email(String rotulo, String valor) {
        this.rotulo = rotulo;
        this.valor = "";
        this.setValor(valor);
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    public boolean setValor(String valor) {
        String eR = "^[\\w−\\+]+(\\.[\\w]+)∗@[\\w−]+(\\.[\\w]+)∗(\\.[a−z]{2,})$";
        if (valor.matches(eR)){
            this.valor = valor;
            return true;
        }
        return false;
    }

    public String getRotulo() {
        return rotulo;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Email{" +
                "rotulo='" + rotulo + '\'' +
                ", valor='" + valor + '\'' +
                '}';
    }
}
