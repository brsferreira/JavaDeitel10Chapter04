package deitel.capitulo4.exercicio4_03;

//4.3 Escreva quatro instru��es Java diferentes que adicionam 1 � vari�vel de inteiro x.

public class Incremento {
	
	public static void main(String[] args) {
		
		int x = 0;
		
		//Instru��o 1:
		
		x = x + 1;
		System.out.printf("x = %d%n", x);
		
		//Instru��o 2:
		
		x += x;
		System.out.printf("x = %d%n", x);
		
		//Instru��o 3:
		
		++x;
		System.out.printf("x = %d%n", x);
		
		//Instru��o 4:
		
		x++;
		System.out.printf("x = %d%n", x);
	}
}//end class
