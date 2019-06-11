package lec_15;

public class StringExample {
    public static void main(String[] args) {
        String input = "HHelloh";
        String test = new String("Hello");

        System.out.println(input.startsWith("e"));
        System.out.println(input.endsWith("llo"));

        System.out.println(input.charAt(1));

        System.out.println(input.contains(test));

        System.out.println("Matches: " + input.matches(test));

        System.out.println("==" + (input == test));

        test = test.intern();
        System.out.println("==" + (input == test));

        String csv = "Vova, Petya, Vasya";

        String[] splittedNames = csv.split(",");

        for (String name : splittedNames) {
            System.out.println(name.trim());
        }

        System.out.println(csv.toLowerCase());
        System.out.println(csv.toUpperCase());

        System.out.println(csv.substring(4));
        System.out.println(csv.substring(6, 12));


        System.out.println(input.indexOf("H"));
    }
}
