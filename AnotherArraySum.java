import java.util.Arrays;
import java.util.stream.IntStream;  
public class AnotherArraySum {  
    public static void main(String[] args) {
 int[] array = { 10,20,15, };
 IntStream stream = Arrays.stream(array);
 int sum = stream.sum();
 System.out.println("Sum of array elements is: " + sum);
 }
}