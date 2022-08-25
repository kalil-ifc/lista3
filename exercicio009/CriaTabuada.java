package exercicio009;
import java.util.Scanner;

public class CriaTabuada {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe qual tabuada gostaria que fosse gerada. Ex.: \"5\"");
		System.out.print("Opção : ");
		int numTabuada = entrada.nextInt();
		
		for (int i=0; i<=10; i++) {			
			if (i!=0 && numTabuada>0) {
				System.out.println(numTabuada + " x " + i + " = " + (numTabuada*i));
			}else {
			System.out.println("Escolha um número positivo!");
		} 
		}
	}

}
