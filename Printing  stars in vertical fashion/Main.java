import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int star_count=1;star_count<=n;star_count++)
    {
      System.out.println("*");
    }
  }
}