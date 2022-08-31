package exercicio026;

import java.util.Scanner;

public class GeraTabelaPreco {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);		
		float valor=(float)0.18, aux=0;
		String opcao="", tabela="t";
		System.out.println("Digite \"t\" para gerar a tabela de preço");
		System.out.print("Opção: ");
		opcao=entrada.next();
		if (opcao.equals(tabela)) {
			System.out.println("\nPanificadora Pão de Ontem - Tabela de preços");			
			for (int i=1; i<=50; i++) {
				aux=i*valor;
				//System.out.print("\n"+i+"- "+aux);
				System.out.printf ("\n %d - %.2f", i, aux);
			}
		} else { 
			System.out.println("\nPrograma encerrado.");
		}
	
	entrada.close();
	}

}
