package exercicio025;

import java.util.Scanner;

public class CriaListaPrecos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);		
		double valor=0;
		String opcao="", tabela="t";
		System.out.println("Digite \"t\" para gerar a tabela de preço");
		System.out.print("Opção: ");
		opcao=entrada.next();
		if (opcao.equals(tabela)) {
			System.out.println("\nLoja Quase Dois - Tabela de preços");			
			for (int i=1; i<=50; i++) {
				System.out.println(i+"- "+i*1.99);
			}
		} else { 
			System.out.println("\nPrograma encerrado.");
		}
	
	entrada.close();
	}

}
