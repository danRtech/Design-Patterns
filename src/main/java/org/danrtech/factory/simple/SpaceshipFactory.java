package org.danrtech.factory.simple;

public class SpaceshipFactory {
    public Spaceship createSpaceship(String spaceshipType) {
        if (spaceshipType.equalsIgnoreCase("Fighter")){
            return new Fighter();
        } else if (spaceshipType.equalsIgnoreCase("Explorer")){
            return new Explorer();
        }
        throw new IllegalArgumentException("Unknown Spaceship Type");
    }
}
