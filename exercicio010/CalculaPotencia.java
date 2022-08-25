package exercicio010;
import java.util.Scanner;

public class CalculaPotencia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com um número para base e outro para expoente\n");
		System.out.print("Base : ");
		int base = entrada.nextInt();
		System.out.print("Expoente : ");
		int expoente = entrada.nextInt();
		int resultado = 1;
		
		for (int i=0; i<expoente ; i++ ) {
			resultado = resultado*base;
		}		
		System.out.println("\n\nRESULTADO = "+ resultado);
		
		entrada.close();
	}

}
