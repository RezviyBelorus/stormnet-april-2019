package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        Pattern compile = Pattern.compile("^http.*");
        Matcher matcher = compile.matcher("https:");

        System.out.println(matcher.matches());

    }
}
