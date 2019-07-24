package com.javaguru.lessons.lesson5;

public class Gun {

    private String model;
    private int bullets;

    void shoot() {
        if (bullets > 0) {
            bullets--;
            System.out.println("Pif paf oj oj oj ");
        } else {
            System.out.println("Out of ammo");

        }
    }

    void reload() {
        System.out.println("Reloading");
        bullets = 4;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBullets() {
        return bullets;
    }

    public void setBullets(int bullets) {
        this.bullets = bullets;
    }

    @Override
    public String toString() {
        return "Gun{" +
                "model='" + model + '\'' +
                ", bullets=" + bullets +
                '}';
    }
}
