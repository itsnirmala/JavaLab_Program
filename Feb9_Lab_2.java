//A method that takes a String[] as an argument and returns a string containing the concatenation of all the 
//strings in input array. Invoke your method 3 times with different arguments. Make sure that your code handles
//the cases where the argument is null 
package Feb9_Lab;

public class Feb9_Lab_2 {

	public static void main(String[] args) {
		String[] arr= {"Hello","to","everyone","present","here!!"};
		System.out.println("Given array - ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n\nAfter Concatination - ");
		System.out.println(concat(arr));

	}

	private static String concat(String[] arr) {
		StringBuffer s=new StringBuffer();
		for(int i=0;i<arr.length;i++) {
			s.append(arr[i]);
		}
		String str=s.toString();
		return str;
	}

}
