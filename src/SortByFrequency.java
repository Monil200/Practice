import java.util.*;
public class SortByFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={3,3,3,3,2,2,2,5,6,7,8,8,8,9,9};
		int u=0;
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();		
		for(int i=0;i<a.length;i++)
			{if(hm.get(a[i])==null)
				{hm.put(a[i],1);
				u++;
				}
			else
				hm.put(a[i],hm.get(a[i])+1);
			}
		Set <Map.Entry<Integer,Integer>> set=hm.entrySet();
		for(Map.Entry<Integer,Integer> s: set)
			{System.out.print(s.getKey()+" ");
			System.out.println(s.getValue());
			}
		Integer arr[]=new Integer[u];
		int in=0;
		for(Map.Entry<Integer,Integer> s: set)
			{arr[in]=(s.getValue());
			in++;
			}
		System.out.println("=========");
		for(int i=0;i<arr.length;i++)
			{System.out.println(arr[i]);			
			}
		SortInt obj=new SortInt();
		arr=obj.bubble(arr);
		System.out.println("=========");
		for(int i=0;i<arr.length;i++)
		{System.out.println(arr[i]);			
		}
		in=0;
		for(int i=0;i<arr.length;i++)
			{for(Map.Entry<Integer,Integer> s: set)
				{if(arr[i]==s.getValue() && s.getValue()!=-99)
					for(int j=0;j<s.getValue();j++)
						System.out.print(s.getKey()+" ");
				if(arr[i]==s.getValue())
					hm.put(s.getKey(),-99);   				
				}			
			}
	}

}
class SortInt
{public Integer[] bubble(Integer a[])
	{int temp=0;
	for(int i=0;i<a.length;i++)
		{for(int j=i+1;j<a.length;j++)
			{if(a[j]<a[i])
				{temp=a[j];
				a[j]=a[i];
				a[i]=temp;			
				}			
			}
		}	
	return a;
	}
}
