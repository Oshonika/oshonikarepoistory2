package pkg1;

public class Student {
	int age;
	int roll_no;
	
	public void display() 
	{
	System.out.println("Welcome to all of you");	

    }
	public static void main(String[] args) 
	{
		Student deepak=new Student();
		deepak.age=18;
		deepak.roll_no=12;
		System.out.println(deepak.age);
		System.out.println(deepak.roll_no);
		deepak.display();	
	    
	}
}

