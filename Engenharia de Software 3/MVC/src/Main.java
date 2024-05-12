public class Main {
    public static void main(String[] args) {

        // Criando observadores
        NotificationObserver observer1 = new NotificationObserver("Observer 1");
        NotificationObserver observer2 = new NotificationObserver("Observer 2");

        // Criando um novo observador como um proxy para observer1
        Observer proxyObserver1 = new Observer() {
            @Override
            public void update(String message) {
                System.out.println("[Proxy] " + observer1.getName() + " Notificação recebida: " + message);
            }
        };

        // Registrando proxyObserver1 como observador do observer2
        observer2.attach(proxyObserver1);

        // Notificando observer2
        observer2.changeState("Novo Estado");

        // Criando estratégias de notificação
        NotificationStrategy emailStrategy = new EmailNotificationStrategy();
        NotificationStrategy smsStrategy = new SMSNotificationStrategy();

        // Configurando observadores com as estratégias de notificação
        observer1.setNotificationStrategy(emailStrategy);
        observer2.setNotificationStrategy(smsStrategy);

        // Notificando observadores novamente com as novas estratégias de notificação
        observer1.changeState("Mais um Estado");
        observer2.changeState("Sim, mais um Estado");
    }
}