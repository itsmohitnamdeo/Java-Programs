

public class Main
{
	public static void main(String[] args) {
	    	System.out.print(">> Mohit Namdeo\n");
        System.out.print(">> Check Palindrome Number\n");
        System.out.print("---------------------------------------------\n");

    int num = 3553, reversedNum = 0, remainder;
    
    // store the number to originalNum
    int originalNum = num;
    
    // get the reverse of originalNum
    // store it in variable
    while (num != 0) {
      remainder = num % 10;
      reversedNum = reversedNum * 10 + remainder;
      num /= 10;
    }
    
    // check if reversedNum and originalNum are equal
    if (originalNum == reversedNum) {
      System.out.println(originalNum + " is Palindrome.");
    }
    else {
      System.out.println(originalNum + " is not Palindrome.");
    }
	}
}
