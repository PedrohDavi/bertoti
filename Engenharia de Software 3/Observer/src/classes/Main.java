package classes;


public class Main {
    public static void main(String[] args) {

        Video video = new Video('1', "Como criar um diagrama de classes UML", "http://www.destino.org",
                "https://www.youtube.com/watch?v=O5wsbBMQiKE")
        ;
        VideoNotification videoNotification = new VideoNotification(video);

        //Observers
        Subscriber pedro = new Subscriber(5, "Pedro");
        Subscriber nycolas = new Subscriber(2, "Nycolas");
        Feed feedYoutube = new Feed("AkdEcn7pWTlGb15PhHmeI");

        videoNotification.subscribe(pedro);
        videoNotification.subscribe(nycolas);
        videoNotification.subscribe(feedYoutube);

        System.out.println("Notificando todos");
        videoNotification.notifyyAll();

        //Unsubscribe
        videoNotification.unsubscribe(nycolas);

        System.out.println("Notificando todos");
        videoNotification.notifyyAll();
    }
}