package deitel.capitulo4.exercicio4_19;
import java.util.Scanner;

public class Vendas {

	private int item;
	private double valor;
	private int sentinela;
	private double valorTotal;

	public Vendas() {
		super();
		this.item = 0;
		this.sentinela = 0;
		this.valorTotal = 0.0;
	}

	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getSentinela() {
		return sentinela;
	}
	public void setSentinela(int sentinela) {
		this.sentinela = sentinela;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void comissao() {
		
		System.out.print("Programa para calculo de pagamento dos vendedores.\nPara finalizar o programa, "
				+ "deve-se informar o valor 0.\n\n");
		
		while(sentinela != -1) {
			
			this.item++;
			System.out.print("Informe o valor do item " + item + " vendido: R$ ");
			Scanner sc = new Scanner(System.in);
			this.valor = sc.nextDouble();
			this.valorTotal += valor;
			
			if(valor != 0)
				continue;
			else {
				sentinela = -1;
				sc.close();
			}
			
		} //END WHILE
		
		double comissao = 0.09*valorTotal;
		System.out.println("---------------------------------------------------------");
		System.out.println("Programa finalizado.");
		System.out.printf("Valor total vendido: R$%.2f%n" , valorTotal);
		System.out.printf("Comissão recebida: R$%.2f%n", comissao);
		System.out.printf("Valor recebido pelo vendedor: R$%.2f%n" , (200.0 + comissao));
		System.out.println("---------------------------------------------------------\n");
	}

} //END CLASS
	

