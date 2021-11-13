import java.time.LocalDateTime;

public class Main
{
	public static void main(String[] args) {
		System.out.print(">> Mohit Namdeo\n");
        System.out.print(">> Get Current date and time in default format\n");
        System.out.print("---------------------------------------------\n");

        LocalDateTime current = LocalDateTime.now();

        System.out.println("Current Date and Time is: " + current);
	}
}
