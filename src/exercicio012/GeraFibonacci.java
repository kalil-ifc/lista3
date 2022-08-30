package exercicio012;

public class GeraFibonacci {

	public static void main(String[] args) {
		int num1=1, num2=1, num3=1;
		boolean ficar = true;
		
		do {
			if (num1==1 && num2==1) {
				System.out.print(num1 + " "+ num2+" ");
			}
			num3=num1+num2;
			num1=num2;
			num2=num3;
			
			System.out.print(num3+" ");
			
			// Um IF apenas para evitar loop infinito!
			if (num3>=1000) {
				ficar=false;
			}			
		} while (ficar);
	}

}
