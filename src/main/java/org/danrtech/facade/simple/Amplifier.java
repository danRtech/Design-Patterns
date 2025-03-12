package org.danrtech.facade.simple;

public class Amplifier {
    void turnOn(){
        System.out.println("Amplifier turned on");
    }

    void setVolume(int volumeLevel){
        System.out.println("Volume set to: " + volumeLevel);
    }
}
