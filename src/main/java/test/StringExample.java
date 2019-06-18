package test;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringExample {
    public static void main(String[] args) {
        String s = "Hello";
        String s2= "llo";

        System.out.println(s.regionMatches(2, s2, 0, s2.length()));

        List<String> stringList = Arrays.asList("1", "2");

        String join = s.join("-", stringList);

        System.out.println(join);

        System.out.println(s.contains(s2));

        String string = "engineering";
        Pattern pattern = Pattern.compile("([gG])"); //case insensitive, use [g] for only lower
        Matcher matcher = pattern.matcher(string);
        int count = 0;
        while (matcher.find()) count++;

        System.out.println(count);

        System.out.println(s.startsWith("h"));

//        new StringBuilder().

        boolean matches = Pattern.matches(s, s);
        System.out.println(matches);

        String input = "Hello world";

        Pattern pattern1 = Pattern.compile("world");
        Matcher matcher1 = pattern1.matcher(input);

        if (matcher1.find()) {
            System.out.println(matcher1.start());
        }
    }
}
