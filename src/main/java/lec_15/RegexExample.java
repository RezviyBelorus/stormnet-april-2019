package lec_15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String hello = "Hello";
        String test = "Hello";
        String test2 = "Hello";

        System.out.println(Pattern.matches(test, hello));
        System.out.println(Pattern.matches(test2, hello));

        String java = "Java8, JavaScript!, HelloWorld, Java";

        Pattern compile = Pattern.compile("Java\\w*");

        Matcher matcher = compile.matcher(java);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
