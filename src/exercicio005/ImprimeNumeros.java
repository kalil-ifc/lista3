package exercicio005;
import java.util.Scanner;

public class ImprimeNumeros {

	public static void main(String[] args) {
		System.out.println("Estes sáo os números de 1 a 20");
		for (int i=1; i<=20; i++) {
			System.out.println(i+", ");
		}
		System.out.println("Deseja imprimi-los um ao lado do outro? \n\n\"S\" para SIM ou qualquer tecla para encerrar! ");
		System.out.print("Opçäo : ");
		Scanner entrada = new Scanner(System.in);
		String s = "s";
		String opcao = entrada.next();
		if (opcao.equalsIgnoreCase(s)) {
			for (int i=1; i<=20; i++) {
				System.out.print(i+", ");
			}
			System.out.println("\nFIM");
		} else {
			System.out.println("FIM");
		}
		
		entrada.close();
	}

}
