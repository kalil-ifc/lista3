package exercicio016;
import java.util.Scanner;

public class CalculaMenorMaiorSoma {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num=0, maior=0, menor=1, soma=0;
		
		System.out.println("Informe N números. Use o 0 para parar");
		
		do {
			System.out.print("Número : ");
			num = entrada.nextInt();
			
			if (maior==0) {
				maior=num;
			} else if (num>maior){
				maior=num;
			}
			if (menor==1) {
				menor=num;
			} else if (num<menor && num!=0) {
				menor=num;
			}
			soma = soma+num;
		} while (num!=0);
		
		System.out.println("\n\nMAIOR = "+ maior);
		System.out.println("MENOR = "+ menor);
		System.out.println("SOMA = "+ soma);

		entrada.close();
	}

}
