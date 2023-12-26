class Student:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def set_name(self, name):
        self.name = name

    def get_name(self):
        return self.name

    def set_age(self, age):
        self.age = age

    def get_age(self):
        return self.age


# Main code
if __name__ == "__main__":
    # Create an instance of the Student class by providing name and age
    std = Student("Daniel", 20)

    # Using the setter method to change the name
    std.set_name("David")
    std.set_age(25)

    # Retrieve and print the updated name
    print("This student's name is", std.get_name())
    print("This student's age is", std.get_age())
