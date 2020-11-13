package deitel.capitulo4;


/*4.37 (Fatorial) O fatorial de um inteiro não negativo n é escrito como n! (pronuncia-se “n fatorial”) e é definido como segue:
n! = n · (n – 1) ·  (n – 2) ·  ... · 1   (para valores de n maiores ou iguais a 1)
e
n! = 1   (para n = 0)
Por exemplo, 5! = 5 · 4 · 3 · 2 · 1, o que dá 120.*/

public class Exercicio4_37 {

	public static void main(String[] args) {
		
//		System.out.println("a) Escreva um aplicativo que lê um inteiro não negativo, calcula e imprime seu fatorial.");
//		Scanner sc = new Scanner(System.in);
//		System.out.printf("digite o valor de n para o calculo do fatorial: ");
//		int input = sc.nextInt();
//
//		int n = input;
//		int fat = 1;
//		
//		if(n != 0) {
//			while(n != 0){
//				fat = fat*n;	
//				--n;
//			}
//		}else
//			fat = 1;
//		System.out.printf("%n%d! = %d%n", input, fat );
//		System.out.println("------------------------------------------------------------------------------------------");
		
		System.out.println("b) Escreva um aplicativo que estima o valor da constante matemática e utilizando a fórmula a seguir. Permita ao usuário inserir o número de termos a calcular.");
		System.out.println("Fórmula: e = 1 + 1/n! + 1/2! + 1/3! + ...");

		int nTermos = 50;
		long fat = 0 ;
		double e = 0;
		int i  = 0;
		while(i <= nTermos) {
			
			if(i != 0) {
				fat = fat*i;
			}else
				fat = 1;
			e = e + (1/ (double)fat);
			++i;
			
		}
		System.out.println("e = " + e);
		System.out.println("e definido pelo Java = " + Math.E);
		
		
		
		
		
		
		
	}//end main
}//end class
