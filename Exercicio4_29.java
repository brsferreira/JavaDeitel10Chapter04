package deitel.capitulo4;

import java.util.Scanner;

/*4.29 (Quadrado de asteriscos) Escreva um aplicativo que solicita ao usuário que insira o tamanho do lado de um quadrado e, então, exibe um 
quadrado vazio desse tamanho com asteriscos. Seu programa deve trabalhar com quadrados de todos os comprimentos de lado possíveis 
entre 1 e 20.
*/
public class Exercicio4_29 {

	public static void main(String[] args) {
		
		System.out.printf("Insira o lado do quadrado entre 1 e 20 unidades de comprimento: ");
		Scanner sc = new Scanner(System.in);
		int lado = sc.nextInt();
		
		if(lado >= 1 || lado <= 20) {
			
			int i = 0;
			while(i  < lado) {
				if(i == 0 || i == (lado-1)) {
					int j = 0;
					while(j < lado) {
						System.out.print("*");
						j++;
					}
							
				}else {
					int j = 0; 
					while(j < lado) {
						if(j == 0 || j == (lado -1)) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
					j++;	
					}
				}
				
			System.out.println();	
			++i;
			}
			
		}//if validacao
	sc.close();
	}//main
}//class
