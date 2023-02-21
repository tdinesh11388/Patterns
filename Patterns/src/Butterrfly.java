import java.util.Scanner;

public class Butterrfly {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
	    System.out.println("ENter size");
	    int n=scn.nextInt();
	    int st1=1;
	    int st2=n*2-1;
	    for(int i=1;i<=n*2-1;i++) {
	      for(int j=1;j<=n*2-1;j++) {
	        if(j<=st1||j>=st2)System.out.print("*");
	        else System.out.print(" ");
	      }
	      if(n>i) {
	        st1++;
	        st2--;
	      }
	      else {
	        st1--;
	        st2++;
	      }
	      System.out.println("");
	    }
	}

}
