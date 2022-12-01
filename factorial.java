import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		
		int fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int a = sc.nextInt();
		
		for(int i = 1;i<a;i++)
		{
			fact = fact*i;
		}
		
		System.out.println(fact);
	

	
	sc.close();
	}
}
