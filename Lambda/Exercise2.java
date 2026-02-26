package Lambda;

import java.util.function.Function;

//Insert space between each character using lambda

public class Exercise2 {
    public static void main(String[] args) {

        Function<String, String> formatString = str -> {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                result.append(str.charAt(i));
                if (i != str.length() - 1) {
                    result.append(" ");
                }
            }
            return result.toString();
        };

        System.out.println(formatString.apply("CG"));
        System.out.println(formatString.apply("HELLO"));
    }
}