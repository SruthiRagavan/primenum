import java.util.Scanner;
 
public class CSP_Ex3 {
	
	Scanner scan;
	int num, power;
	
	void getVal() {
		
		scan = new Scanner(System.in);
		
		System.out.println("Power of given Number");
		
		System.out.println("\nEnter the number");		
		num = Integer.parseInt(scan.nextLine());
		
		System.out.println("Power of :");		
		power = Integer.parseInt(scan.nextLine());
	}
	
	void display() {
		
		int sum = 0;
		
		sum = (int) Math.pow(num, power);
		
		System.out.println("The Digit Count is : " + sum);		
	}
}
 
class MainClass {
	
	public static void main(String args[]){
		
		CSP_Ex3 obj = new CSP_Ex3();
		
		obj.getVal();
		obj.display();
	}
}