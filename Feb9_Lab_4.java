//A method that accepts a String from user and print all duplicate character which belongs to that String.
package Feb9_Lab;

import java.util.Scanner;

public class Feb9_Lab_4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str=s.nextLine();
		
		char []str_arr=str.toCharArray();
		System.out.println("Duplicate characters are: ");
		find_dup(str_arr);
		
		s.close();
	}
	public static void find_dup(char[] x) {
		for(int i=0;i<x.length;i++) {
			int count=0;
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==x[j]) {
					count++;
					x[j]=0;
				}
			}
			if(count>0 && x[i]!=0) {
				System.out.print(x[i]+" ");
			}
		}
	}
}
