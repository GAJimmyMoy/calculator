import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Calculator test = new Calculator();
			Scanner input = new Scanner(System.in);
			System.out.println("what is your 1st number?");
			int a = input.nextInt();
			System.out.println("what is your 2nd number?");
			int b = input.nextInt();
			
			System.out.println("Which operation would you like to do?");
			System.out.println("1 for add, 2 for subtract, 3 multiple, 4 for division.");
			int operation = input.nextInt();
			if(operation==1) {
				System.out.println("the sum is " +test.add(a, b));
			}
			else if(operation==2) {
				System.out.println("the subtraction is " +test.subtract(a, b));
			}
			else if(operation==3) {
				System.out.println("the multiplication is " +test.multiply(a, b));
			}
			else if(operation==4) {
				System.out.println("the division is " +test.divide(a, b));
			}
			else {
				System.out.println("invalid option");
			}
			
			
	}

}
