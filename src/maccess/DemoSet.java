package maccess;
import java.util.*;
public class DemoSet {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try(s;){
			TreeSet<Integer> ts = new TreeSet<Integer>();
			System.out.println("Enter the number of elements to be added to TreeSet");
			int n = s.nextInt();
			System.out.println("Enter "+n+" elements");
			for(int i = 1; i <= n; i++) {
				ts.add(s.nextInt());
				//The above line can also be written as ts.add(new Integer(s.nextInt()))
				//Due to autoboxing, it is automatically converted to above line
			}// end of for loop
			System.out.println("===Display Choice===");
			System.out.println("1.Ascending Order\n2. Descending Order");
			int choice = s.nextInt();
			switch(choice) {
			case 1:
				System.out.println(ts.toString());
				break;
			case 2:
				//Set does not have indexes, hence convert to an object array first
				Object o[] = ts.toArray();
				for(int i = o.length - 1; i >= 0; i--) {
					System.out.print(o[i].toString()+" ");
				}
				break;
			default:
				System.out.println("Invalid choice...");
			}//end of switch
		}
		catch(Exception e) { e.printStackTrace();}
	}
}
