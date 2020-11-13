package deitel.capitulo4.exercicio4_22;

import java.util.Scanner;

public abstract class Tabela {
	
	public static void tabelaFormatada() {
		
		int counter = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("N\t10*N\t100*N\t1000*N");
		while(counter <= 5) {
			System.out.println(counter + "\t" + counter*10 + "\t" + counter*100 + "\t" + counter*1000);
			counter++;
		}
		sc.close();
	}
	

}// end class
