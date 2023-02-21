
public class Demo1 {

	public static void main(String[] args)
	{
		 int n = 5;
	        int number = 1;
	        for (int i = 1; i <= n; i++) {
	            for (int j = n - i; j >= 1; j--) {
	                System.out.print("  ");
	            }
	            for (int j = i; j >= 1; j--) {
	                System.out.printf("%3d", number);
	                number++;
	            }
	            System.out.println();
	        }
	}

}
