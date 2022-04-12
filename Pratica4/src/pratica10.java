import java.util.Scanner;

public class pratica10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o numero: ");
		float num1 = scan.nextFloat();

		System.out.print("Digite o numero: ");
		float num2 = scan.nextFloat();

		System.out.println("1 - Somar os dois n�meros\n" + "2 - Multiplicar os dois n�meros\n"
				+ "3 - Subtrair o n�mero maior pelo n�mero menor\n" + "4 - Dividir o primeiro n�mero pelo segundo");
		System.out.print("Selecione a op��o: ");
		int num3 = scan.nextInt();

		menu(num1, num2, num3);
	}

	public static void menu(float num1, float num2, int num3) {
		switch (num3) {
		case 1: {
			System.out.println(num1 + num2);
			break;
		}
		case 2: {
			System.out.println(num1 * num2);
			break;
		}
		case 3: {
			if (num1 > num2) {
				System.out.println(num1 - num2);
			} else if (num1 < num2) {
				System.out.println(num2 - num1);
			} else {
				System.out.println(0);
			}
			break;
		}
		case 4: {
			if (num2 == 0 ) {
				System.out.println("n�o � possivel dividir por 0");
			} else {
				System.out.println(num1/num2);
			}
			break;
		}
		}
	}
}
