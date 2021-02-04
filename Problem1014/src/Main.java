
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int X = input.nextInt();
		
		double Y = input.nextDouble();
		
		double AverageConsumption  = X/Y;
		
		System.out.printf("%.3f km/l\n", AverageConsumption);
		
		input.close();
	}

}
