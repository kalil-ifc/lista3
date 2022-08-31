package exercicio011;
import java.util.Scanner;

public class GerenciaNumeroParImpar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int impar=0, par=0;
		
		System.out.println("Entre com 10 números inteiros.");
		
		for (int i=1; i<=10; i++) {
			System.out.print("Numero "+i+" : ");
			int num = entrada.nextInt();
			if (num%2==1) {
				impar++;
			} else {
				par++;
			}
		}
		System.out.println("\nIMPARES : "+impar);
		System.out.println("\nPARES : "+par);
	
	entrada.close();
	}

}
