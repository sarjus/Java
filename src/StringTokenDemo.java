import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenDemo {
	public static void main(String[] args) {
		String numbers;
		Scanner sc  =  new Scanner(System.in);
		System.out.println("Enter line of integers");
		numbers = sc.nextLine();
		StringTokenizer tokenizer = new StringTokenizer(numbers);
		int number;
		int sum=0;
		System.out.println("The integers are:");
		while(tokenizer.hasMoreElements()) {
			number = Integer.parseInt(tokenizer.nextToken());
			System.out.println(number);
			sum = sum+number;
		}
		System.out.println("Sum="+sum);
		sc.close();
	}

}
