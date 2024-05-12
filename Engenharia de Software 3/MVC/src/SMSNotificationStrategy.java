public class SMSNotificationStrategy implements NotificationStrategy{
    @Override
    public void notify(String message) {
        System.out.println("Enviando notificação via SMS: " + message);
    }
}
