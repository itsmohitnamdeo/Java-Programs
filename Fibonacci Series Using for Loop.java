

public class Main
{
	public static void main(String[] args) {
		System.out.print(">> Mohit Namdeo\n");
        System.out.print(">> Fibonacci Series Using for Loop\n");
        System.out.print("---------------------------------------------\n");

        int n = 10, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
        System.out.print(firstTerm + ", ");

        // compute the next term
        int nextTerm = firstTerm + secondTerm;
       firstTerm = secondTerm;
        secondTerm = nextTerm;
      }
	}
}
