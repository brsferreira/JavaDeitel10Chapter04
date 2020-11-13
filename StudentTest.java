package deitel.capitulo4;

public class StudentTest {

	public static void main(String[] args) {

		Student student1 = new Student("Bruno", 72.0);
		new Student("Nadia", 62.0);
		
//		System.out.printf("%s 's letter grade is: %s%n", student1.getName(), student1.getLetterGrade());
//		System.out.printf("%s 's letter grade is: %s%n", student2.getName(), student2.getLetterGrade());
//		System.out.println(Integer.MIN_VALUE +  " e " + Integer.MAX_VALUE);
		
		student1.average();
		
	}

}
