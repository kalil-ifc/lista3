package exercicio020;
import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double soma=0, nota=0;
		int limite=0;
		System.out.println("Informe o número de notas que deseja informar. Ex.: 4");
		System.out.print("Número: ");
		limite=entrada.nextInt();				
		for (int i=1; i<=limite; i++) {
			System.out.print("Nota["+i+"]: ");
			nota=entrada.nextDouble();
			soma=soma+nota;
		}
		System.out.println("A média é "+(soma/limite));
	
	entrada.close();
	}

}
