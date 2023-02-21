import java.util.Scanner;

public class Greater
{
	public static void main(String[] args)
	{
		//Scanner scn=new Scanner(System.in);
		//System.out.println("enter num");
		//int num=scn.nextInt();
		int[]num= {0,1,1,2,3,5,8,13,21,34,55};
		int str=1;
		int sp=num.length-1;
		for(int i=0;i<=num.length;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=str;k++)
			{
				if(k==str)System.out.print(num[i]);
				else System.out.print(" ");
			}
			System.out.println();
			if(i<sp)
			{
				str+=2;
				sp--;
			}
			else {
				str-=2;
				sp++;
			}
		}
	}

}
