package deitel.capitulo4.exercicio4_18;

public class Credito {
	
	private int conta;
	private int saldoInicial;
	private int totalItens;
	private int credito;
	private int limiteCredito;
	
	
	
	public Credito(int conta, int saldo, int totalItens, int credito, int limiteCredito) {
		super();
		this.conta = conta;
		this.saldoInicial = saldo;
		this.totalItens = totalItens;
		this.credito = credito;
		this.limiteCredito = limiteCredito;
	}
	
	//GETTERS AND SETTERS
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public int getSaldo() {
		return saldoInicial;
	}
	public void setSaldo(int saldo) {
		this.saldoInicial = saldo;
	}
	public int getTotalItens() {
		return totalItens;
	}
	public void setTotalItens(int totalItens) {
		this.totalItens = totalItens;
	}
	public int getcredito() {
		return credito;
	}
	public void setcredito(int credito) {
		this.credito = credito;
	}
	public int getLimiteCredito() {
		return limiteCredito;
	}
	public void setLimiteCredito(int limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	public void saldo() {
		int novoSaldo = saldoInicial + credito - totalItens;
		System.out.printf("Saldo total: %d%n", novoSaldo);
		if(novoSaldo > limiteCredito)
			System.out.println("Limite de crédito excedido!");
		else
			System.out.println("Compra autorizada.");
	}
	
	

}//END CLASS
