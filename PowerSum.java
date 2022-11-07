
import java.util.Scanner;
public class PowerSum {
        static int squaresum(int n){
		int sum = 0;
		for (int i = 1; i <= n; i++)
			sum += (i * i);
		return sum;
	}
	public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

		System.out.println(squaresum(n));
	}
}
