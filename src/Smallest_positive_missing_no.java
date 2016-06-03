import java.math.BigInteger;
	
public class  Smallest_positive_missing_no{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={-1,10,8,76,4,-3,10,2};
		Sort obj=new Sort();
		a=obj.bubble(a);
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]+" ");
		System.out.println("Above is the sorted array");
		System.out.println("Below is the smallest +ve missing no. ");
		int pos=0;
		int temp;
		for(int i=0;i<a.length;i++)
			{if(a[i]<0)
				{temp=a[pos];
				a[pos]=a[i];
				pos++;//will point to fist positive element
				a[i]=temp;				
				}			
			}
		for(int i=a[pos-1];i<a[pos];i++)
			{if(i>0)
				{System.out.println(i);
				break;				
				}
			
			}
		String c="111";
		int decimalValue = Integer.parseInt(c, 2);
		System.out.println(decimalValue);
		
		String s = ""+110;
	    BigInteger bi = new BigInteger(s);
	    String bin = bi.toString(2);
	    System.out.println(bin);
		
	}

}

/*class Sort
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
}*/

