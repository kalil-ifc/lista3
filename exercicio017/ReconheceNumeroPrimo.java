package exercicio017;
import java.util.Scanner;

public class ReconheceNumeroPrimo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean primo = true;
		System.out.println("Informe um número para saber se é primo.");
		System.out.print("Número: ");
		int num = entrada.nextInt();
		
		for (int i=2; i<num; i++) {
			if (num%i==0) {
				primo=false;
			} else {
				primo=true;
			}
		}
		if (primo) {
			System.out.println("É primo");
		} else {
			System.out.println("Náo é primo");
		}		
		entrada.close();
	}

}
