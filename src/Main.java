import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to the Factorial Calculator!");
    int n = sc.nextInt();
    boolean calculate = true;
    while (calculate) {
      System.out.println("Enter a non-negative integer");
      int count = 0;
      int res = 1;
      while (count < n) {
        res = res * (count + 1);
        count++;
      }
      System.out.println("Factorial " + n + "=" + res);
      System.out.println("Would you like to continue: ");
      String input = sc.next();
      if (input.equals("no")) {
        calculate = false;
      }
    }
    sc.close();
  }
}
