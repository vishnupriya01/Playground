import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      
      int n=in.nextInt();
      int turn=0;
      for(int row=1;row<=n;row++)
      {
        for(int col=1;col<=row;col++)
        {
          if(turn==0)
          {
            System.out.print("*");
            turn=1;
          }
          else
          {
            System.out.print("#");
            turn=0;
          }
          
        }
        System.out.print("\n");
      }
    }
}