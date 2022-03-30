import java.util.Scanner;

public class pratica3 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int nota1=0, nota2=0, nota3=0;

		System.out.println("Escreva a Primeira Nota:");
		if (scan.nextInt() > 10) {
			System.out.println("Digite um número entre 0 e 10");
		} else {
			nota1 = scan.nextInt();
		}
		System.out.println("Escreva a Segunda Nota:");
		if (scan.nextInt() > 10) {
			System.out.println("Digite um número entre 0 e 10");
		} else {
			nota2 = scan.nextInt();
		}

		System.out.println("Escreva a Terceira Nota:");
		if (scan.nextInt() > 10) {
			System.out.println("Digite um número entre 0 e 10");
		} else {
			nota3 = scan.nextInt();
		}

		CalcularMedia(nota1, nota2, nota3);

	}

	public static void CalcularMedia(int nota1, int nota2, int nota3) {
		int media = (nota1 + nota2 + nota3) / 3;

		if (media >= 7 && media <= 10) {
			System.out.println("Aprovado");

		} else if (media >= 3 && media < 7) {
			System.out.println("Exame");

		} else if (media >= 0 && media < 3) {
			System.out.println("Reprovado");

		}

	}
}
