import java.util.Scanner;

public class pratica6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a, b, c, z = 0;

		System.out.println("Informe os três lados de um triangulo: ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		double x = Math.abs(b - c);
		if (x < a && a < b + c) {
			z++;
		}
		x = Math.abs(a - c);
		if (x < b && b < a + c) {
			z++;
		}
		x = Math.abs(a - b);
		if (x < c && c < a + b) {
			z++;
		}
		if (z == 3) {
			System.out
					.println("os três valores informados podem ser os comprimentos dos lados de um\r\n" + "triângulo.");
		}
	}

}
