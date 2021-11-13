

public class Main
{
	public static void main(String[] args) {
		System.out.print(">> Mohit Namdeo\n");
        System.out.print(">> Multiplication Table using while loop\n");
        System.out.print("---------------------------------------------\n");

        int num = 9, i = 1;
        while(i <= 10)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
            i++;
        }
	}
}
