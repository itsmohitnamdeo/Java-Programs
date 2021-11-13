	   
class Main {

  int sum;

  // first constructor
  Main() {
    // calling the second constructor
    this(5, 2);
  }

  // second constructor
  Main(int arg1, int arg2) {
    // add two value
    this.sum = arg1 + arg2;
  }

  void display() {
    System.out.println("Sum is: " + sum);
  }

  // main class
  public static void main(String[] args) {
     System.out.print(">> Mohit Namdeo\n");
     System.out.print(">> program to call one constructor from another\n");
     System.out.print("---------------------------------------------\n");

    // call the first constructor
    Main obj = new Main();

    // call display method
    obj.display();
  }
}