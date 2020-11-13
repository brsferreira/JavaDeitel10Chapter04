package deitel.capitulo4;

/*4.27    (Problema do else oscilante) Determine a sa�da para cada um dos conjuntos dados de c�digo quando x � 9 e y � 11 e quando x � 11
e y � 9. O compilador ignora o recuo em um programa Java. Da mesma forma, o compilador Java sempre associa um else com o if ime-
diatamente precedente a menos que instru�do a fazer de outro modo pela coloca��o de chaves ({}). � primeira vista, o programador pode 
n�o ter certeza de qual if um else particular corresponde � essa situa��o � conhecida como "problema do else oscilante". Eliminamos 
o recuo do seguinte c�digo para tornar o problema mais desafiador. [Dica: aplique as conven��es de recuo que voc� aprendeu.]*/

public class Exercicio4_27 {

	public static void main(String[] args) {
		
		int x  = 11;
		int y = 9;
		
		//a)
		 if (x < 10)
			 if (y > 10)
				 System.out.println("*****"); 
			 else    
				 System.out.println("#####");
		 System.out.println("$$$$$");
		 
		//b)
		 if (x < 10) {
			 if (y > 10)
				 System.out.println("*****");  
		 }
		 else {
			 System.out.println("#####");
			 System.out.println("$$$$$");
		 }
		 
	}//end main
}//end class
