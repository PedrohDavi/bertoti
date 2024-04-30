public class Main {
    public static void main(String[] args) {

        Amplifier amplifier = new Amplifier();
        Tuner tuner = new Tuner();
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();

        // Criando a fachada do home theater
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, tuner, dvdPlayer, projector);

        // Assitindo um filme usando
        homeTheater.watchMovie();

        // Encerrando a exibição do filme
        homeTheater.endMovie();
    }
}