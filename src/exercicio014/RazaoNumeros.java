package exercicio014;

public class RazaoNumeros {

	public static void main(String[] args) {
		int impar=1, natural=1, i=50; // indice "i" para indicar a quantidade de iterações e evitar loop infinito. 
		
		System.out.print("S = ");
		
		do {
			
			System.out.print(natural+"/"+impar+" + ");
			natural=natural+1;
			impar=impar+2;
			i--;
			
		} while (i!=0);

	}

}
