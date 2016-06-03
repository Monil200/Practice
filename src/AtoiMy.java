import java.math.*;
import java.util.*;
public class AtoiMy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String a="ab      b       c";
	String temp="";
	
	
	for(int i=0;i<a.length();i++)
		{//if(ch[i]==' ')
		temp=a.charAt(i)+"";
		if(temp.equals(" "))
			continue;
		else
			System.out.println(a.charAt(i));
		}
	String at="1011";
	int c=0;
	int units=1;
	int res=0;
	for(int i=at.length()-1;i>=0;i--)
		{c=Integer.parseInt(at.charAt(i)+"",10);
		System.out.println(c);
		res+=units*c;
		units*=10;
		}
	System.out.println(res);
	String sp="abc abc";
	String spa[]=sp.split(" ");
	System.out.println(spa[0]);
		
	String ana="caat";
	String ana2="actt";
	HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
	for(int i=0;i<ana.length();i++)
		{if(hm.get(ana.charAt(i))==null)
			{hm.put(ana.charAt(i),1);}
		else			
			hm.put(ana.charAt(i),hm.get(ana.charAt(i))+1);
		}
	
	Set <Map.Entry<Character,Integer>> se=hm.entrySet();
	
	for(Map.Entry<Character,Integer> it : se)
		{System.out.print("char--:"+it.getKey());
		System.out.println(" count--"+it.getValue());				
	}
	for(int i=0;i<ana2.length();i++)
		{if(hm.get(ana2.charAt(i))==null)
			System.out.println("NOt an anagram"+ana2.charAt(i));
		else
			hm.put(ana2.charAt(i),hm.get(ana2.charAt(i))-1);		
		}
	se=hm.entrySet();
	for(Map.Entry<Character,Integer> it : se)
	{System.out.print("char--:"+it.getKey());
	System.out.println(" count--"+it.getValue());				
	}
	String base="ABCEABCDABCEABCD";
	String pattern="ABCD";
	int orgl=base.length();
	base=base.replace(pattern,"/");
	int ind=base.indexOf("/");
	System.out.println(base);
	//System.out.println(orgl+" "+newl);
	//System.out.println((orgl-newl)/pattern.length());
	
	while(ind!=-1)
		{System.out.println(ind+4);
		ind=base.indexOf("/",ind+1);		
		}			
	char xx='a';
	String yy ="zzzyy rtfg";
	byte bb[];
	bb=yy.getBytes();
	int counter=0;
	for(int i=0;i<yy.length();i++)
		{/*System.out.println(bb[i]);
		if(bb[i]==32)
			counter++;*/
		if(yy.charAt(i)==' ')
			counter++;
		}
	System.out.println(counter);
	List<String> ll=new ArrayList<String>();
	ll.add("monil");
	ll.add("roger");
	ll.add("novak");
	System.out.println(ll.get(0));
	Collections.sort(ll);
	
	for(int i=0;i<ll.size();i++)
		{System.out.println(ll.get(i));
		
		}
	System.out.println(ll.contains("mo"));
	int aa[]={90,87,345,12,67};
	Arrays.sort(aa);
	for(int i=0;i<aa.length;i++)
	{
		System.out.println(aa[i]);
	
	}
	System.out.println(Arrays.binarySearch(aa,12));
	
	System.out.println("Factors---");
	//factors.
	int num=45;
	int numcpy=45;
	for(int i=2;i<numcpy/2;i++)
		{while(num%i==0)
			{System.out.print(i+" ");
			//System.out.print(num+" ");
			num=num/i;
			}
		}
		
		
	
	
}
}
