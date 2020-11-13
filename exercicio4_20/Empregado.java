package deitel.capitulo4.exercicio4_20;

/*4.20 (Calculador de salários) Desenvolva um aplicativo Java que determina o salário bruto de cada um de três empregados. A empresa paga 
as horas normais pelas primeiras 40 horas trabalhadas por cada funcionário e 50% a mais por todas as horas trabalhadas além das 40 
horas. Você recebe uma lista de empregados, o número de horas trabalhadas por eles na semana passada e o salário-hora de cada um. Seu 
programa deve aceitar a entrada dessas informações para cada empregado e, então, determinar e exibir o salário bruto do empregado. 
Utilize a classe Scanner para inserir os dados.*/

public class Empregado {

	private static final int CARGA_HORARIA_NORMAL = 40;
	private static final double TAXA_ADICIONAL = 0.5;
	private double salarioHora;
	private double salarioMensal;
	private int horaExtra;
	
	
	public Empregado(double salarioHora, int horaExtra) {
		super();
		this.salarioHora = salarioHora;
		this.horaExtra = horaExtra;
	}
	
	public void calculasalarioHora() {
		
		double salarioSemanal = (salarioHora*CARGA_HORARIA_NORMAL);
		double valorHoraExtra = 0.0;
		double totalHoraExtra = 0.0;
		
		if(horaExtra > 0) {
			valorHoraExtra = this.salarioHora*(1 + TAXA_ADICIONAL);
			totalHoraExtra = valorHoraExtra*horaExtra;
			this.salarioMensal = 4*salarioSemanal + totalHoraExtra;
		}else
			this.salarioMensal = 4*salarioSemanal;
		
		System.out.printf("Salario-hora          : R$%.2f%n", salarioHora);
		System.out.printf("Salario semanal padrão: R$%.2f%n", salarioSemanal);
		System.out.printf("Salario Mensal padrão : R$%.2f%n", salarioMensal - totalHoraExtra);
		
		System.out.printf("Total de horas extras : %d horas%n", horaExtra);
		System.out.printf("valor da hora extra   : R$%.2f%n", valorHoraExtra);
		System.out.printf("Bonus de hora extra   : R$%.2f%n", totalHoraExtra);
		System.out.printf("Salario Mensal total  : R$%.2f%n", salarioMensal);
		
		
		
		
		
	}
	
	
	//GETTERS AND SETTERS
	public double getsalarioHora() {
		return salarioHora;
	}
	public void setsalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}
	public double getSalarioHora() {
		return salarioHora;
	}
	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}
	public double getsalarioMensal() {
		return salarioMensal;
	}
	public void setsalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	public int getHoraExtra() {
		return horaExtra;
	}
	public void setHoraExtra(int horaExtra) {
		this.horaExtra = horaExtra;
	}
	public static int getCargaHorariaNormal() {
		return CARGA_HORARIA_NORMAL;
	}
	public static double getTaxaAdicional() {
		return TAXA_ADICIONAL;
	}
	
	
	
	
	
	
	
}//END CLASS
