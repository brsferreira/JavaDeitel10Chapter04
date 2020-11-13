package deitel.capitulo4;


/*4.31 (Imprimindo o equivalente decimal de um n�mero bin�rio) Escreva um aplicativo que insere um n�mero inteiro que cont�m so-
mente 0s e 1s (isto �, um n�mero inteiro bin�rio) e imprime seu equivalente decimal. [Dica: utilize os operadores de resto e divis�o para 
pegar os d�gitos do n�mero bin�rio um de cada vez da direita para a esquerda. No sistema de n�meros decimais, o d�gito mais � direita 
tem um valor posicional de 1 e o pr�ximo d�gito � esquerda um valor posicional de 10, depois 100, depois 1.000 e assim por diante. O 
n�mero decimal 234 pode ser interpretado como 4 * 1 + 3 * 10 + 2 * 100. No sistema de n�mero bin�rio, o d�gito mais � direita tem um 
valor posicional de 1, o pr�ximo d�gito � esquerda um valor posicional de 2, depois 4, depois 8 e assim por diante. O equivalente decimal 
do bin�rio 1.101 � 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8 ou 1 + 0 + 4 + 8 ou 13.]*/

public class Exercicio4_31 {

	public static void main(String[] args) {

	
		long num = 11111010111L;
		
		String s = Long.toString(num); // converte o valor de entrada em String
		int len = s.length(); //define o comprimento do valor de entrada para controle do loop.
		
		Long decimal = 0L;
		int n = 1; //variavel multiplicativa binaria
		int i = 0; //variavel de controle de loop
		while(i < len) {
			
			Long digito = (num % 10); //retorna o digito � direita do valor de entrada
			num /= 10; // retorna o valor de entrada sem o digito � direita.
			decimal = decimal + (digito*n);
			n *= 2;
			++i;
		}
		
		System.out.printf("Decimal = %d", decimal);
		
		
	}//end main
}//end class
