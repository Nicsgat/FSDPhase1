package de;

public class FirstJavaClass {

	public static void main(String[] args) { //-------main method in the static frame 
		// TODO Auto-generated method stub
		
		Student std1 = new Student(); //creating a object of type student 
		
		//Method 1 :-assigning values to the properties 
		std1.name= "Nikhil";
		System.out.print(std1.name); //------accessing property
		std1.attendSession();  //-----calling the class method
		
		Student std2 = new Student();
		std2.name= " Gat";
		System.out.println(std2.name);
		
		//Method 2:- or we can use constructors to assign values to properties 
		
		Student student2= new Student("john", 234, "ENC");
		System.out.println(student2.name);
	}
	

}
	
class Student{
	String name;   //-----------properties or instance variables 
	int rollNo; 
	String Course;
	
	void attendSession(){ //-------behaviour
		//open webex
		//login to webex using your roll number
		//join the course you have enrolled 
		System.out.println(" have attended this class");
	}
	
	void leaveSession() {
		//leave the session by clicking leave session 
	}
	
	void askQuestion() {
		//Asking the question about this session 
	}
	
	//---->no argument constructor
	
	Student(){
		
	}
	
	/*--parameterised constructor
	Student(String name1, int Roll, String course1){     
		name =name1;
		rollNo= Roll;
		Course= course1;
	}
	*/
	
	Student(String name, int rollNo, String Course){
		this.name = name;
		this.rollNo= rollNo;
		this.Course = Course;
	}
	
	
	
	
}

	
