package ads.poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class App3 {
    public static String formata(String m, String v) throws ParseException {
        if (m == null || v == null) {
            throw new IllegalArgumentException("Máscara e valor não podem ser nulos");
        }
        String resultado = "";
        MaskFormatter mask = new MaskFormatter(m);
        mask.setValueContainsLiteralCharacters(false);
        mask.setPlaceholderCharacter('_');
        resultado = mask.valueToString(v);
        return resultado;
    }
    public static void main(String[] args) {
        try {
            System.out.println(formata(null, "48998765432"));
        } catch (ParseException e) {
            System.err.println("Erro ao formatar a String");
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
