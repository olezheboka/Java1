package com.javaguru.lessons.lesson5;

public class FarmerTest {

    public static void main(String[] args) {
        Gun gun = new Gun();
        gun.setBullets(4);
        gun.setModel("Winchester");
        Farmer farmer = new Farmer();
        farmer.setName("Bob");
        farmer.setGun(gun);
        farmer.shoot();
        farmer.shoot();
        farmer.shoot();
        farmer.shoot();
        farmer.shoot();
        farmer.shoot();

        System.out.println(farmer);

    }
}
