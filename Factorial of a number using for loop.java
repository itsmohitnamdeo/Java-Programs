

public class Main
{
	public static void main(String[] args) {
		System.out.print(">> Mohit Namdeo\n");
        System.out.print(">> Factorial of a number using for loop\n");
        System.out.print("---------------------------------------------\n");

        int num = 10;
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
	}
}
