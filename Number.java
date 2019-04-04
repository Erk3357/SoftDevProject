import java.util.Scanner;

public class Number{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("-----------Number----------");
	System.out.println("");
	System.out.println("");

	System.out.print("Enter a number: ");
	int num = input.nextInt();

	if(num > 0){
		System.out.println("The number you entered is positive");
	}

	else if(num < 0){
			System.out.println("The number you entered is negative");
	}

	else if(num == 0){
		System.out.println("The number you entered is zero");
	}

	Index.main(null);
}}