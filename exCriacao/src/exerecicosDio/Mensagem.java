package exerecicosDio;

public class Mensagem {

	public static void obterMensagem(int hora) {
		if (hora >= 5 && hora <= 12) {
			System.out.println("Bom dia!");
		}else if(hora <=17) {
			System.out.println("Boa tarde!");
		}else {
			System.out.println("Boa noite!");
		}
	}
}
