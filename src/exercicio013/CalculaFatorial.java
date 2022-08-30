package exercicio013;
import java.util.Scanner;

public class CalculaFatorial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Forneça um número inteiro para o cálculo do fatorial.");
		System.out.print("Número : ");
		int num = entrada.nextInt();
		int fat=0, i = num;
		i--;
		
		do {
			if (num!=0) {
				fat = num*(i);
				num = fat;
				i--;
			}
		} while (i!=0);
		
		System.out.println("\n\nFATORIAL = " + fat);
		
		entrada.close();
	}

}
