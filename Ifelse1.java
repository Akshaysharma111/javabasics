import java.util.Scanner;
public class Ifelse1 {
	    public static void main(String[] args) {
	        System.out.println("Enter Your Age:");
	        Scanner scanner=new Scanner(System.in);
	    int age=scanner.nextInt();
	    scanner.close();
	    if(age>18){
	        System.out.println("You Can Drive");
	    }
	    else{
	        System.out.println("You Can't Drive");}
	    }
	}

