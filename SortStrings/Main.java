package SortStrings;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("Red","Black","Blue","Pink","Maroon","Orange");
        

        System.out.println("\nOriginal String:");
        for(String color:colors){
            System.out.print(color+" ");
        }

        colors.sort((str1,str2)->str1.compareToIgnoreCase(str2));

        System.out.print("\nSorted String:");
        for(String color:colors){
            System.out.print(color+" ");
        }

        

    }
}
