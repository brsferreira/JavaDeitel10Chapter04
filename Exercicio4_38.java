package deitel.capitulo4;


/*4.38 (Impondo  privacidade  com  criptografia)  O  crescimento  explosivo  de  comunica��o  e  armazenamento  de  dados  na  internet  e  em 
computadores conectados por ela aumentou muito a preocupa��o com a privacidade. O campo da criptografia envolve a codifica��o de 
dados para torn�-los dif�ceis de acessar (e espera-se � com os esquemas mais avan�ados � imposs�veis de acessar) para usu�rios sem 
autoriza��o de leitura. Nesse exerc�cio, voc� investigar� um esquema simples para criptografar e descriptografar dados. Uma empresa que 
quer enviar dados pela internet pediu-lhe que escrevesse um programa que criptografe dados a fim de que eles possam ser transmitidos 
com maior seguran�a. Todos os dados s�o transmitidos como inteiros de quatro d�gitos. Seu aplicativo deve ler um inteiro de quatro d�gitos 
inserido pelo usu�rio e criptograf�-lo da seguinte maneira: substitua cada d�gito pelo resultado da adi��o de 7 ao d�gito, obtendo o restante 
depois da divis�o do novo valor por 10. Troque ent�o o primeiro d�gito pelo terceiro e o segundo d�gito pelo quarto. Ent�o, imprima o 
inteiro criptografado. Escreva um aplicativo separado que receba a entrada de um inteiro de quatro d�gitos criptografado e o descriptografe 
(revertendo o esquema de criptografia) para formar o n�mero original. [Projeto de leitura opcional: pesquise a �criptografia de chave 
p�blica� em geral e o esquema de chave p�blica espec�fica PGP (Pretty Good Privacy). Voc� tamb�m pode querer investigar o esquema 
RSA, que � amplamente usado em aplicativos robustos industriais.]*/

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
