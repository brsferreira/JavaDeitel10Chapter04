package deitel.capitulo4;

/*Determine o valor das vari�veis na instru��o product *= x++; depois que o c�lculo � realizado. Suponha que todas as vari�veis sejam 
do tipo int e inicialmente tenham o valor 5.*/

public class Exercicio4_07 {

	public static void main(String[] args) {

		int product = 5;
		int x = 5;
		
		product *= x++;
		
		System.out.println("Product = " + product + "\nx = " + x);
		
	}

}
