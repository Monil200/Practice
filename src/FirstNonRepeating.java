import java.util.*;
public class FirstNonRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="ababcdcdeffhj";
		int aaa[]=new int[256];
		LinkedHashMap<Character,Integer> hm=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<a.length();i++)
			{if(hm.get(a.charAt(i))==null)
				hm.put(a.charAt(i),1);
			else
				hm.put(a.charAt(i),hm.get(a.charAt(i))+1);							
			}
		Set <Map.Entry<Character,Integer>> s=hm.entrySet();
		for(Map.Entry<Character,Integer> s1 :s)
			{if(s1.getValue()==1)
				{System.out.println(s1.getKey());
				break;
				}
			}
		//==========2nd method===============
		String once="";
		once=a.charAt(0)+"";
		String twice="";
		for(int i=1;i<a.length();i++)
			{if(once.contains(a.charAt(i)+""))
				{twice+=a.charAt(i)+"";
				once=once.replace(a.charAt(i)+"","");
				}
			else
				once+=a.charAt(i)+"";
			}
		System.out.println("========"+once.charAt(0)+"=======");
		
	}

}
