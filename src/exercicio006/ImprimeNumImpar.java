package exercicio006;

public class ImprimeNumImpar {
	public static void main (String []args) {
		
		System.out.println("Estes sáo os núeros impares entre 1 e 50");
		for (int i=0; i<50; i++) {
			if (i%2==1 && i<=45) {
				System.out.print(i+", ");
			} if (i==47) {
				System.out.print(i+" e ");
			} if (i==49) {
				System.out.print(i+".  ");
			}
		}
		System.out.println("\n\nFIM ");
	}

}
