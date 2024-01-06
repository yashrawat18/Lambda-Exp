package StringToUppercaseLowercase;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> StringList = Arrays.asList("Red","Green","Blue","yeLLow");


        System.out.println("\nOriginal Strings:");
        for(String str:StringList){
            System.out.println(str);
        }

        StringList.replaceAll(str->str.toLowerCase());

        System.out.println("\nLowerCase Strings:");
        for(String str:StringList){
            System.out.println(str);
        }

        StringList.replaceAll(str->str.toUpperCase());

        System.out.println("\nUpperCase Strings:");
        for(String str:StringList){
            System.out.println(str);
        }
    }
}
