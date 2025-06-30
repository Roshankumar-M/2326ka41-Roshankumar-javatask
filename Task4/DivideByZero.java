package codejava;

public class DivideByZero {
    public static void main(String[] args) {
        int a = 0;
        int b = 10;
        float result = 0;

        try {
            result = b / a; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }

        System.out.println("Program continues...");
        System.out.println(result);
    }
}