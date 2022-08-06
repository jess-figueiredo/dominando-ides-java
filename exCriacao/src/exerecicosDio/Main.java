package exerecicosDio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calculadora
		System.out.println("=====================");
		System.out.println("Exercício da calculadora");
		System.out.println("=====================");
		Calculadora.soma(8, 2);
		Calculadora.subtracao(8, 2);
		Calculadora.mult(8, 2);
		Calculadora.div(8, 2);
		System.out.println(" ");
		
		//Mensagem
		System.out.println("=====================");
		System.out.println("Exercício mensagem");
		System.out.println("=====================");
		Mensagem.obterMensagem(8);
		Mensagem.obterMensagem(15);
		Mensagem.obterMensagem(20);
		System.out.println(" ");

		
		//Emprestimos
		System.out.println("=====================");
		System.out.println("Exercicio emprestimos");
		System.out.println("=====================");
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(1000, 10);
	}

}
