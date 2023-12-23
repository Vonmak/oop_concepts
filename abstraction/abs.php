<?php

// Abstract base class (Animal)
abstract class Animal {
    protected $name;

    public function __construct($name) {
        $this->name = $name;
    }

    // Abstract method (speak)
    abstract public function speak();
}

// Concrete subclass (Dog)
class Dog extends Animal {
    public function __construct($name) {
        parent::__construct($name);
    }

    public function speak() {
        return $this->name . " says Woof!";
    }
}

// Concrete subclass (Cat)
class Cat extends Animal {
    public function __construct($name) {
        parent::__construct($name);
    }

    public function speak() {
        return $this->name . " says Meow!";
    }
}

// Create instances of the concrete subclasses
$dog = new Dog("Zoey");
$cat = new Cat("Putin");

// Call the speak method on the instances
echo $dog->speak() . PHP_EOL; // Output: Zoey says Woof!
echo $cat->speak() . PHP_EOL; // Output: Putin says Meow!

?>
