/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ads.poo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.*;

public class App {
    //private static final Logger LOGGER = Logger.getLogger(App.class.getName());
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        /*LOGGER.setLevel(Level.FINEST);
        LOGGER.fine("Mensagem de depuração");
        LOGGER.info("Aplicação iniciada com sucesso");
        LOGGER.warning("Número de matricula invalido");
        LOGGER.severe("Conexão perdida com sucesso");*/

        /*LOGGER.debug("Requisição");
        LOGGER.info("user");
        LOGGER.warn("Conexão");
        LOGGER.error("Erro");*/

        /*try {
        // código que pode lançar uma exceção
        } catch (IOException e) {
            LOGGER.error("Erro de I/O", e);
            //exibirMensagemParaUsuario("Erro ao acessar o arquivo");
        } catch (SQLException e) {
            LOGGER.error("Erro de SQL", e);
            //exibirMensagemParaUsuario("Erro ao acessar o banco de dados");
        } catch (Exception e) {
            LOGGER.error("Erro genérico", e);
            //exibirMensagemParaUsuario("Comportamento inesperado");
        }*/

        Pessoa p = new Pessoa(" Joana"," 10239769945");
        System.out.println(p);
        p.setNome("julia");
        System.out.println(p);
    }
}
