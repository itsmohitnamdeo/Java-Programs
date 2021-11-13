import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.print(">> Mohit Namdeo\n");
        System.out.print(">> Check whether a number is even or odd using if...else statement\n");
        System.out.print("---------------------------------------------\n");

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
	}
}
