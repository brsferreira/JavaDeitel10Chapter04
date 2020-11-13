package deitel.capitulo4;

/*Determine o valor das variáveis na instrução product *= x++; depois que o cálculo é realizado. Suponha que todas as variáveis sejam 
do tipo int e inicialmente tenham o valor 5.*/

public class Exercicio4_07 {

	public static void main(String[] args) {

		int product = 5;
		int x = 5;
		
		product *= x++;
		
		System.out.println("Product = " + product + "\nx = " + x);
		
	}

}
