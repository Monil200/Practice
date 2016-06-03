
public class QuickPractise {
	static int a[]={5,8,1,56,78,23,90,12};
	static int iterations=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target=56;
		quick(a,0,a.length-1,target);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
	}
	
	static void quick(int a[],int p,int q,int target){
		if(p<q)
		{	iterations++;
			int x=partition(a,p,q);
			if(target==a[x])
				System.out.println("target found in "+iterations+" iterations");
			else if(target<a[x])
				quick(a,p,x-1,target);
			else if(target>a[x])
				quick(a,x+1,q,target);
		}
	}
	static int partition(int a[],int p,int q){
		int i=p-1;
		int j=q+1;
		int pivot=a[p];
		int temp;
		while(true){
			i++;
			while(a[i]<pivot && i<q){
				i++;
			}
			j--;
			while(a[j]>pivot && j>p){
				j--;
			}
			if(i<j)
			{temp=a[i];
			a[i]=a[j];
			a[j]=temp;				
			}
			else
				return j;
		}
		
	}
	
}
