package inheritance;

// Base class (Animal)
class Animal {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " eats");
    };
}

// Concrete subclass (Dog) inherits from parent class(Animal)
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Additional method specific to Dog
    public void bark() {
        System.out.println(name + " says Woof!");
    }
}

class BullDog extends Dog {
    public BullDog(String name) {
        super(name);
    }

    // Additional method specific to bulldog
    public void guards() {
        System.out.println(name + " guards our compound.");
    }
}

// subclass (Cat) inherits from parent class(Animal)
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    // Additional method specific to Cat
    public void meow() {
        System.out.println(name + " says Meow!");
    }
}

// Main class
public class inh {
    public static void main(String[] args) {
        // Create instances of the subclasses
        BullDog dog = new BullDog("Zoey");
        Cat cat = new Cat("Putin");

        // Using the setter method to change the name
        dog.setName("Bosco");

        // Call all methods on the instances
        dog.guards();
        dog.bark();
        dog.eat();
        cat.meow();
        cat.eat();
    }
}
