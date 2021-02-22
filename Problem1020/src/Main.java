import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digitar idade em dias: ");
		int age = sc.nextInt();
		
		int years = age/365;
		int months = (age%365)/30;
		int days = (age%365)%30;

		System.out.println(years + " ano(s)");
		System.out.println(months + " mes(es)");
		System.out.println(days + " dia(s)");
		sc.close();
	}

}
