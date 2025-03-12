package org.danrtech.factory.with_dependency_injection;

import org.springframework.stereotype.Component;

@Component("fighter")
public class Fighter implements Spaceship{

    @Override
    public void launch() {
        System.out.println("Fighter spaceship launching!");
    }
}
