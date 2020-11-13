package deitel.capitulo4;

public class Exercicio4_30c_ {
	
	
	public static long fact(int x) {
	    long fat = 1;
	    for (int i = 1; i < x; i++) {
	    	fat = fat * i;
	    }
	    return fat;
	}
	
	public static long potencia(int i) {
		int x = 2;
		return (long) Math.pow(x, i);
		
	}
	
	
	public static double euler(){
        double e = 0;
        for (int i = 1; i < 50; i++) {
            e = e + (potencia(i-1) / (double) (fact(i)));
        }
        return e;
    }
	
	public static void main(String[] args) {
		
		//System.out.println("Potencia de x = " + potencia(0));
		//System.out.println("Fatorial de i = " + fact(2));
		
		System.out.println(Exercicio4_30c_.euler());
		System.out.println(Math.pow(Math.E, 2));
		
		
		
	}//end main
}//end class
