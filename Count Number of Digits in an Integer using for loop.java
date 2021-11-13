

public class Main
{
	public static void main(String[] args) {
		System.out.print(">> Mohit Namdeo\n");
        System.out.print(">> Count Number of Digits in an Integer using for loop\n");
        System.out.print("---------------------------------------------\n");

        int count = 0, num = 123456;

    for (; num != 0; num /= 10, ++count) {
    }

    System.out.println("Number of digits: " + count);
	}
}
