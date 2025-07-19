package program2;

import java.util.Arrays;

public class Program4 {
	public static int[] multiple(int[]arr){
		int[]total=new int[9];
		for(int i=0;i<9;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]%(i+1)==0){
					 count++;
				}
			}
			
				total[i]=count;
			
			
		}
		return total;
	}
public static void main(String[] args) {
	int[] arr= {1,2,8,9,12,46,76,82,1,20,30};
	int[] count=Program4.multiple(arr);
	for (int i = 0; i < 9; i++) {
	    System.out.print(i+1+":"+count[i]+" ");
	}
	
}
}
