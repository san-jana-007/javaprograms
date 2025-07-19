package program2;

import java.util.Scanner;

public class Program3 {
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
	int a=sc.nextInt();
	if(a==1) {
		Program3.print(a);
	}
	else if(a%2!=0) {
	Program3.print(a-1);
	}
	else {
		Program3.print(a);
	}
}
}
