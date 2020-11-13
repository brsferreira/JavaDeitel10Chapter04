package deitel.capitulo4.exercicio4_06;

public class Exercicio4_6 {

	public static void main(String[] args) {

		int x = 1;
		int soma = 0;
		
		while(x < 11) {
			
			soma += x++;
		}
		
		System.out.println("Soma = " + soma);
		
	}//end main
}//end class
