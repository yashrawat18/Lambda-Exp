package FilterEvenOdd;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(11,23,46,100,1,5);

        System.out.println("\nOriginal Array");
        for(Integer num:nums){
            System.out.print(num+" ");
        }

        List<Integer> evenNumbers = nums.stream().filter(n->n%2==0).collect(Collectors.toList());

        System.out.println("\nEven numbers");
        for(Integer num:evenNumbers){
            System.out.println(num+" ");
        }

        List<Integer> oddNumbers = nums.stream().filter(n->n%2!=0).collect(Collectors.toList());

        System.out.println("\nOdd numbers");
        for(Integer num:oddNumbers){
            System.out.println(num+" ");
        }
    }
}
