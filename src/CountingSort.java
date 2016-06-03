
public class CountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,2,3,3,1,1,3,3,2,3,1}	;		
		int k=3;
		Integer freq[]=new Integer[3];
		Integer res[]=new Integer[a.length];
		for(int i=0;i<k;i++)
			freq[i]=0;//freq init
		for(int i=0;i<a.length;i++){
			freq[a[i]-1]+=1;
		}//freq collection
		for(int i=1;i<k;i++)
			freq[i]+=freq[i-1];//freq cumulation
		for(int j=0;j<a.length;j++){
			res[j]=0;
		}//res init
		for(int i=0;i<a.length;i++){
			res[--freq[a[i]-1]]=a[i];			
		}
		for(int i=0;i<a.length;i++){
			System.out.print(res[i]+" ");
		}
		
	}

}
