import java.util.Scanner;

class oddeven
{
  public static void main(String args[])
  {
    int nums;
    System.out.println("Enter an Integer number:");
    Scanner in = new Scanner(System.in);
    nums = in.nextInt();
    if ( nums % 2 == 0 )
    System.out.println("number is even");
    else
    System.out.println("number is odd");
  }
}