package deitel.capitulo4;

/*4.10 Compare e contraste a instrução de seleção única if e a instrução de repetição while. Qual é a semelhança dessas duas instruções? Qual 
é a diferença?*/

//  Os programas utilizam instruções de seleção para escolher entre cursos alternativos de ações.
//  A instrução if é uma instrução de controle de uma única entrada e uma única saída.

//  A instrução de repetição while permite especificar que um programa deve repetir uma ação enquanto alguma condição permanecer verdadeira.

public class Exercicio4_10 {

	public static void main(String[] args) {
		
		int x = 0;
		
		if(x <= 10) {
			System.out.printf("x = %d%n", x);
		}
		
		while(x <= 10) {
			System.out.printf("x = %d, ", x);
			++x;
		}

	}//end main
}//end class
