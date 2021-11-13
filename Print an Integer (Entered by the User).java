import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        System.out.print("*** Mohit Namdeo ***\n");
        System.out.print("* Print an Integer entered by an user *\n");
        // Creates a reader instance which takes
        // input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // nextInt() reads the next integer from the keyboard
        int number = reader.nextInt();

        // println() prints the following line to the output screen
        System.out.println("You entered: " + number);
    }
}