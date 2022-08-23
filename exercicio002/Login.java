package exercicio002;
import java.util.Scanner;

public class Login {
	public static void main (String[] args) {

		// Entradas
		Scanner entrada = new Scanner(System.in);
		boolean ficar= true;
		
		// Processos e saída
		do {
			System.out.println("Entre com o nome e senha do usuário:");
			System.out.print("Nome: ");
			String nome = entrada.next();
			System.out.println("Senha: ");
			String senha = entrada.next();
			if (nome.equals(senha)) {
				System.out.println("ERRO");
				ficar=true;
			} else {
				ficar=false;
			}
		}while(ficar);
		
		System.out.println("Fim");
		
		// Processos e saídas
		entrada.close();
	}

}
