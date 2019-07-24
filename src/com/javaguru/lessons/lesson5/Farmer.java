package com.javaguru.lessons.lesson5;

public class Farmer {

    private String name;
    private Gun gun;

    void shoot() {
        if (gun.getBullets() == 0) {
            gun.reload();
        }
        gun.shoot();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gun getGun() {
        return gun;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "name='" + name + '\'' +
                ", gun=" + gun +
                '}';
    }
}
