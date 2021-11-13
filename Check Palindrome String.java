

public class Main
{
	public static void main(String[] args) {
	    	System.out.print(">> Mohit Namdeo\n");
        System.out.print(">> Calculate the power of a number using a for loop\n");
        System.out.print("---------------------------------------------\n");

    String str = "Radar", reverseStr = "";
    
    int strLength = str.length();

    for (int i = (strLength - 1); i >=0; --i) {
      reverseStr = reverseStr + str.charAt(i);
    }

    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
      System.out.println(str + " is a Palindrome String.");
    }
    else {
      System.out.println(str + " is not a Palindrome String.");
    }
	}
}
