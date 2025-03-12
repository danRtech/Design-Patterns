package org.danrtech.facade.simple;

public class HomeTheaterFacade {
    private final Amplifier amplifier;
    private final DVDPlayer dvdPlayer;
    private final Projector projector;

    public HomeTheaterFacade(Amplifier amplifier, DVDPlayer dvdPlayer, Projector projector) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
    }

    public void watchMovie(String movie){
        System.out.println("Starting movie ...");
        projector.turnOn();
        amplifier.turnOn();
        amplifier.setVolume(10);
        dvdPlayer.playMovie(movie);
    }
}
