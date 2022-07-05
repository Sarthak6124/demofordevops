import java.util.Scanner;
class Answer2{

	public static void main(String[] args){
	
	Scanner obj=new Scanner(System.in);

	System.out.println("enter the var2=");

	int var1=obj.nextInt();

	System.out.println("enter the var2=");

	int var2=obj.nextInt();

	System.out.println("enter the var3=");

	int var3=obj.nextInt();
	
	System.out.println("enter the var1="+var1);
	System.out.println("enter the var2="+var2);
	System.out.println("enter the var3="+var3);

//	int var4=var1;

	var1= var2+var3;

	var2=var1-var2;

	var1 = var1-var3;

	var3=var1-var2;

	System.out.println("enter the var1="+var1);
	System.out.println("enter the var2="+var2);
	System.out.println("enter the var3="+var3);
	}
}