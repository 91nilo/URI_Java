import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int gastoKmPorLitro = 12;
		int tempo = sc.nextInt();
		int velocidadeMedia = sc.nextInt();
		
		double gastoCombustivel = (velocidadeMedia*tempo) / (double)gastoKmPorLitro;
		System.out.printf("%.3f\n", gastoCombustivel);
		
		sc.close();
	}

}
