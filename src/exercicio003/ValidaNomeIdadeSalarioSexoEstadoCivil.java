package exercicio003;
import java.util.Scanner;

public class ValidaNomeIdadeSalarioSexoEstadoCivil {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		boolean ficar = true;
		String m="m", f="f", s="s", c="c", v="v", d="d";
		
		do {
			System.out.println("Entre com seu nome, idade, salário, sexo e Estado Civil");
			System.out.print("Nome (com mais de 3 caracteres): ");
			String nome = entrada.next();
			int tamanho = nome.length();
			System.out.print("Idade: ");
			int idade = entrada.nextInt();
			System.out.println("Salário (maior que zero): ");
			float salario = entrada.nextFloat();			
			System.out.print("Sexo (m ou f): ");
			String sexo = entrada.next();
			System.out.print("Estado Civil (s, c, v, d) : ");
			String estadoCivil = entrada.next();
			if (
				tamanho>3 && 
				idade>0 && idade<150 &&
				salario>0 &&
				(sexo.equals(m) || sexo.equals(f)) &&
				(estadoCivil.equals(s) || estadoCivil.equals(c) || estadoCivil.equals(v) || estadoCivil.equals(d))
					) {
				ficar = false;
			} else {
				System.out.println("Erro! Tente novamente!");
			}
		} while (ficar);
		
		System.out.println("\nFIM");
		
		entrada.close();
	}
}
