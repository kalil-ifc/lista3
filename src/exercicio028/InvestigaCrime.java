package exercicio028;

import java.util.Scanner;

public class InvestigaCrime {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		String sim="S", nao="N";
		int contador=0, naoRespondeu=0;
		String [] opcao = new String[6];
		String [] pergunta = new String [6];
		pergunta [1] = "Telefonou para a vítima?";
		pergunta [2] = "Esteve no local do crime?";
		pergunta [3] = "Mora perto da vítima?";
		pergunta [4] = "Devia para a vítima?";
		pergunta [5] = "Já trabalhou para a vítima?";
		
		System.out.println("Responda a cinco perguntas com \"S\" para Sim ou \"N\" para Não. ");
		
		// lendo as respostas
		for (int i=1; i<6; i++) {
			System.out.println("Pergunta "+i+": "+pergunta[i]);
			System.out.print("Resposta: ");
			opcao[i] = entrada.next();			
			if (opcao[i].equals(sim)) { 
				contador++;
			} else if (opcao[i].equals(nao)) {			
			} else { 
				System.out.println("Você deixou de responder uma pergunta. Reinicie");
				i=6; naoRespondeu=1;
			}
		}
		
		// relatório
		if (contador==2) { 
			System.out.println("\"Suspeita\"");
		} else if (contador==3 || contador==4) { 
			System.out.println("\"Cumplice\"");
		} else if (contador==5) { 
			System.out.println("Assassino");
		} else if (contador==0 && naoRespondeu==0) { 
			System.out.println("Inocente");
		}
	
	entrada.close();
	}

}
