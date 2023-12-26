<?php

class Student
{
    public $name;
    public $age;

    public function __construct($name, $age)
    {
        $this->name = $name;
        $this->age = $age;
    }
    public function getName()
    {
        return $this->name;
    }
    public function getAge()
    {
        return $this->age;
    }
    public function setName($name)
    {
        $this->name = $name;
    }
    public function setAge($age)
    {
        $this->age = $age;
    }
}

// Create instances of the concrete subclasses
$std = new Student("Zoey", 20);

$std->setName("James");
$std->setAge(28);

// Call the methods on the instances
echo "This student name is ", $std->getName() . PHP_EOL;
echo "This student age is ", $std->getAge() . PHP_EOL;
