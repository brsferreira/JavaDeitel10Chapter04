package deitel.capitulo4;

import java.util.Scanner;

public class Student {

	private String name;
	private double average;
	
	
	public Student(String name, double average) {
		super();
		this.name = name;
		
		if(average > 0.0)
			if(average <= 100.0)
				this.average = average;
	}

	// GETTERS AND SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		
		if (average > 0.0)                                               
			if (average <= 100.0)                                         
				this.average = average;
	}
	
	public void average() {
		
		double total = 0;
		int gradeCounter = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira a primeira nota. (Para fechar o programa, insira o valor -1). \nNota 1: ");
		double nota = sc.nextDouble();
		
		while(nota != -1) {
			total = total + nota;
			gradeCounter++;
			System.out.print("Nota " + (gradeCounter+1) + " : ");
			nota = sc.nextDouble();
		}
		
		if(gradeCounter != 0) {
			this.average  = (total/gradeCounter);
			System.out.printf("Média total = %.2f%n",average);
		}else
			System.out.println("Nenhuma nota foi inserida");
		sc.close();
		
	}// END average()
	
	public String getLetterGrade() {
		
		 String letterGrade = "";
		 
		 if(average >= 90.0)
			 letterGrade = "A";
		 else if(average >= 80.0)
			 letterGrade = "B";
		 else if(average >= 70.0)
			 letterGrade = "C";
		 else if(average >= 60.0)
			 letterGrade = "D";
		 else 
			 letterGrade = "F";
		 
		 return letterGrade;
	}
	
	
}//END CLASS
