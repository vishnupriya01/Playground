import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      int missing=0;
      for(int val=1;val<=n;val++)
      {
        boolean is=false;
        for(int i=0;i<n;i++)
        {
          if(arr[i]==val)
          {
            is=true;
            break;
          }
        }
        if(is==false)
        {
          missing=val;
          break;
        }
      }
      System.out.print(missing);
    }
}
        
                               
                               
                               
                               
                               
                               
                               
                      
    