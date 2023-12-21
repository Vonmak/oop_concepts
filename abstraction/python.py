"""

Python provides the abc (Abstract Base Classes) module to work with abstract classes and methods.

"""

from abc import ABC, abstractmethod

# Abstract base class (Animal)
class Animal(ABC):
    def __init__(self, name):
        self.name = name

    @abstractmethod
    def speak(self):
        pass

# Concrete subclass (Dog)
class Dog(Animal):
    def speak(self):
        return f"{self.name} says Woof!"

# Concrete subclass (Cat)
class Cat(Animal):
    def speak(self):
        return f"{self.name} says Meow!"

# Attempt to create an instance of the abstract class (will raise TypeError)
try:
    animal = Animal("Generic")
except TypeError as e:
    print(e)  # Output: Can't instantiate abstract class Animal with abstract methods speak

# Create instances of the concrete subclasses
dog = Dog("Zoey")
cat = Cat("Putin")

# Call the speak method on the instances
print(dog.speak())  # Output: Zoey says Woof!
print(cat.speak())  # Output: Putin says Meow!
