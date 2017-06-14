package guvi.hunterlevel;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConcatenation {
 public static void main(String []args){
	 Scanner scr=new Scanner(System.in);
	 String x="";
	 System.out.println("Enter the size of array");
	 int n=scr.nextInt();
	 int arr[]=new int[n];
	 for(int i=0;i<n;i++){
		 arr[i]=scr.nextInt();
	 }
	 Arrays.sort(arr);
	 for(int j=arr.length-1;j>=0;j--){
		x+=arr[j];
	 }
	 System.out.println(x);
 }
}
