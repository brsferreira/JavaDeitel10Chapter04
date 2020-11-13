package deitel.capitulo4;

import java.util.Scanner;

/*4.30 (Pal�ndromos) Um pal�ndromo � uma sequ�ncia de caracteres que � lida da esquerda para a direita ou da direita para a esquerda. Por 
exemplo, cada um dos seguintes inteiros de cinco d�gitos � um pal�ndromo: 12321, 55555, 45554 e 11611. Escreva um aplicativo que l� em 
um inteiro de cinco d�gitos e determina se ele � ou n�o um pal�ndromo. Se o n�mero n�o for de cinco d�gitos, exiba uma mensagem de 
erro e permita que o usu�rio insira um novo valor.*/

public class Exercicio4_30 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Informe o valor de entrada: ");
		int num = input.nextInt();
		
		int flag = num; 
		String inum = "";
		while(flag > 0) {
		int d = 10;
		int digito = (flag % d);
		inum += Integer.toString(digito);
		flag /= d;
		}
		
		int num_invertido = Integer.parseInt(inum);
		
		System.out.printf("Numero de entrada: %d%nN�mero invertido : %d%n", num, num_invertido);
		
		if(num == num_invertido)
			System.out.println("O n�mero de entrada � pal�ndromo(Capicua).");
		else
			System.out.println("O n�mero de entrada n�o � pal�ndromo(Capicua).");
		input.close();
		
	}//end main
}//end class
