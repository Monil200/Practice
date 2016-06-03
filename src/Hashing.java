import java.util.*;

public class Hashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<Integer,String> hm=new HashMap<Integer,String>();
		Map<Integer,String> hm=Collections.synchronizedMap(new HashMap<Integer,String>());
		hm.put(1,"monil");
		Set <Map.Entry<Integer,String>> set=hm.entrySet();
		System.out.println(hm.containsKey(1));
		System.out.println(hm.size());
		for(Map.Entry<Integer,String> t:set)
			{System.out.println(t.getValue());			
			}
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);				
		Integer[] t=new Integer[l.size()];
		Integer[] ltoarray=l.toArray(t);
		System.out.println(ltoarray[0]);
		
		List<Integer> lcpy=new ArrayList<Integer>();
		lcpy=Arrays.asList(ltoarray);
		System.out.println(lcpy.size());
		
		List<String> lc=Collections.synchronizedList(new ArrayList<String>());
		
		Integer[] b=Arrays.copyOf(ltoarray,ltoarray.length);	
		
		String bb="Monil";
		String a="Monil";
		System.out.println(a.equals(bb));
		System.out.println(a==bb);

	}

}
