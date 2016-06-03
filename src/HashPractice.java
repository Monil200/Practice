import java.util.*;


public class HashPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable names=new Hashtable();		
		Enumeration k,e;
		int num=0;
		String uname="";
		names.put(new Integer(1),"monil");
		names.put(new Integer(2),"monil parikh");
		k=names.keys();
		e=names.elements();
		Set <Map.Entry<Integer,String>> s1=names.entrySet();
		for(Map.Entry<Integer,String> s2 :s1)
			{System.out.println(s2.getKey()+" "+s2.getValue()+"--->Set Method");		 	
			}
		System.out.println("=============");
		System.out.println(names.containsValue("monil"));
		while(k.hasMoreElements() && e.hasMoreElements())
			{System.out.println(k.nextElement());
			//num=Integer.parseInt(k.nextElement().toString());
			//System.out.println(num);
			uname=(String) e.nextElement();
			System.out.println(uname);
			
			}
		e=names.elements();
		k=names.keys();
			System.out.println(names.containsKey(1));
			//System.out.println(names.get(2));			
			System.out.println(names.get(k.nextElement()));
			System.out.println(names.get(k.nextElement()));
			System.out.println(names.isEmpty());
			System.out.println(names.toString());
			String a="I am a boy.";
			int fi=a.indexOf(" ");			
			int lasti=0;
			lasti=a.lastIndexOf(" ");
			String p="";			
			while(lasti>-1)
				{lasti=a.lastIndexOf(" ");
				if(lasti==-1)
					{System.out.print(a.substring(0,fi));
					break;
					}				
				System.out.print(a.substring(lasti+1,a.length())+" ");				
				a=a.substring(0,lasti);					
				}
			
			
			
			
			ArrayList<Integer> al=new ArrayList<Integer>();
			
			al.add(1);
			al.add(2);
			al.add(3);
			al.add(4);
			al.add(5);	
			System.out.println(al.get(0)+"AL get");
			ListIterator<Integer> lii=al.listIterator();
			while(lii.hasNext())
				{System.out.println(lii.next()+"----");				
				}			
			
			
			HashMap<Integer,String> hm=new HashMap<Integer,String>();
			hm.put(4,"");
			hm.put(7,"");
			hm.put(2,"");
			hm.put(8,"");
			hm.put(3,"");
			hm.put(10,"");			
			int req=11;
			int temp=0;
			int t=0;
			Set <Map.Entry<Integer,String>> m=hm.entrySet(); 
			for(Map.Entry<Integer,String> set : m )
				{temp=set.getKey();
				if(hm.get(req-temp)!=null && set.getValue()!="1")
					{t=req-temp;
					hm.put(req-temp,"1");
					System.out.print("{"+temp+", "+t+"}");
					System.out.println();
					}
				
				}
				
			int n1=60,n2=700;
			String st1=n1+"";
			String st2=n2+"";
			
			char ch[]=st1.toCharArray();
			System.out.println((int)ch[0]);
			System.out.println(ch.length);
			
			String test="monil";
			System.out.println(test.substring(2));
			
			int x[]={1,7,-9,3,5,-8,5,-44};
			int count=0;
			int te=0;
			for(int i=0;i<x.length;i++){
				if(x[i]<0){
					te=x[i];
					x[i]=x[count];
					x[count++]=te;									
				}				
			}
			for(int i=0;i<x.length;i++){
				System.out.print(x[i]+" ");
			}
			
			ArrayList<Integer> abc=new ArrayList();
			abc.add(1);
			abc.add(2);
			Integer ab[]=new Integer[abc.size()];
			ab=abc.toArray(ab);
			System.out.println();
			ArrayList<Integer> abcd=new ArrayList(Arrays.asList(ab));			
			System.out.println(abcd.get(0));
			
			
			
				
			
	}

}


