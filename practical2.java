import java.util.Scanner;
class practical2
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		double D,Dx,Dy,x,y;
		System.out.println("Enter value of a:");
		a=sc.nextDouble();
		System.out.println("Enter value of b:");
		b=sc.nextDouble();
		System.out.println("Enter value of c:");
		c=sc.nextDouble();
		System.out.println("Enter value of d:");
		d=sc.nextDouble();
		System.out.println("Enter value of e:");
		e=sc.nextDouble();
		System.out.println("Enter value of f:");
		f=sc.nextDouble();
	D=a*d-b*c;
	Dx=e*d-b*f;
	Dy=a*f-c*e;
	x=Dx/D;
	y=Dy/D;
		
		System.out.println("x="+x);
		System.out.println("y="+y);



		
	}
}
