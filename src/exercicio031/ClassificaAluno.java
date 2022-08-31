package exercicio031;

import java.util.Scanner;

public class ClassificaAluno {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeroAluno=0, numeroAlto=0, numeroBaixo=0;
		double altura=0, alto=0, baixo=0;		
		System.out.println("Informe numero e a altura de 10 alunos.");
		for (int i=1; i<=10; i++) {
			System.out.print("Número do aluno: ");
			numeroAluno=entrada.nextInt();
			System.out.print("Altura: ");
			altura=entrada.nextDouble();
				if (alto==0) {
					alto=altura;
					numeroAlto=numeroAluno;
				} else if (altura>alto) {
					alto=altura;
					numeroAlto=numeroAluno;
				}
				if (baixo==0) {
					baixo=alto;
					numeroBaixo=numeroAluno;
				} else if (altura<baixo) {
					baixo=altura;
					numeroBaixo=numeroAluno;
				}					
		}
		System.out.println("O aluno "+numeroAlto+" é o mais alto com "+alto+" cm");
		System.out.println("O aluno "+numeroBaixo+" é o mais baixo com "+baixo+" cm");
	
	entrada.close();
	}

}
