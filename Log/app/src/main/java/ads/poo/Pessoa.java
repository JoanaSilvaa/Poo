package ads.poo;
import lombok.Data;
import lombok.NonNull;
@Data
public class Pessoa {

    @NonNull
    private String nome;
    @NonNull
    private String cpf;

}