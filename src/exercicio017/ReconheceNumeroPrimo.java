package exercicio017;
import java.util.Scanner;

public class ReconheceNumeroPrimo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um número para saber se é primo.");
		System.out.print("Número: ");
		int num = entrada.nextInt();
		boolean primo = true, ficar=true;
		int x=2, z=0;
		
		while (ficar) {
			z=num%x;
			if (z==0 && x!=num) {
				primo=false; 
				ficar=false;
			} else {
				x++; 
			}
			if (x>num) {
				ficar=false;
			}
		}
		if (primo)
			System.out.println("É PRIMO");
		else 
			System.out.println("NÁO É PRIMO");
		
		entrada.close();
	}

}
