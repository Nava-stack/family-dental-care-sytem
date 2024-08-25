import java.util.Scanner;

public class com {
  public static Scanner input = new Scanner(System.in);

  public static void print(String message) {
    System.out.print(message);
  }

  public static void print(int message) {
    System.out.print(message);
  }

  public static void println(String message) {
    System.out.println(message);
  }

  public static String input(String message) {
    print(message);
    return input.nextLine();
  }

  public static int inputToInt(String message) {
    print(message);
    return Integer.parseInt(input.nextLine());
  }

  public static Float inputFloat(String message) {
    print(message);
    return input.nextFloat();
  }
}
