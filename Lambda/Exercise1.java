package Lambda;

//Write a lambda expression which accepts x and y numbers and returns xʸ

public class Exercise1 {
    public static void main(String[] args) {
        Power power = (x, y) -> Math.pow(x, y);

        System.out.println("2^3 = " + power.calculate(2, 3));
        System.out.println("5^2 = " + power.calculate(5, 2));
    }
}