import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {

    private static Logger instance;
    private PrintWriter writer;

    // Construtor privado para impedir instâncias diretas
    private Logger() {
        try {
            // Inicializa o PrintWriter para escrever em um arquivo de log
            writer = new PrintWriter(new FileWriter("log.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
}
    // Método estático para retornar a instância única
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Método para registrar uma mensagem no arquivo de log
    public synchronized void log(String message) {
        writer.println(message);
        writer.flush();
    }

    // Método para fechar o arquivo de log
    public void close() {
        writer.close();
    }
}
