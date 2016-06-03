import java.io.*;
import java.util.*;
public class AbstractDemo {

	public static void main(String[] args) {		
		Derived obj=new Derived(9);
		System.out.println("enter input");
		/*BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		try
			{System.out.println(bf.readLine());}
		catch(Exception e)
			{
			
			}*/
		obj.display();
		X.absStatic();
		obj.concrete();
		// TODO Auto-generated method stub
	 	X x;		
		x=obj;
		x.display();
		System.out.println("=====");
		x.concrete();
		Map<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("a", 1);
		hm.put("n", 3);
		hm.put("r", 2);
		Set<Map.Entry<String,Integer>> me=hm.entrySet();
		Set<String> s=hm.keySet();
		for(String i:s)
			{System.out.println(i);
			}
		List<String> ls=new ArrayList<String>();
		ls.add("abc");
		ls.add("aaa");
		ls.add("abb");
		Collections.sort(ls);
		ListIterator<String> li=ls.listIterator();
		while(li.hasNext())
			System.out.println(li.next());
		
			}
	
	

}

abstract class X
{abstract void display();
static void absStatic()
	{
	System.out.println("hello Static");
	}
void concrete()
{System.out.println("hello Concrete");
}
X(int i)
{System.out.println("hello construcotor");
}

}

class Derived extends X
{void display()
	{System.out.println("hello");		
	}
Derived(int i)
{super(i);
System.out.println("hello derived");
}

}


