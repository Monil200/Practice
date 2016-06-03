
public class RearrangePosNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={-1,-2,-10,-9,3,4,5,-7,9,11};
		int j=-1;
		int temp;
		for(int i=0;i<a.length;i++)
			{if(a[i]<0)
				{j++;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;				
				}			
			}
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		System.out.println("=====");
		int pos,neg;
		pos=j+1;
		neg=0;
		while(neg<pos && pos<a.length)
			{temp=a[neg];
			a[neg]=a[pos];
			a[pos]=temp;
			neg+=2;
			pos+=2;
			}
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
		int mm=57;
		System.out.println(" "+(char)mm);
		
	}

}
