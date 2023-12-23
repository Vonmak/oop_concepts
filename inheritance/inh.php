<?php

// Base class (Animal)
class Animals
{
    protected $name;

    public function __construct($name)
    {
        $this->name = $name;
    }
    public function setName($name)
    {
        $this->name = $name;
    }
    public function eat()
    {
        echo $this->name . " eats";
    }
}

// Concrete subclass (Dog) inherits from parent class(Animal)
class Dog extends Animals
{
    public function __construct($name)
    {
        parent::__construct($name);
    }

    public function bark()
    {
        echo $this->name . " barks extremely loud.";
    }
}

class BullDog extends Dog
{
    public function __construct($name)
    {
        parent::__construct($name);
    }
    public function guards()
    {
        echo $this->name . " guards our compound.";
    }
}


// Concrete subclass (Cat) inherits from parent class(Animal)
class Cat extends Animals
{
    public function __construct($name)
    {
        parent::__construct($name);
    }

    public function meow()
    {
        return $this->name . " meows daily.";
    }
}



// Create instances of the concrete subclasses
$dog = new BullDog("Zoey");
$cat = new Cat("Putin");

$dog->setName("Bosco");

// Call the speak method on the instances
echo $dog->eat() . PHP_EOL;
echo $dog->bark() . PHP_EOL;
echo $dog->guards() . PHP_EOL;

echo $cat->eat() . PHP_EOL;
echo $cat->meow() . PHP_EOL;
