package exerecicosDio;

public class Calculadora {
	public static void soma(double numero1, double numero2) {
		double resultado = numero1 + numero2;
		System.out.println("A soma de " + numero1 + " mais " + numero2 + " � "+ resultado);
		
	}
	public static void subtracao(double numero1, double numero2) {
		double resultado = numero1 - numero2;
		System.out.println("A subtra��o de "+numero1+" menos " + numero2 +" � " + resultado);
	}
	public static void mult(double num1, double num2) {
		double resultado = num1 * num2;
		System.out.println("A multiplica��o de "+num1+" vezes "+num2+" � " +resultado);
	}
	public static void div (double num1, double num2) {
		double result = num1/num2;
		System.out.println("A divis�o entre "+num1+" e "+num2+" � "+result);
	}
}
