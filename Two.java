import java.util.Scanner;

public class Two{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("-----------Two----------");
	System.out.println("");
	System.out.println("");

	int x = 0;
	int y = 0;

	System.out.print("Enter first number: ");
	x = input.nextInt();

	System.out.print("Enter second number: ");
	y = input.nextInt();

	if( x == 2 && y == 2){
		System.out.println("Both numbers are equal to 2");}

	else if(x == 2 || y == 2){
		System.out.println("One of the numbers is equal to 2");}

	else{
		System.out.println("None of the numbers are equal to 2");}

	Index.main(null);

}}