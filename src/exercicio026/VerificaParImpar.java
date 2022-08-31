package exercicio026;

import java.util.Scanner;

public class VerificaParImpar {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numero=0;
		System.out.println("Informe um número inteiro.");
		System.out.print("Número: ");
		numero = entrada.nextInt();
		if (numero%2 ==0) { 
			System.out.println("O número é par");
		} else { 
			System.out.println("O número é impar");
		}
	
	entrada.close();
	}

}
