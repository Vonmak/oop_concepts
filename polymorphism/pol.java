package polymorphism;

public class pol {
    public static void main(String[] args) {
        Circle cir = new Circle();

        cir.draw();

        Calculator sum = new Calculator();


        System.out.println("add() with 2 params");
        // Calling function with 2 params
        System.out.println(sum.add(4, 6)); //returns an integer

        System.out.println("add() a with 3 params");
        // Calling function with 3 Params
        System.out.println(sum.add(4, 6, 7)); // returns an output with a decimal

    }
}

// Method overriding
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

}

// Method overloading
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }
}
