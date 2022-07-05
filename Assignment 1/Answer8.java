import java.util.Scanner;
class Answer8{
	public static void main(String []args){
	Scanner obj=new Scanner(System.in);	
	System.out.println("enter the basic salary");
	double basic =obj.nextDouble();
	double salary= (basic*0.4 )+(basic*0.2 )+basic;
	System.out.println("salary==" + salary );

	}



}