import java.util.Scanner;
class Main{  
  public static int sum_of_numbers(int num)
      {
        int sum=0;
        for(int count=1;count<=num;count++)
        {
          sum=sum+count;
        }
     return sum;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n =in.nextInt();
      int sum=sum_of_numbers(n);
      System.out.println(sum);
    
	}
}