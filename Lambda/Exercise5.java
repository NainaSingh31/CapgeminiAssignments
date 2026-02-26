package Lambda;

import java.util.function.Function;

//Factorial using Method Reference

public class Exercise5 {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {

        Function<Integer, Integer> factRef = Exercise5::factorial;

        System.out.println("Factorial of 5: " + factRef.apply(5));
        System.out.println("Factorial of 6: " + factRef.apply(6));
    }
}