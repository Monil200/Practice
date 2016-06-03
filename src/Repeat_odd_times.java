import java.util.Arrays;


public class Repeat_odd_times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={5,5,4,6,6,6,6,7,8,88,9};
		Sort obj=new Sort();
		//a=obj.bubble(a);
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]+" ");
		System.out.println("Above is the sorted array");
		System.out.println("Below is the no. with odd no of occurances");
		int temp=a[0];
		int count=1;
		for(int i=1;i<a.length;i++)
			{if(temp==a[i])
				{count++;				
				}
			else
				{if(count%2==1)
					System.out.println(temp+" ");
				temp=a[i];				
				count=1;							
				}
			
			}
		if(count%2==1)
			System.out.println(temp+" ");
	}

}

class Sort
{public int[] bubble(int a[])
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

