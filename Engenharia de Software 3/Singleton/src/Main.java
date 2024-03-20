public class Main {
    public static void main(String[] args) {
        // Obter a instância do logger
        Logger logger = Logger.getInstance();

        // Registrar algumas mensagens de log
        logger.log("Primeira mensagem de log.");
        logger.log("Segunda mensagem de log.");

        // Fechar o logger após o uso
        logger.close();

        System.out.println("Mensagens de log registradas com sucesso.");
    }
}