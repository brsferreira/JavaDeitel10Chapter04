package deitel.capitulo4.exercicio4_24;

import java.util.Scanner;

public class Analysis {
	
	public void analisar() {
		
		int aprovado = 0;
		int reprovado = 0;
		int estudantesCounter = 1;
		
		Scanner sc = new Scanner(System.in);
		
		//int result = sc.nextInt();
		
		
		while(estudantesCounter <= 10) {
			
			System.out.print("Informe o resultado do teste ( 1 = aprovado, 2 = reprovado): ");
			int result = sc.nextInt();
			if(result != 1 && result != 2) {
				System.out.println("Valor de entrada incorreto;");
				continue;
			}
			
			if(result == 1) {
				System.out.printf("Resultado %d: Aprovado.%n", estudantesCounter);
				aprovado++;
			}else {
				System.out.printf("Resultado %d: Reprovado.%n", estudantesCounter);
				reprovado++;
			}
			estudantesCounter++;
		}
		sc.close();
		
		System.out.printf("%nTotal de Aprovados = %d%nTotal de Reprovados = %d%n", aprovado, reprovado);
		
		if(aprovado > 8) {
			System.out.println("Bônus para o instrutor");
		}else
			System.out.println("Bônus não liberado");
		
	}

}//END CLASS
