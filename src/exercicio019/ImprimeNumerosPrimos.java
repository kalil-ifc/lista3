package exercicio019;
import java.util.Scanner;

public class ImprimeNumerosPrimos {

	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		int numero=0, contador=0;
		System.out.println("Informe um número inteiro");
		System.out.print("Número: ");
		numero=entrada.nextInt();
		
		System.out.print("Este número é divisível por: ");
		for (int i=2; i<numero; i++) {
			if (numero % i==0) { 
				System.out.print(i+", ");
				contador++;
			}				
		}
			System.out.println("1 e por si mesmo.");
			System.out.println("Total de divisões: "+(contador+2));
	
		entrada.close();
	}
}
