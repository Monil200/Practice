import java.util.*;
public class TestHM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="mimansha";
		Map<String,Integer> hm=new HashMap<String,Integer>();
		for(int i=0;i<a.length();i++) {
			if(hm.get(a.charAt(i)+"")==null) {
				hm.put(a.charAt(i)+"", 1);
			}
			else
				hm.put(a.charAt(i)+"", hm.get(a.charAt(i)+"")+1);
		}
		
		Set<Map.Entry<String,Integer>> it=hm.entrySet();
		for(Map.Entry<String, Integer> i: it)
			System.out.println("Key:"+i.getKey()+" Value:"+i.getValue());
		
		for(int i=0;i<a.length();i++) {
			if(hm.get(a.charAt(i)+"")==1) {
				System.out.println("The first non repeting character is:"+a.charAt(i));
				break;
			}
		}
			
	}

}
