package deitel.capitulo4.exercicio4_04;

/*4.4 Escreva instruções Java para realizar cada uma das seguintes tarefas:
	
a)  Utilize uma instrução para atribuir a soma de x e y a z, em seguida, incremente x por 1.
b)  Teste se a variável contador é maior do que 10. Se for, imprima "Contador é maior que10".
c)  Utilize uma instrução para decrementar a variável x por 1, então subtraia-o da variável total e armazene o resultado na variável 
	total.*/

public class Exercicio4_4 {
	
	public static void main(String[] args) {
		
		// a) Utilize uma instrução para atribuir a soma de x e y a z, em seguida, incremente x por 1.
		int x = 0 , y = 0 , z;
		z = x++ + y;
		
		System.out.printf("z = %d, x = %d, y = %d%n", z, x, y);
		
		// b) Teste se a variável contador é maior do que 10. Se for, imprima "Contador é maior que10".
		int contador = 0;
		while(contador >= 0) {
			System.out.printf("contador = %d, ", contador);
			if(contador > 10) {
				System.out.printf("Contador maior do que 10 !!!%n");
				break;
			}
			++contador;
		}
		
		//c) Utilize uma instrução para decrementar a variável x por 1, então subtraia-o da variável total e armazene o resultado na variável total.
		int total = 0;
		--x;
		total = total - x; // ou total -= --x
		System.out.println("Total = " + total);
		
		//d) Calcule o resto após q ser dividido por divisor e atribua o resultado a q. Escreva essa instrução de duas maneiras diferentes.
		int q = 100;
		int divisor = 4;
		
		q %= divisor;
		q = q % divisor;
			
	}//end main
}//end class
