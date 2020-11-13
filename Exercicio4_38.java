package deitel.capitulo4;


/*4.38 (Impondo  privacidade  com  criptografia)  O  crescimento  explosivo  de  comunicação  e  armazenamento  de  dados  na  internet  e  em 
computadores conectados por ela aumentou muito a preocupação com a privacidade. O campo da criptografia envolve a codificação de 
dados para torná-los difíceis de acessar (e espera-se — com os esquemas mais avançados — impossíveis de acessar) para usuários sem 
autorização de leitura. Nesse exercício, você investigará um esquema simples para criptografar e descriptografar dados. Uma empresa que 
quer enviar dados pela internet pediu-lhe que escrevesse um programa que criptografe dados a fim de que eles possam ser transmitidos 
com maior segurança. Todos os dados são transmitidos como inteiros de quatro dígitos. Seu aplicativo deve ler um inteiro de quatro dígitos 
inserido pelo usuário e criptografá-lo da seguinte maneira: substitua cada dígito pelo resultado da adição de 7 ao dígito, obtendo o restante 
depois da divisão do novo valor por 10. Troque então o primeiro dígito pelo terceiro e o segundo dígito pelo quarto. Então, imprima o 
inteiro criptografado. Escreva um aplicativo separado que receba a entrada de um inteiro de quatro dígitos criptografado e o descriptografe 
(revertendo o esquema de criptografia) para formar o número original. [Projeto de leitura opcional: pesquise a “criptografia de chave 
pública” em geral e o esquema de chave pública específica PGP (Pretty Good Privacy). Você também pode querer investigar o esquema 
RSA, que é amplamente usado em aplicativos robustos industriais.]*/

public class Exercicio4_38 {

	public static void main(String[] args) {
	
		
		
		String novoNumero = "";
		String num = "1234";
		int[] numero = new int[num.length()];
		int div = 1000;
		int i = 0;
		
		if(num.isEmpty() || num.length() > 4) {
			
			System.out.println("O numero inserido deve conter 4 digitos.");
		}else {
				while(i < num.length()){
					
					int digito = (((Integer.parseInt(num)/div)%10)+7)%10; 
					System.out.printf("digito %d = %d%n",(i+1), digito);
					
					numero[i] = digito;
					novoNumero += Integer.toString(digito);
					
					div /= 10;
					++i;
				}
				System.out.println("\n" + "Digitos concatenados: "+ novoNumero);
				System.out.print("Trocando a ordem dos digitos: ");
				
				int size = num.length();
				for(int j = 0; j < (size/2); ++j) {
					
					int aux = numero[j];
					numero[j] = numero[j+2];
					numero[j+2] = aux;
				}
				
				for(int x : numero) {
					System.out.printf("%d",x);
				}
			}
		
	}//main
}//class
