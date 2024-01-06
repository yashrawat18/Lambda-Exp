package SumCalculator;

public class Main{
    public static void main(String[] args) {
        SumCalculator sumCalculator = (x,y)->x+y;
        int result = sumCalculator.sum(7,6);
        System.out.println(result);
        result = sumCalculator.sum(15,78);
        System.out.println(result);

    }
}