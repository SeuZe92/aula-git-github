import java.util.Scanner;

public class pratica12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a idade: ");
		int num1 = scan.nextInt();

		System.out.print("Digite o sexo (M / F): ");
		String num2 = scan.next();

		academia(num1, num2);
	}

	public static void academia(int idade, String sexo) {
		sexo = sexo.toUpperCase();
		if (sexo.equals("M") && idade <= 15 || sexo.equals("F") && idade <= 18) {
			System.out.println("mensalidade: 60,00");
		} else if (sexo.equals("M") && idade <= 18 && idade > 15) {
			System.out.println("mensalidade: 75,00");
		} else if (sexo.equals("M") && idade > 18 && idade <= 30 || sexo.equals("F") && idade > 18 && idade <= 25) {
			System.out.println("mensalidade: 90,00");
		} else if (sexo.equals("M") && idade > 30 && idade <= 40 || sexo.equals("F") && idade > 25 && idade <= 40) {
			System.out.println("mensalidade: 85,00");
		} else if (sexo.equals("M") && idade > 40 || sexo.equals("F") && idade > 40) {
			System.out.println("mensalidade: 80,00");
		}
	}
}
