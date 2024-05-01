package poo.ads;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Telefone {
    String rotulo;
    String valor;

    public Telefone(String rotulo, String valor) {
        setValor(valor);
        setRotulo(rotulo);
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    public void setValor(String valor) {
        this.valor = formata("(##) #####−####", valor);
    }

    private String formata(String mascara, String valor){
        MaskFormatter mask = null;
        String resultado = "";
        try {
            mask = new MaskFormatter(mascara);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public String getRotulo() {
        return rotulo;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "rotulo='" + rotulo + '\'' +
                ", valor='" + valor + '\'' +
                '}';
    }
}
