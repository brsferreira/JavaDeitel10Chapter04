package deitel.capitulo4;

import java.util.Scanner;

/*4.30 (Palíndromos) Um palíndromo é uma sequência de caracteres que é lida da esquerda para a direita ou da direita para a esquerda. Por 
exemplo, cada um dos seguintes inteiros de cinco dígitos é um palíndromo: 12321, 55555, 45554 e 11611. Escreva um aplicativo que lê em 
um inteiro de cinco dígitos e determina se ele é ou não um palíndromo. Se o número não for de cinco dígitos, exiba uma mensagem de 
erro e permita que o usuário insira um novo valor.*/

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
		
		System.out.printf("Numero de entrada: %d%nNúmero invertido : %d%n", num, num_invertido);
		
		if(num == num_invertido)
			System.out.println("O número de entrada é palíndromo(Capicua).");
		else
			System.out.println("O número de entrada não é palíndromo(Capicua).");
		input.close();
		
	}//end main
}//end class
