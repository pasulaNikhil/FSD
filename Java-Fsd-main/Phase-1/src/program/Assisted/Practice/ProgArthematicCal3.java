package program.Assisted.Practice;

import java.util.Scanner;

public class ProgArthematicCal3 {

	public static void main(String[] args) {
		
		
		int num1,num2,add,subtract,multiply;
		float devide;
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("enter two numbers:");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		
	    add = num1 + num2;
	    subtract = num1 - num2;
	    multiply = num1 * num2;
	    devide = (float)num1/num2;
	    
	    System.out.println("sum =" +add);
	    System.out.println("difference =" +subtract);
	    System.out.println("multiplication =" +multiply);
	    System.out.println("division =" +devide);
	    
		// TODO Auto-generated method stub

	}

}
