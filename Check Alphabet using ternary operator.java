

public class Main
{
	public static void main(String[] args) {
	System.out.print(">> Mohit Namdeo\n");
        System.out.print(">> Check Alphabet using ternary operator\n");
        System.out.print("---------------------------------------------\n");

        char c = 'A';
        
        String output = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')
                ? c + " is an alphabet."
                : c + " is not an alphabet.";
        
        System.out.println(output);
	}
}
