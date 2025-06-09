interface Animal {
    void speak();
}

class Dog implements Animal {
    public void speak() {
        System.out.println("Woof Woof");
    }
}

class Cat implements Animal {
    public void speak() {
        System.out.println("Meow Meow");
    }
}

class AnimalFactory {
    public static Animal getAnimal(String type) {
        if (type.equalsIgnoreCase("dog")) return new Dog();
        else if (type.equalsIgnoreCase("cat")) return new Cat();
        return null;
    }
}

public class FactoryDemo {
    public static void main(String[] args) {
        Animal animal1 = AnimalFactory.getAnimal("dog");
        animal1.speak();

        Animal animal2 = AnimalFactory.getAnimal("cat");
        animal2.speak();
    }
}
