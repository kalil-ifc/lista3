package exercicio004;
import java.util.Scanner;

public class CalculaCrescimentoPopulacional {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double paisA=80000, paisB=200000, A=1.03, B=1.015;
		boolean ficar1=true, ficar=true;
		String s="s", n="n";
		int x=0;
		
		do {
			for (int i=0; paisB>paisA; i++ ) {
				paisA=paisA*A;
				paisB=paisB*B;
				x=i;
			}
			System.out.println("O tempo para um país de 80 mil hab. passar outro de 200 mil hab com taxas de 3 e 1.5%, respectivamente, é: "+x+" anos");
			System.out.println("Agora é a sua vez! Informe os dados de duas novas populações e suas taxas de crescimento");
			System.out.print ("População A : ");
			paisA = entrada.nextDouble();
			System.out.print ("Taxa de A : ");
			A = entrada.nextDouble();
			System.out.print ("População B : ");
			paisB = entrada.nextDouble();
			System.out.print ("Taxa de B :");
			B = entrada.nextDouble();
			
			if (paisA>0 && paisB>0 && A>0 && B>0 && paisA<paisB && B<A) {
				for (int i=0; paisB>paisA; i++ ) {
					paisA=paisA*A;
					paisB=paisB*B;
					x=i;
				}
				System.out.println("Tempo: "+x+" anos");
				do {
					System.out.println("Deseja repetir a operação?");
					String opcao = entrada.next();
					if (opcao.equalsIgnoreCase(s)) {
						ficar1=false;
					} else if (opcao.equalsIgnoreCase(n)) {
						ficar1=false;
						ficar=false;
					} else {
						System.out.println("ERRO! Informe s ou n, por favor!");
						ficar1=true;
					}
				} while (ficar1);
			} else {
				System.out.println("\nERRO! Os dados informados precisam ser números positivos e a População A deve ser menor que a B\n\n");
			}
		} while (ficar);
		
		System.out.println("\nFIM");
		
		entrada.close();
	}

}
