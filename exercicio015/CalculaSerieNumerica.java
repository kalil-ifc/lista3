package exercicio015;

public class CalculaSerieNumerica {

	public static void main(String[] args) {
		int num1=37, num2=38, num3=1;
		int acumula=0;
		
		System.out.print("S = ");
		
		do {
			
			System.out.print("("+num1+"*"+num2+")/"+num3+" + ");
			
			int res = (num1*num2)/num3;
			acumula = res + acumula;
			
			num1--;
			num2--;
			num3++;
			
		} while (num1!=0);
			
		System.out.println("\n\nRESULTADO = "+acumula);
	}

}
