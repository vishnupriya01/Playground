import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner (System.in);
      int size = in.nextInt();
      int arr[]= new int[size];
      int left=0;
      int right=size-1;
      for(int i=0;i<size;i++)
      {
        arr[i]=in.nextInt();
      }
      int func=0;
      while(left<right)
      {
        if(arr[left]!=arr[right])
        {
          func=1;
          break;
        }
      else
      {
      left++;
      right--;
      }
      }
      if(func==0)
      {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
      
      
    }
}