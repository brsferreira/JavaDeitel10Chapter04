package deitel.capitulo4;

/*4.28 (Outro problema do else oscilante) Modifique o c�digo dado para produzir a sa�da mostrada em cada parte do problema. Utilize 
t�cnicas de recuo adequadas. N�o fa�a nenhuma altera��o al�m de inserir chaves e alterar o recuo do c�digo. O compilador ignora recuo 
em um programa Java. Eliminamos o recuo do c�digo fornecido para tornar o problema mais desafiador. [Observa��o: � poss�vel que n�o 
seja necess�ria nenhuma modifica��o para algumas das partes.]*/

//if (y == 8)   
//if (x == 5)   
//System.out.println("@@@@@");  
//else  
//System.out.println("#####");  
//System.out.println("$$$$$");  
//System.out.println("&&&&&");

public class Exercicio4_28 {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 7;
		
		System.out.println("a) Supondo que x = 5 e y = 8, a seguinte sa�da � produzida:");
		
		if (y == 8)   
			if (x == 5)   
				System.out.println("@@@@@");  
			else  
				System.out.println("#####");  
		System.out.println("$$$$$");  
		System.out.println("&&&&&");
		
		System.out.println("---------------------------------------------------------");
		
		System.out.println("b) Supondo que x = 5 e y = 8, a seguinte sa�da � produzida:");
		
		if (y == 8)   
			if (x == 5)   
			System.out.println("@@@@@");  
			else {  
			System.out.println("#####");  
			System.out.println("$$$$$");  
			System.out.println("&&&&&");
			}
		
		System.out.println("---------------------------------------------------------");
		
		System.out.println("d)  Supondo que x = 5 e y = 7, a seguinte sa�da � produzida. \n[Observa��o: todas as tr�s �ltimas instru��es de sa�da depois do else s�o " + 
				"partes de um bloco].");
		
		if (y == 8) {   
			if (x == 5)   
				System.out.println("@@@@@");  
		}else {  
			System.out.println("#####");  
			System.out.println("$$$$$");  
			System.out.println("&&&&&");
		}
		
		System.out.println("---------------------------------------------------------");
		
		
	}//main
}//class
