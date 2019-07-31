import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in =new Scanner(System.in);
    int n= in.nextInt();
    int list[]= new int[n];
    for(int index=0;index<n;index++)
    {
      list[index]=in.nextInt();
    }
    perfect(list,n);
  }
  public static void perfect(int list[],int n)
  {
    boolean isperfect=true;
    int batchsum=list[0]+list[1]+list[2];
    for(int index=3;index<n;index=index+3)
    {
      int batch2=list[index]+list[index+1]+list[index+2];
      if(batch2 != batchsum)
      {
        isperfect=false;
      }
    }
      if(isperfect==true)
      {
        System.out.println("Perfect Batch");
        
      }
      else
      {
        System.out.println("Not a Perfect Batch");
      }
    }
  }

 