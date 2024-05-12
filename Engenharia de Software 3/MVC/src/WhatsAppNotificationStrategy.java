public class WhatsAppNotificationStrategy implements NotificationStrategy {

    @Override
    public void notify(String message) {
        System.out.println("Enviando notificação via WhatsApp: " + message);
    }
}
