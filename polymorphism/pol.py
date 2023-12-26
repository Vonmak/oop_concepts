# Method overriding
class Shape:
    def draw(self):
        print("This is a shape")


class Circle(Shape):
    def draw(self):
        print("This is a circle")


# Method overloading
class Calculator:
    def add(self, a, b, c=None):
        if c is None:
            return a + b

        else:
            return a+b+c


# Main code
if __name__ == "__main__":
    # Create instances of the subclasses
    draw = Circle()

    addition = Calculator()

    # Call all methods on the instances
    draw.draw()

    print("add() with 2 params")
    # Calling function with 2 params
    print(addition.add(4, 6))

    print("add() a with 3 params")
    # Calling function with 3 Params
    print(addition.add(4, 6, 7))
