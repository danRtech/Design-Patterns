package org.danrtech.factory.with_dependency_injection;

import org.springframework.stereotype.Component;

@Component("explorer")
public class Explorer implements Spaceship{

    @Override
    public void launch() {
        System.out.println("Explorer spaceship launching!");
    }
}
