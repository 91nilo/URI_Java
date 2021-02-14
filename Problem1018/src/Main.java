import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int aux = 0;
		
		int $100 = 0;
		int $50 = 0;
		int $20 = 0;
		int $10 = 0;
		int $5 = 0;
		int $2 = 0;
		int $1 = 0;
		
		int value = sc.nextInt();
		
		$100 = value / 100;
		aux = value - $100 * 100;
		
		$50 = aux / 50;
		aux = aux - $50 * 50;
		
		$20 = aux / 20;
		aux = aux - $20 * 20;
		
		$10 = aux / 10;
		aux = aux - $10 * 10;
		
		$5 = aux / 5;
		aux = aux - $5 * 5;
		
		$2 = aux / 2;
		aux = aux - $2 * 2;
		
		$1 = aux / 1;
		aux = aux - $1 * 1;
		
		System.out.printf("%d\n",value);
		System.out.printf("%d nota(s) de R$100,00\n", $100);
		System.out.printf("%d nota(s) de R$50,00\n", $50);
		System.out.printf("%d nota(s) de R$20,00\n", $20);
		System.out.printf("%d nota(s) de R$10,00\n", $10);
		System.out.printf("%d nota(s) de R$5,00\n", $5);
		System.out.printf("%d nota(s) de R$2,00\n", $2);
		System.out.printf("%d nota(s) de R$1,00\n", $1);
		
		sc.close();
	}

}
