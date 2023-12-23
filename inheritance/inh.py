# Parent Class
class Animal:
    def __init__(self, name):
        self.name = name
    
    def set_name(self, name):
        self.name= name

    def eat(self):
        print(self.name + ' eats good food.')
    
class Dog(Animal):
    def __init__(self, name):
        super().__init__(name)

    def bark(self):
        print(self.name + ' barks extremely loud.')
    
class BullDog(Dog):
    def __init__(self, name):
        super().__init__(name)

    def guards(self):
        print(self.name + ' guards our compound.')

class Cat(Animal):
    def __init__(self, name):
        super().__init__(name)

    def meow(self):
        print(self.name + ' meows daily.')

# Main code
if __name__ == "__main__":
    # Create instances of the subclasses
    dog = BullDog("Zoey")
    cat = Cat("Putin")

    # Using the setter method to change the name
    dog.set_name("Bosco")

    # Call all methods on the instances
    dog.guards()
    dog.bark()
    dog.eat()
    cat.meow()
    cat.eat()