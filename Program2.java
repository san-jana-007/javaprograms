package program2;

import java.util.Scanner;

public class Program2 {
	public static void print(int a) {
		for(int i=1;i<=a;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
			
		}
		
	}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number");
	Program2.print(sc.nextInt());
}
}
