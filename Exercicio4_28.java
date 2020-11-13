package deitel.capitulo4;

/*4.28 (Outro problema do else oscilante) Modifique o código dado para produzir a saída mostrada em cada parte do problema. Utilize 
técnicas de recuo adequadas. Não faça nenhuma alteração além de inserir chaves e alterar o recuo do código. O compilador ignora recuo 
em um programa Java. Eliminamos o recuo do código fornecido para tornar o problema mais desafiador. [Observação: é possível que não 
seja necessária nenhuma modificação para algumas das partes.]*/

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
		
		System.out.println("a) Supondo que x = 5 e y = 8, a seguinte saída é produzida:");
		
		if (y == 8)   
			if (x == 5)   
				System.out.println("@@@@@");  
			else  
				System.out.println("#####");  
		System.out.println("$$$$$");  
		System.out.println("&&&&&");
		
		System.out.println("---------------------------------------------------------");
		
		System.out.println("b) Supondo que x = 5 e y = 8, a seguinte saída é produzida:");
		
		if (y == 8)   
			if (x == 5)   
			System.out.println("@@@@@");  
			else {  
			System.out.println("#####");  
			System.out.println("$$$$$");  
			System.out.println("&&&&&");
			}
		
		System.out.println("---------------------------------------------------------");
		
		System.out.println("d)  Supondo que x = 5 e y = 7, a seguinte saída é produzida. \n[Observação: todas as três últimas instruções de saída depois do else são " + 
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
