package org.danrtech.factory.with_dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;

@Component
public class SpaceshipFactory {

    /**
     * Using Map data structure together with naming each bean in the brackets
     * like @Component("explorer") is the key in this approach,
     * because all the new beans are registered dynamically
     * (no need to inject individual beans manually, just add a new bean class if required,
     * e.g. a new Scout.java class with @Component("scout") annotation).
     * This approach is also faster compared to individual beans injection with O(1) complexity vs O(n),
     * and hence is better for enterprise applications.
     */
    private Map<String, Spaceship> spaceshipMap;

    @Autowired
    public SpaceshipFactory(Map<String, Spaceship> spaceshipMap) {
        this.spaceshipMap = spaceshipMap;
    }

    public Spaceship createSpaceship(String type) {
        Spaceship spaceship = spaceshipMap.get(type.toLowerCase());
        if (spaceship == null) {
            throw new IllegalArgumentException("Unknown spaceship type: " + type);
        }
        return spaceship;
    }

    // Modern, concise, but harder to read and debug version of the above method:

//    public Spaceship createSpaceship(String type) {
//        return Optional.ofNullable(spaceshipMap.get(type.toLowerCase()))
//                .orElseThrow(() -> new IllegalArgumentException("Unknown spaceship type!"));
//    }

}
