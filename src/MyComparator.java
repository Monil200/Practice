import java.lang.Comparable;
import java.util.*;
//comparable -->compareTo(Object o)
//Comparator -->compare(Object o1,Object o2)
public class MyComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(331,"Monil");
		Employee e2=new Employee(56,"Monil thakur");
		Employee e3=new Employee(94,"Monil USC");
		List<Employee> employeeList=new ArrayList<Employee>();
		employeeList.add(e1);employeeList.add(e2);employeeList.add(e3);
		System.out.println("Before Object Sort");
		for(Employee e: employeeList)
			System.out.println("ID : "+e.id+" Name : "+e.name);
		System.out.println("After Object Sort");
		Collections.sort(employeeList);
		for(Employee e: employeeList)
			System.out.println("ID : "+e.id+" Name : "+e.name);
//		Comparable<Employee> mc=new MyCompare();
		PriorityQueue<Employee> pq=new PriorityQueue<Employee>();
		pq.add(e1);
		pq.add(e2);
		pq.add(e3);
		System.out.println("The sort order of Priorty Queue is");
		for(Employee e:pq)
			System.out.println("ID : "+e.id+" Name : "+e.name);
		System.out.println("The sort order of Priorty Queue in individual calls");
		System.out.println("ID : "+pq.peek().id+" Name : "+pq.poll().name);
		System.out.println("ID : "+pq.peek().id+" Name : "+pq.poll().name);
		System.out.println("ID : "+pq.peek().id+" Name : "+pq.poll().name);		
	}

}
class Employee implements Comparable<Employee> {
	int id;
	String name;	
	public Employee(int id,String name){
		this.id=id;
		this.name=name;
	}	
	public int compareTo(Employee o){
		if(o==null)
			throw new NullPointerException("Null object");
		else if(!this.getClass().equals(o.getClass())) {
			throw new ClassCastException("Objects of different class cannot be compared");
		}
		else {			
			return this.id-o.id;
		}
	}
}
