//A method that takes a String and return the String of same length containing the 'X' character in all positions
//except the last 4 positions.The characters in the last four positions must be the same as in the original String.
package Feb9_Lab;

import java.util.Scanner;

public class Feb9_Lab_1 {

	public static void main(String[] args) {
		System.out.print("Enter Password: ");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.print("Public view: ");
		Hide(str);
		s.close();
	}
	public static void Hide(String x) {
		char arr[]=x.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(i>=arr.length-4) {
				arr[i]='X';
				System.out.print(arr[i]+" ");
			}else {
				System.out.print(arr[i]+" ");
			}
		}
	}
}