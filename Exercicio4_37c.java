package deitel.capitulo4;

public class Exercicio4_37c {

	public static void main(String[] args) {
		
		System.out.println("c) Escreva um aplicativo que computa o valor de e  x  utilizando a fórmula a seguir. Permita ao usuário inserir o número de termos a calcular.");
		System.out.println("Fórmula: e^x = 1 + x/1! + x²/2! + x³/3! + ...");

		int x = 0;
		int nTermos = 50;
		long fat = 0 ;
		double e = 0;
		int i  = 0;
		while(i <= nTermos) {
			
			if(x == 0) {
				fat = 1;
				e   = 1;
				break;
			}else if(i == 0) {
				fat = 1;
				e = 1;
				++i;
			}else {
				int p = (int) Math.pow(x, i);
				fat = fat*i;
				e = e + ((p)/(double)fat);
				++i;
			}
			
		}
		System.out.println("e = " + e);
		System.out.println("e definido pelo Java = " + Math.pow(Math.E, x));
		
		// No Java, o valor de E é uma constante pre-definida (public static final double E = 2.718281828459045).

	}//main

}//class
