package com.javaguru.lessons.lesson8.Animals;

public class AnimalsDemo {

    public static void main(String[] args) {
        Animal animal = new Animal(2);
        Mammal mammal = new Mammal(3, "Pets");
        Cat cat = new Cat(1, "Pets", "Boris", "British");
        Dog dog = new Dog(5, "Pets", "Rex", "German Shepherd");
        Bird bird = new Bird(2, "Birds which can talk");
        Parrot parrot = new Parrot(2, "Birds which can talk", "Kesha");


        System.out.println(animal);
        animal.breath();
        animal.eat();
        animal.voice();

        System.out.println();

        System.out.println(mammal);
        mammal.breath();
        mammal.eat();
        mammal.voice();
        mammal.feedWithMilk();

        System.out.println();

        System.out.println(cat);
        cat.breath();
        cat.eat();
        cat.move();
        cat.voice();
        cat.feedWithMilk();
        cat.purr();

        System.out.println();

        System.out.println(dog);
        dog.breath();
        dog.eat();
        dog.run();
        dog.voice();
        dog.feedWithMilk();
        dog.playWithStick();

        System.out.println();

        System.out.println(bird);
        bird.breath();
        bird.eat();
        bird.fly();
        bird.voice();

        System.out.println();

        System.out.println(parrot);
        parrot.breath();
        parrot.eat();
        parrot.fly();
        parrot.voice();
        parrot.talk();
    }


}
