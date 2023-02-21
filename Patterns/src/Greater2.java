import java.util.Arrays;
public class Greater2
{
	public static void main(String[] args)
	{
		int[]num= {1,2,3,5,8,13,21,34,55};
		int str=1;
		int sp=num.length-1;
		for(int i=0;i<num.length;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<str;k++)
			{
				if(i%2==0)
				{
					if(k==str)
					{
						System.out.print(num[i]);
					}
				}
				{
					System.out.print(num[i]);
				}
			}
			System.out.println();
			if(i<sp)
			{
				sp--;
				str+=2;
			}
			else {
				sp++;
				str-=2;
			}
		}
	}

}
