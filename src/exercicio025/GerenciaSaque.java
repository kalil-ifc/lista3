package exercicio025;

import java.util.Scanner;

public class GerenciaSaque {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double operacao, valorNotas, resto;
		int notas1=0, notas5=0, notas10=0, notas50=0, notas100=0;		
		System.out.println("Informe um valor entre R$ 10 e R$ 600 para o saque.");
		System.out.print("Valor: ");
		operacao = entrada.nextDouble();
		if (operacao >10 && operacao<=600) {
			notas100 = (int) operacao/100;
			valorNotas = (notas100*100);
			resto = operacao - valorNotas;			 			
			 System.out.println("Notas de R$ 100: "+ notas100);
			if (resto!=0) { 
				operacao = resto;
				notas50 = (int) operacao/50;
				valorNotas = (notas50*50);
				resto = operacao - valorNotas;
				System.out.println("Notas de R$ 50: "+ notas50);
				if (resto!=0) { 
					operacao = resto;
					notas10 = (int) operacao/10;					
					valorNotas = (notas10*10);
					resto = operacao - valorNotas;
					System.out.println("Notas de R$ 10: "+ notas10);
					if (resto!=0) { 
						operacao = resto;
						notas5 = (int) operacao/5;						
						valorNotas = (notas5*5);
						resto = operacao - valorNotas;
						System.out.println("Notas de R$ 5: "+ notas5);
						if (resto!=0) { 
							operacao = resto;
							notas1 = (int) operacao/1;														
							valorNotas = (notas1*1);
							resto = operacao - valorNotas;
							System.out.println("Notas de R$ 1: "+ notas1);
						}
					}
				}
			}
		} else {
			System.out.println("Valor mínimo de R$ 10 e máximo de R$ 600. \nPrograma encerrado!");
		}
	
	entrada.close();
	}

}
