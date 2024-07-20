package maccess;
import java.util.*;
public class DemoCollection {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try(s;){
			Collection<Integer> c = null;
			System.out.println("===Choice===");
			System.out.println("1.Set<E>\n2.List<E>\n3.Queue<E>");
			System.out.println("Enter your choice: ");
			int choice1 = s.nextInt();
			switch(choice1) {
				case 1://Set
					System.out.println("Choice");
					System.out.println("1.HashSet\n2.LinkedHashSet\n3.TreeSet");
					System.out.println("Enter the Choice:");
					int choice2 = s.nextInt();
					switch(choice2) {
					case 1: //HashSet
						c = new HashSet<Integer>();
						break;
					case 2: //LinkedHashSet
						c = new LinkedHashSet<Integer>();
						break;
					case 3: //TreeSet
						c = new TreeSet<Integer>();
						break;
					default: 
						System.out.println("Program terminated...");
						System.exit(0);
					}
					break;
				case 2://List
					System.out.println("Choice");
					System.out.println("1.ArrayList\n2.LinkedList\n3.Vector");
					System.out.println("Enter the Choice:");
					int choice3 = s.nextInt();
					switch(choice3) {
					case 1: //ArrayList
						c = new ArrayList<Integer>();
						break;
					case 2: //LinkedList
						c = new LinkedList<Integer>();
						break;
					case 3: //Vector
						c = new Vector<Integer>();
						break;
					default: 
						System.out.println("Program terminated...");
						System.exit(0);
					}
					break;
				case 3://Queue
					System.out.println("Choice");
					System.out.println("1.PriorityQueue\n2.ArrayDeque");
					System.out.println("Enter the Choice:");
					int choice4 = s.nextInt();
					switch(choice4) {
					case 1: //PriorityQueue
						c = new PriorityQueue<Integer>();
						break;
					case 2: //ArrayDequeue
						c = new ArrayDeque<Integer>();
						break;
					default: 
						System.out.println("Program terminated...");
						System.exit(0);
					}
					break;
				default:
					System.out.println("Program terminated...");
					System.exit(0);
			}//end of switch
			System.out.println("Enter the elements to be added to Collection");
			int n = s.nextInt();
			System.out.println("Enter "+n+" elements");
			for(int i = 0; i < n; i++) {
				c.add(new Integer(s.nextInt()));
			}
			System.out.println("Display using toString()");
			System.out.println(c.toString());
			System.out.println("===Display using Iterator===");
			Iterator<Integer> it = c.iterator();
			
			while(it.hasNext()) {
				System.out.println(it.next()+" ");
			}
			System.out.println("\n===Display using New Iterator<E> Java8===");
			Iterator<Integer> it2 = c.iterator();
			it2.forEachRemaining((p)->
			{
				System.out.println(p + " ");
			});
			System.out.println("\n===Display using Special Iterator Java8===");
			Spliterator<Integer> sp = c.spliterator();
			sp.forEachRemaining((q)->
			{
				System.out.println(q + " ");
			});
			System.out.println("\n===Display using forEach Java8===");
			c.forEach((r)->
			{
				System.out.println(r + " ");
			});
		}
		catch(Exception e) {e.printStackTrace();}	
	}
}