
import java.util.*;
public class Duplicates_Removal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,2,2,3,3,4,5,6,6,7,8,8};
		LinkedHashMap unique=new LinkedHashMap();
		for(int i=0;i<a.length;i++)
		{if (unique.get(a[i])==null)
			{unique.put(a[i],"");			
			}
		}
		Set<Map.Entry<Integer,String>> it=unique.entrySet();
		for(Map.Entry<Integer,String> i : it)
			System.out.println(i.getKey());
		System.out.println("list of repeated eleents");	
		int index;
		for(int i=0;i<a.length;i++)
		{if(a[i]>0)
			index=a[i];
		else	
			index=-1*a[i];
		if(a[index]<0)
			System.out.print(index);
		else
			a[index]*=-1;		
		}
			
		System.out.println(Integer.toString(79,2));
		System.out.println(Integer.parseInt("1001111",2));
		
		

	}

}
