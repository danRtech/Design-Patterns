package org.danrtech.factory.with_dependency_injection;

import org.springframework.stereotype.Component;

@Component("scout")
public class Scout implements Spaceship{

    @Override
    public void launch() {
        System.out.println("Scout spaceship launching!");
    }
}
