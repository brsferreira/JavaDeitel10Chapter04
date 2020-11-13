package deitel.capitulo4.exercicio4_03;

//4.3 Escreva quatro instruções Java diferentes que adicionam 1 à variável de inteiro x.

public class Incremento {
	
	public static void main(String[] args) {
		
		int x = 0;
		
		//Instrução 1:
		
		x = x + 1;
		System.out.printf("x = %d%n", x);
		
		//Instrução 2:
		
		x += x;
		System.out.printf("x = %d%n", x);
		
		//Instrução 3:
		
		++x;
		System.out.printf("x = %d%n", x);
		
		//Instrução 4:
		
		x++;
		System.out.printf("x = %d%n", x);
	}
}//end class
