package exControleFlux;
//Exercício sobre controle de fluxo e boas práticas
public class Main {
	public static void main(String[] args) {
		
		ifFlecha();
		ifSemFlecha();
		ifFerias();
		ifMenor();
		switchSemana();
	}
	
	//evitar flechar
	private static void ifFlecha() {
		int mes = 0;
		if(mes == 1) {
			System.out.println("Janeiro");
		}else {
			if(mes == 2) {
				System.out.println("Fevereiro");
			}else {
				if(mes == 3) {
					System.out.println("Março");
				}else {
					if(mes == 4) {
						System.out.println("Abril");
					}else {
						if(mes == 5) {
							System.out.println("Maio");
						}else {
							if(mes == 6) {
								System.out.println("Junho");
							}else {
								if(mes == 7) {
									System.out.println("Julho");
								}else {
									if(mes == 8) {
										System.out.println("Agosto");
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	private static void ifSemFlecha() {
		int mes = 8;
		if(mes == 1) {
			System.out.println("Janeiro");
		}else if(mes == 2) {
			System.out.println("Fevereiro");
		}else if(mes == 3) {
			System.out.println("Março");
		}else if(mes == 4) {
			System.out.println("Abril");
		}else if(mes == 5) {
			System.out.println("Maio");
		}else if(mes == 6) {
			System.out.println("Junho");
		}else if(mes == 7) {
			System.out.println("Julho");
		}else if(mes == 8) {
			System.out.println("Agosto");
		}
	}

	private static void ifFerias() {
		String mes = "julho";
		if (mes == "julho" || mes == "dezembro" || mes == "janeiro") {
			System.out.println("Férias");
		}
	}

	private static void ifMenor() {
		
		double salarioMensal = 11893.58d;
		double mediaSalario = 10500d;
		
		int qntdDependentes = 4;
		int mediaDependentes = 2;
		
		if ((salarioMensal < mediaSalario) && (qntdDependentes >=mediaDependentes)) {
			System.out.println("Funcionário deve receber auxílio.");
		}
		
		boolean salarioBaixo = salarioMensal < mediaSalario;
		boolean muitosDependentes = qntdDependentes >= mediaDependentes;
		
		boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
		if (recebeAuxilio) {
			System.out.println("Funcionário deve receber auxílio");
		}else {
			System.out.println("Funcionário não deve receber auxílio");

		}
	}

	private static void switchSemana() {
		String dia = "";
		switch(dia) {
		case "Segunda":
			System.out.println(2);
			break;
		case "Terça":
			System.out.println(3);
			break;
		case "Quarta":
			System.out.println(4);
			break;
		case "Quinta":
			System.out.println(5);
			break;
		case "Sexta":
			System.out.println(6);
			break;
		case "Sábado":
			System.out.println(7);
			break;
		case "Domingo":
			System.out.println(1);
			break;
		default:
			System.out.println("Dia inválido");
			break;
		}
	}

}
