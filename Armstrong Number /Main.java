import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int copy=n;
      int count=0;
      int sum=0;
      while(n>0)
      {
        count++;
        n=n/10;
      }
       n=copy;
      int fact=1;
      while(n>0)
      {
        int rem=n%10;
        
        
        for(int i=1;i<=count;i++)
        {
          fact=fact*rem;
        }
	sum=sum+fact;
        n=n/10;
        fact=1;
      }
if(sum==copy)
{
  System.out.println("Armstrong Number");
}
      else
      {
        System.out.println("Not a Armstrong Number");
      }
      }
}