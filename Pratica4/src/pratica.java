import java.util.Scanner;

public class pratica {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.println("Escreva a Nota 1:");
		int nota1 = scan.nextInt();

		System.out.println("Escreva a Nota 2:");
		int nota2 = scan.nextInt();

		CalcularMedia(nota1, nota2);

	}

	public static void CalcularMedia(int nota1, int nota2) {
		int media = (nota1 + nota2) / 2;

		if (media >= 7) {
			System.out.println("Aprovado");

		} else {
			System.out.println("Reprovado");
		}
	}

}
