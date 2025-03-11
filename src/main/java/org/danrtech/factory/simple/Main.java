package org.danrtech.factory.simple;

public class Main {
    public static void main(String[] args){

        SpaceshipFactory spaceshipFactory = new SpaceshipFactory();

        Spaceship fighter = spaceshipFactory.createSpaceship("Fighter");
        fighter.launch();

        Spaceship explorer = spaceshipFactory.createSpaceship("Explorer");
        explorer.launch();

        // Exception is thrown here since there is no "Scout" option in the factory.
        Spaceship scout = spaceshipFactory.createSpaceship("Scout");
        scout.launch();
    }
}
