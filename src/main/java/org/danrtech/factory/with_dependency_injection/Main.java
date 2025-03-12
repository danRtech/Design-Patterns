package org.danrtech.factory.with_dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    private final SpaceshipFactory spaceshipFactory;

    @Autowired
    public Main(SpaceshipFactory spaceshipFactory) {
        this.spaceshipFactory = spaceshipFactory;
    }

    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Spaceship fighter = spaceshipFactory.createSpaceship("Fighter");
        fighter.launch();

        Spaceship explorer = spaceshipFactory.createSpaceship("Explorer");
        explorer.launch();

        Spaceship scout = spaceshipFactory.createSpaceship("Scout");
        scout.launch();
    }
}
