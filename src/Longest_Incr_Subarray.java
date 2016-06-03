
//public class Longest_Incr_Subarray {

import java.math.BigInteger;
import java.util.*;

	
public class Longest_Incr_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={3,4,7,10,34,1,5};
		Sort obj=new Sort();
		a=obj.bubble(a);
		int mov=1;
		int num=20;
		int sum=0;
		System.out.println("Below is the result ");
		int b,c,d;
		int len=a.length;
		for(int i=0;i<len-2;i++)
			{b=a[i];//fixed
			mov=i+1;
			len=a.length;
			for(int j=i+1;j<len;j++)			
				{c=a[mov];//first moving;
				d=a[len-1];//end moving;
				sum=b+c+d;
				if (sum==num)
					System.out.println(b+" "+c+" "+d);
				else if(sum>num)
					{len--;					
					}
				else if(sum<num)
					{mov++;					
					}
				}									
			}
		}			
}





