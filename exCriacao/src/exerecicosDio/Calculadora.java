package exerecicosDio;

public class Calculadora {
	public static void soma(double numero1, double numero2) {
		double resultado = numero1 + numero2;
		System.out.println("A soma de " + numero1 + " mais " + numero2 + " é "+ resultado);
		
	}
	public static void subtracao(double numero1, double numero2) {
		double resultado = numero1 - numero2;
		System.out.println("A subtração de "+numero1+" menos " + numero2 +" é " + resultado);
	}
	public static void mult(double num1, double num2) {
		double resultado = num1 * num2;
		System.out.println("A multiplicação de "+num1+" vezes "+num2+" é " +resultado);
	}
	public static void div (double num1, double num2) {
		double result = num1/num2;
		System.out.println("A divisão entre "+num1+" e "+num2+" é "+result);
	}
}
