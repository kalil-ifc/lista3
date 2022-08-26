package exercicio018;
import java.util.Scanner;

public class DivisibilidadeDeNumero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cont = 0;
		System.out.println("Informe um número para saber se é primo.");
		System.out.print("Número: ");
		int num = entrada.nextInt();
		
		for (int i=2; i<=(num/2); i++) {
			
			if ( num % i == 0) {
				cont=cont+1; 
				System.out.println(cont);
			} 
		}
		if (cont>1) {
			System.out.print("O número não é primo, pois é divisível por: ");
			for (int j=2; j<num; j++) {
				if (num % j == 0) {
				System.out.print(j +" , ");
				}
			}
			System.out.println(" 1 e por si mesmo.");
		} else  {
			System.out.println("O número é primo!");
		}

	entrada.close();
	}
}
