import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int size=in.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
      {
        arr[i]=in.nextInt();
      }
      int search1=in.nextInt();
      int search2=in.nextInt();
      int element_1_index=-1;
      int element_2_index=-1;
      for(int i=0;i<=size-1;i++)
      {
        if(search1==arr[i])
        {
          element_1_index = i;
         }
          if(search2==arr[i])
          {
            element_2_index = i;
          }
        }
 System.out.println(element_1_index);
        System.out.println(element_2_index);
        
      }
}