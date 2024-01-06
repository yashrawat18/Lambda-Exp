package CheckForEmptyString;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate isEmptyString = str->((String)str).isEmpty();

        String str1="";
        String str2="Java lambda expression";

        System.out.println(str1);
        System.out.println(isEmptyString.test(str1));
        System.out.println(str2);
        System.out.println(isEmptyString.test(str2));

    }
}
