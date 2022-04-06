import java.util.Scanner;

public class pratica5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x, a = 0;

		System.out.println("Informe um número: ");
		x = scan.nextInt();

		int z[] = new int[3];
		z[1] = 2 * x + 2;
		z[2] = 3;
		z[3] = -x;
		if (z[1] < -2) {
			a++;
		}
		if (-2 <= z[2] && z[2] <= 3) {
			a++;
		}
		if (3 <= z[3]) {
			a++;
		}
		if (a == 3) {
			System.out.println("Aprovado");
		}
	}

}
