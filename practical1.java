import java.util.Scanner;
class practical1
{
	public static void main(String args[]){
		System.out.println("Enter distance in meter");
		Scanner sc=new Scanner(System.in);
		int a;
		float b;
		a=sc.nextInt();
		double distanceF=a*3.28084; 
		System.out.println("Distance in feet:"+distanceF);
	}
}
