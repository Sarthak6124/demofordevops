import java.util.Scanner;
class Answer1{
	
	public static void main(String []args){
	
	System.out.println("enter var1=");

	Scanner obj= new Scanner(System.in);

	int var1=obj.nextInt();
	System.out.println("enter var2=");
	int var2=obj.nextInt();

	System.out.println("enter var2="+var2);
	System.out.println("enter var1="+var1);
	int var3=var1;
	var1=var2;
	var2=var3;
	
	System.out.println("enter var2="+var2);
	System.out.println("enter var1="+var1);
	
	}
}