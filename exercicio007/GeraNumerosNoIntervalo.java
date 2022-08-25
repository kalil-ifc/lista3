package exercicio007;
import java.util.Scanner;

public class GeraNumerosNoIntervalo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com dois números inteiros");
		System.out.print("Primeiro número: ");
		int num1 = entrada.nextInt();
		System.out.print("Segundo número: ");
		int num2 = entrada.nextInt();
		
		if (num1>num2) {
			int aux = num1;
			num1 = num2;
			num2 = aux;
		}
		
		System.out.println("Os números do intervalos entre " + num1 +" e "+ num2 + " sáo : ");
		
		for (int i=num1; i<(num2-1); i++) {
			System.out.print(i+1+" ");
		}

	entrada.close();
	}

}
