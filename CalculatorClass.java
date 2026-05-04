
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class AdvancedCalculator extends Calculator {
    // New overloaded method
    float add(float a, float b) {
        return a + b;
    }
}

public class CalculatorClass {
    public static void main(String[] args) {
        AdvancedCalculator calc = new AdvancedCalculator();

        System.out.println("Sum of 2 ints: " + calc.add(5, 10));
        System.out.println("Sum of 3 ints: " + calc.add(1, 2, 3));
        System.out.println("Sum of doubles: " + calc.add(2.5, 3.5));
        System.out.println("Sum of floats: " + calc.add(4.5f, 5.5f));
    }
}
