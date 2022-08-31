package exercicio029;

import java.util.Scanner;

public class GerenciaPostoCombustivel {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		String opcao="", alcool="A", gasolina="G";
		int litros;
		double precoA=1.9, precoG=2.5;
		System.out.println("Informe o tipo de combustível.");
		System.out.println("\"A\" - para Álcool ou \n\"G\" - para Gasolina");
		System.out.print("Opcao: ");
		opcao = entrada.next();
		System.out.println("\nAgora informe a quantidade de litros.");
		System.out.print("Quantidade: ");
		litros = entrada.nextInt();
		if (opcao.equals(alcool)) { 
			if (litros<20) {				
				precoA=litros*(precoA-precoA*0.03);
			} else if (litros>20) { 
				precoA=litros*(precoA-precoA*0.05);
			}
		}
		if (opcao.equals(gasolina)) { 
			if (litros<20) { 
				precoG=litros*(precoG-precoG*0.04);
			} else if (litros>20) { 
				precoG=litros*(precoG-precoG*0.06);
			}
		}
		
		// relatório
		if (opcao.equals(alcool)) { 
			System.out.println("\nA-álcool a pagar: R$ "+String.format("%.2f", precoA));
		}
		if (opcao.equals(gasolina)) { 
			System.out.println("\nG-gasolina a pagar: R$ "+String.format("%.2f", precoG));
		}
	
	entrada.close();
	}

}
