// Abstract base class (Animal)
abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    // Abstract method (speak)
    public abstract String speak();
}

// Concrete subclass (Dog)
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return name + " says Woof!";
    }
}

// Concrete subclass (Cat)
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return name + " says Meow!";
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Attempt to create an instance of the abstract class (will not compile)
        // Animal animal = new Animal("Generic"); // This line will raise a compilation
        // error

        // Create instances of the concrete subclasses
        Dog dog = new Dog("Zoey");
        Cat cat = new Cat("Putin");

        // Call the speak method on the instances
        System.out.println(dog.speak()); // Output: Zoey says Woof!
        System.out.println(cat.speak()); // Output: Putin says Meow!
    }
}
