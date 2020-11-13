package deitel.capitulo4;

import java.util.Scanner;

/*4.23 (Encontre os dois números maiores) Utilizando uma abordagem semelhante àquela do Exercício 4.21, encontre os dois maiores valores 
entre os 10 valores inseridos. [Observação: você só pode inserir cada número uma vez.]*/

public class Exercicio4_23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro valor: ");
		int valor1 = sc.nextInt();
		
		int largest;
		int counter = 1;
		while(counter <= 9) {//"9" porque o primeiro valor já foi inserido em "valor1".
			
			System.out.print("Informe o próximo valor: ");
			int number = sc.nextInt();//Recebe o segundo valor atual para comparacao.
			
			if(number > valor1)//Compara os valores "valor1" e "number".
				largest = number;
			else
				largest = valor1;
			
			valor1 = number;//"valor1" recebe o ultimo valor inserido "number" para a próxima comparacao.
			System.out.println("Maior valor = " + largest);
			++counter;
		}
		
		sc.close();

	}//main
}//class
