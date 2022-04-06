import java.util.Scanner;

public class pratica4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe seu peso(kg):");
		double peso = scan.nextDouble();

		System.out.println("Informe sua altura(m):");
		double altura = scan.nextDouble();

		CalcularIMC(peso, altura);
	}

	public static void CalcularIMC(double peso, double altura) {

		double imc = peso / Math.sqrt(altura);

		if (imc > 40) {
			System.out.println("Obesidade Morbida");
		} else if (imc > 30 && imc <= 40) {
			System.out.println("Obesidade");
		} else if (imc > 25 && imc <= 30) {
			System.out.println("Sobrepeso");

		} else if (imc > 20 && imc <= 25) {
			System.out.println("Normal");

		} else {
			System.out.println("Abaixo do peso");
		}
	}
}
