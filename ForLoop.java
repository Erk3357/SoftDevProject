import java.util.Scanner;

public class ForLoop{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("-----------ForLoop----------");
	System.out.println("");
	System.out.println("");

	int sum = 0;
	int num = 0;


	for (int x = 1; x <= 10; x++){
		System.out.print("Enter Number "+x+": ");
		num = input.nextInt();

		if(num % 2 != 0){
			sum += num;
		}
	}


	System.out.println("Sum of odd number is: "+sum);

	Index.main(null);
}}