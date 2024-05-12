public class EmailNotificationStrategy implements NotificationStrategy{

    @Override
    public void notify(String message) {
        System.out.println("Enviando notificação via E-mail: " + message);
    }
}
