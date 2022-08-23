package exercicio001;
import java.util.Scanner;

public class ValidaNota {

	public static void main(String[] args) {
		// Entradas
		Scanner entrada = new Scanner(System.in);
		int nota=0;
		
		// Processos e saídas
		do {
			System.out.println("Informe uma nota de 0 a 10");
			System.out.print("Nota : ");
			nota = entrada.nextInt();
			if (nota>=10 || nota<0) {
				System.out.println("Valor incorreto!");
			}
		}while(nota>=10 || nota<0);
		
		entrada.close();
		System.out.println("\nFim");
		
	}

}
