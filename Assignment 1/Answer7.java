import java.util.Scanner;


class Answer7{
	public static void main(String [] a){
	System.out.println("enter var1=");
	Scanner obj= new Scanner (System.in);
	int var1=obj.nextInt();
	System.out.println("enter var2=");
	int var2=obj.nextInt();
	System.out.println("var1="+var1);
	System.out.println("var2="+var2);
	var1=var1^var2;
	var2=var1^var2;
	var1=var1^var2;	
	System.out.println("var1="+var1);
	System.out.println("var2="+var2);
	
	}


}