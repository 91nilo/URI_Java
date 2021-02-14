import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro, que é o tempo de duração em segundos de um determinado
		 * evento em uma fábrica, e informe-o expresso no formato
		 * horas:minutos:segundos. ex: entrada 556 -> 0:9:16
		 */
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int hours, minutes, seconds;
		int aux = 0;
		
		hours = time / 3600;
		minutes = (time - (hours * 3600)) / 60;
		seconds = time - (hours * 3600 + minutes * 60);
		
		System.out.println(hours + ":" + minutes + ":" + seconds);
		
		sc.close();
	}

}
