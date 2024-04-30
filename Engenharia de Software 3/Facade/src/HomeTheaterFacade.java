public class HomeTheaterFacade {

    private Amplifier amplifier;
    private Tuner tuner;
    private DVDPlayer dvdPlayer;
    private Projector projector;
    public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, DVDPlayer dvdPlayer, Projector projector) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
    }

    public void watchMovie(){
        System.out.println("Preparando para assistir um filme...");
        amplifier.on();
        amplifier.setSurroundSound();
        tuner.on();
        dvdPlayer.on();
        projector.on();
        projector.setInput();
        dvdPlayer.play();
    }

    public void endMovie(){
        System.out.println("Encerrando a exibição do filme...");
        dvdPlayer.stop();
        dvdPlayer.eject();
        amplifier.off();
        tuner.off();
        dvdPlayer.off();
        projector.off();
    }
}
