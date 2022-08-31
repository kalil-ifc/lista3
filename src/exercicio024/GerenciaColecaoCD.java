package exercicio024;

import java.util.Scanner;

public class GerenciaColecaoCD {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);		
		double valor=0, soma=0;
		boolean ficarNoLoop=true;
		int discos=0;
		String opcao="", sim="s", nao="n";
		while (ficarNoLoop) {
		System.out.println("Informe o valor gasto pelo CD");
		System.out.print("Valor: ");
		valor=entrada.nextDouble();
		soma = soma+valor;
		discos++;
		System.out.println("Deseja cadastrar outro CD?");
		System.out.print("\"s\" para siim ou \"n\" para não: ");
		opcao = entrada.next();
		if (opcao.equals(nao)) {
			ficarNoLoop=false;
		}
		System.out.println("\nValor total gasto é R$"+soma);
		System.out.println("O valor médio por CD é R$"+(soma/discos));
		}		
	
	entrada.close();
	}

}
