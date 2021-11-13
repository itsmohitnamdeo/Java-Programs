

public class Main
{
	public static void main(String[] args) {
		System.out.print(">> Mohit Namdeo\n");
        System.out.print(">> Find the largest number among three using nested if..else statement\n");
        System.out.print("---------------------------------------------\n");

        double n1 = -4.5, n2 = 3.9, n3 = 5.5;

        if(n1 >= n2) {
            if(n1 >= n3)
                System.out.println(n1 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        } else {
            if(n2 >= n3)
                System.out.println(n2 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        }
	}
}
