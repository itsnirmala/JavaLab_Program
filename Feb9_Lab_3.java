//Creating two arrays.One containing String values:peter, Amy, John, Boyd and Cathy & another one containing 
//integer values:15, 9, 14, 10 and 12. Creating a table showing these values as 'Name' 'Value' pairs. 
package Feb9_Lab;

public class Feb9_Lab_3 {

	public static void main(String[] args) {
		String[] name= {"peter", "Amy", "John", "Boyd", "Cathy"};
		Integer[] value= {15, 9, 14, 10, 12};
		print(name,value);
	}
	static void print(String[] n,Integer[] v) {
		System.out.println("Name		"+"Value");
		for(int i=1;i<5;i++) {
			System.out.println(n[i]+"		"+v[i]);
			if(i==4) {
				System.out.println(n[0]+"		"+v[0]);
			}
		}
		
	}
}
