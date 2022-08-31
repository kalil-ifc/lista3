package exercicio023;
import java.util.Scanner;

public class CalculaMediaDeAlunosTurma {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);		
		int alunos=0;		
		System.out.println("Informe a quantidade de alunos");
		System.out.print("Alunos: ");
		alunos=entrada.nextInt();
		System.out.println("Com a quantidade de alunos informada necessário a abertura de no mínimo ");
		System.out.println(alunos/40 + " turmas de até 40 alunos");		
	

	entrada.close();
	}
}
