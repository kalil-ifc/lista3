package exercicio034;

import java.util.Scanner;

public class IntervaloDeNumero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero=0, faixa0a25=0, faixa26a50=0, faixa51a75=0, faixa76a100=0;
		boolean ficarNoLoop=true;
		System.out.println("Informe um número inteiro positivo para o relatório ou um negativo para sair");
		while (ficarNoLoop) {
			System.out.print("Número: ");
			numero=entrada.nextInt();
			if (numero>0 && numero<26) {
				faixa0a25++;
			} else if (numero>26 && numero<51) {
				faixa26a50++;
			} else if (numero>51 && numero<76) {
				faixa51a75++;				
			} else if (numero>76 && numero<101) {
				faixa76a100++;
			} else if (numero<0) {
				ficarNoLoop=false;
			} else {
				System.out.println("O sistema não aceita número acima de 100");
			}
		}
		// relatorio
		System.out.println("\nRelatório dos números conforme os intervalos previstos");
		System.out.println("Faixa de 0 a 25....: "+faixa0a25);
		System.out.println("Faixa de 26 a 50...: "+faixa26a50);
		System.out.println("Faixa de 51 a 75...: "+faixa51a75);
		System.out.println("Faixa de 76 a 100..: "+faixa76a100);		
	
	
	entrada.close();
	}

}
