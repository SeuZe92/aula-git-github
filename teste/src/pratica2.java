import java.util.Scanner;

public class pratica2 {

	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("Digite os lados do tri�ngulo: ");
		int lado1, lado2, lado3;
		lado1 = input.nextInt();
		lado2 = input.nextInt();
		lado3 = input.nextInt();
		if (lado1 == lado2 && lado2 == lado3)
			System.out.println("Equil�tero");
		else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
			System.out.println("Is�sceles");
		else
			System.out.println("Escaleno");
	}

}
