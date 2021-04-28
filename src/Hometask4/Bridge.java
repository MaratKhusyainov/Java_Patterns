package Hometask4;

public class Bridge {
    public static void main(String[] args) {
        Vehicle vehicle = new Car(new Ford());
        vehicle.drive();
    }
}

abstract class Vehicle {

    Model model;

    public Vehicle(Model model) {
        this.model = model;
    }

    abstract void drive();
}

class Car extends Vehicle {
    public Car(Model model) {
        super(model);
    }

    @Override
    void drive() {
        model.drive("drive car");
    }
}

class Track extends Vehicle {
    public Track(Model model) {
        super(model);
    }

    @Override
    void drive() {
        model.drive("drive track");
    }
}

interface Model {
    void drive(String str);
}

class Ford implements Model {

    @Override
    public void drive(String str) {
        System.out.println(str + " Ford");
    }
}

class Lexus implements Model {

    @Override
    public void drive(String str) {
        System.out.println(str + " Lexus");
    }
}

