import java.util.Scanner;

public class BigNumber{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("-----------BigNumber----------");
	System.out.println("");
	System.out.println("");

	System.out.println("Enter a number");
	int num = input.nextInt();

	if (num > 1000000){
		System.out.println("THAT is a big number");
	}
	Index.main(null);
	}
}