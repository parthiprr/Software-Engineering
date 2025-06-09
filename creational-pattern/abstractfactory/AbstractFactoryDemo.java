interface Car {
    void drive();
}

class Sedan implements Car {
    public void drive() {
        System.out.println("Driving a Sedan");
    }
}

class SUV implements Car {
    public void drive() {
        System.out.println("Driving an SUV");
    }
}

interface CarFactory {
    Car createCar();
}

class SedanFactory implements CarFactory {
    public Car createCar() {
        return new Sedan();
    }
}

class SUVFactory implements CarFactory {
    public Car createCar() {
        return new SUV();
    }
}

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        CarFactory sedanFactory = new SedanFactory();
        Car sedan = sedanFactory.createCar();
        sedan.drive();

        CarFactory suvFactory = new SUVFactory();
        Car suv = suvFactory.createCar();
        suv.drive();
    }
}
