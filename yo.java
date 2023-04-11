package Java;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter your factorial Number");
		Scanner sc = new Scanner(System.in);
		int Gopi = sc.nextInt();
		int a=1;
		for(int i=Gopi; i>=1;i--) {
			a=a*i;//Gopi = 5  - 
		}
		System.out.println(a);
	}
	

}