package exercicioReturn;

public class Main {
	public static void main(String[] args) {
		//retornos
		System.out.println("Exercicio return");
		
		double areaQuadrado = Quadrilatero.area(3);
		System.out.println("�rea do quadrado: "+areaQuadrado);
		
		double areaRetangulo = Quadrilatero.area(3, 2);
		System.out.println("�rea do retangulo: "+areaRetangulo);
		
		double areaTrapezio = Quadrilatero.area(7, 8, 9);
		System.out.println("�rea do trap�zio: "+areaTrapezio);
	}
}
