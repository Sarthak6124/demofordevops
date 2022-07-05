import java.util.Scanner;
class Answer3{

	public static void main(String args[]){

	Scanner obj= new Scanner(System.in);
	
	System.out.print("enter celcius temprature");
	
	float c= obj.nextFloat();
	
	float f;
	
	
	f =(float) ( (float)( (9/5)*c ) +  32 ) ;
	
	System.out.print( " farenheite temprature = " + f );
		
		
	System.out.println("enter farenheite temprature");
	
	float fah= obj.nextFloat();
	
	float cel;
	
	
	cel = (float)((fah -32) * 5 / 9 );
	
	System.out.print( " celcius temprature = " + cel );
		
	
	}

}