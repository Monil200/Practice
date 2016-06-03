
public class QuickS {
static int a[]={2,7,1,45,23,90,12,42};
static int k=3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		quickSort(a,0,a.length-1);
		System.out.println("final");
		for(int k=0;k<a.length;k++)
        	System.out.print(a[k]+" ");

	}

	public static void  quickSort(int a[],int lower,int upper){			
		if(lower<upper){			
			int q=partition(a,lower,upper);
			if(q==k)
				System.out.println("The required numner is "+a[k]);
			else if(q>k)
				quickSort(a,lower,q);
			else if(q<k)
				quickSort(a,q+1,upper);
			
		}
		
	}
	public static int partition(int a[],int lower,int upper){
		int pivot=a[lower];
		int i=lower-1;
		int j=upper+1;
		int temp;
		System.out.println("pivot-->"+pivot);		
		while(true){
			i++;
			while(a[i]<pivot && i<upper)
				i++;
			j--;
			while(a[j]>pivot && j>lower)
				j--;
			if(i<j){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			else
				return j;
				
		}			   
		
	}
}
