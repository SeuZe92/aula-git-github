import java.util.Scanner;

public class pratica11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite a quantidade de dias: ");
		int num1 = scan.nextInt();

		diaria(num1);
	}

	public static void diaria(int num1) {
		if (num1 < 15) {
			System.out.println(500 + 15 * num1);
		} else if (num1 == 15) {
			System.out.println(500 + 10 * num1);
		} else if (num1 > 15) {
			System.out.println(500 + 5 * num1);
		}
	}
}
