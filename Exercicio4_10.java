package deitel.capitulo4;

/*4.10 Compare e contraste a instru��o de sele��o �nica if e a instru��o de repeti��o while. Qual � a semelhan�a dessas duas instru��es? Qual 
� a diferen�a?*/

//  Os programas utilizam instru��es de sele��o para escolher entre cursos alternativos de a��es.
//  A instru��o if � uma instru��o de controle de uma �nica entrada e uma �nica sa�da.

//  A instru��o de repeti��o while permite especificar que um programa deve repetir uma a��o enquanto alguma condi��o permanecer verdadeira.

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
