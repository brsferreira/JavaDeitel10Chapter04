package deitel.capitulo4.exercicio4_17;

import java.util.Scanner;

//PSEUDOCODIGO

/* Verificar a quilometragem por litro obtida por automoveis durante varias viagens
 * declarar e inicializar a variavel inteira quilometragem como zero
 * declarar e inicializar a variavel inteira litros como zero
 * 
 * Enquanto o contador for diferente da sentinela(-1)
 * solicitar ao usuario que insira a quilometragem
 * solicitar ao usuario que insira a quantidade de litros utilizada
 * 
 * imprimir a quilometragem total
 * imprimir a soma total de litros de combustivel consumidos
 * calcular e exibir o consumo em quilometros/litro
 */

public class Quilometragem {

	
	public void calculador() {
		
		int kilometragem = 0;
		int litroConsumido = 0;
		int sentinela = 0;
		int viagem = 0;
		
		while(sentinela != -1) {
			viagem++;
			System.out.printf("Viagem: %d%n", viagem );
			System.out.print("Informe a quilometragem (Km): ");
			Scanner sc = new Scanner(System.in);
			int rodagem = sc.nextInt();
			System.out.print("Informe a quantidade de combustivel consumido (L): ");
			int consumo = sc.nextInt();
			
			
			System.out.printf("Quilometragem total: %d Km%n", rodagem);
			System.out.printf("Total de litros consumidos: %d Litros%n", consumo);
			
			double consumoMedio = (double)rodagem/consumo;
			System.out.printf("Consumo médio: %.2f Km/L%n%n" , consumoMedio);
			
			kilometragem += rodagem;
			litroConsumido += consumo;
			
			System.out.println("---------------------------------------------");
			System.out.println("Total de viagens: " + viagem);
			System.out.printf("Quilometragem Total: %d Km%n", kilometragem);
			System.out.printf("Consumo total: %d Litros%n", litroConsumido);
			System.out.printf("Média Total de consumo: %.2f Km/L%n" , ((double)kilometragem/litroConsumido));
			System.out.println("---------------------------------------------");
			
			System.out.println("Deseja inserir outras viagens? Informe S ou N.");
			String chave = sc.next();
			if(chave.contains("S"))
				sentinela = 0;
			else {
				sentinela = -1;
				System.out.println("Programa finalizado !");
				sc.close();
			}
		}
		
	}
	
	
	
}//END CLASS
