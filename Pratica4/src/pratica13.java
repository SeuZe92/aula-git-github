import java.util.Scanner;

public class pratica13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o tipo de apartamento (simples / duplo): ");
		String num1 = scan.next();

		System.out.print("Digite a quantidade de dias: ");
		int num2 = scan.nextInt();

		apartamento(num1, num2);
	}

	public static void apartamento(String ap, int qtd) {
		ap = ap.toLowerCase();
		if (ap.equals("simples") && qtd < 10 || ap.equals("duplo") && qtd > 15) {
			System.out.println("total: " + qtd * 100);
		} else if (ap.equals("simples") && qtd >= 10 && qtd <= 15) {
			System.out.println("total: " + qtd * 90);
		} else if (ap.equals("simples") && qtd > 15) {
			System.out.println("total: " + qtd * 90);
		} else if (ap.equals("duplo") && qtd < 10) {
			System.out.println("total: " + qtd * 140);
		} else if (ap.equals("duplo") && qtd >= 10 && qtd <= 15) {
			System.out.println("total: " + qtd * 120);
		}
	}
}
