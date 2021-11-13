

public class Main
{
	public static void main(String[] args) {
		System.out.print(">> Mohit Namdeo\n");
        System.out.print(">> print half pyramid using alphabets\n");
        System.out.print("---------------------------------------------\n");

        char last = 'E', alphabet = 'A';

    for (int i = 1; i <= (last - 'A' + 1); ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print(alphabet + " ");
      }
      ++alphabet;

      System.out.println();
    }
	}
}
