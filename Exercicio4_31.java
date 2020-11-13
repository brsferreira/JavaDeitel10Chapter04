package deitel.capitulo4;


/*4.31 (Imprimindo o equivalente decimal de um número binário) Escreva um aplicativo que insere um número inteiro que contém so-
mente 0s e 1s (isto é, um número inteiro binário) e imprime seu equivalente decimal. [Dica: utilize os operadores de resto e divisão para 
pegar os dígitos do número binário um de cada vez da direita para a esquerda. No sistema de números decimais, o dígito mais à direita 
tem um valor posicional de 1 e o próximo dígito à esquerda um valor posicional de 10, depois 100, depois 1.000 e assim por diante. O 
número decimal 234 pode ser interpretado como 4 * 1 + 3 * 10 + 2 * 100. No sistema de número binário, o dígito mais à direita tem um 
valor posicional de 1, o próximo dígito à esquerda um valor posicional de 2, depois 4, depois 8 e assim por diante. O equivalente decimal 
do binário 1.101 é 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8 ou 1 + 0 + 4 + 8 ou 13.]*/

public class Exercicio4_31 {

	public static void main(String[] args) {

	
		long num = 11111010111L;
		
		String s = Long.toString(num); // converte o valor de entrada em String
		int len = s.length(); //define o comprimento do valor de entrada para controle do loop.
		
		Long decimal = 0L;
		int n = 1; //variavel multiplicativa binaria
		int i = 0; //variavel de controle de loop
		while(i < len) {
			
			Long digito = (num % 10); //retorna o digito à direita do valor de entrada
			num /= 10; // retorna o valor de entrada sem o digito à direita.
			decimal = decimal + (digito*n);
			n *= 2;
			++i;
		}
		
		System.out.printf("Decimal = %d", decimal);
		
		
	}//end main
}//end class
