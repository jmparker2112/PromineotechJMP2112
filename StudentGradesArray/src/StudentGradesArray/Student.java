package StudentGradesArray;

//public class Student {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub

public class Student { 
			   String fullName = ""; 
			   int[] grades; 

			   public Student(String fName,int[] grades) { 
			   this.fullName = fName; 
			   this.grades = grades; 
			   }  
			   public void describe() { 
			      System.out.println("Student: " + this.fullName); 
			      System.out.println("Grades:"); 
			      for (int grade : this.grades) { 
			          System.out.println("\t" + grade + " "); 
			      } 
			      System.out.println(); 
			   } 
			 }

}

}
