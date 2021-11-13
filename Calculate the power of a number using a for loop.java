

public class Main
{
	public static void main(String[] args) {
		System.out.print(">> Mohit Namdeo\n");
        System.out.print(">> Calculate the power of a number using a for loop\n");
        System.out.print("---------------------------------------------\n");

        int base = 3, exponent = 4;

    long result = 1;

    for (; exponent != 0; --exponent) {
      result *= base;
    }

    System.out.println("Answer = " + result);
	}
}
