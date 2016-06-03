
public class RotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={21,22,23,7,8,9,10,11,12,13};
		System.out.println(findRotationPoint(a,0,a.length-1));//to find a point at which the array is rotated.
		System.out.println(findElement(a,0,a.length-1,7));
	}
	static int findRotationPoint(int a[],int start,int end){
		int mid=(start+end)/2;
		if(start==end)
				return a[mid];
		if(a[mid]<a[mid-1] && a[mid]<a[mid+1])
			return a[mid];
		else if(a[mid]<a[end]){ //its right subarray is properly sorted...look  into left subarray
		 return findRotationPoint(a,start,mid-1);
		}
		else
			return findRotationPoint(a,mid+1,end);
	}
	static int findElement(int a[],int start,int end,int k){
		int mid=(start+end)/2;
		if(start==end || a[mid]==k)
				return a[mid];		
		if(a[mid]<a[end]){ 
		 if(k>a[mid] && k<=a[end])
			 return findElement(a,mid+1,end,k);
		 else
			 return findElement(a,start,mid-1,k);
		}
		else{
			if(k>=a[start] && k<a[mid])
				return findElement(a,start,mid-1,k);
			else
				return findElement(a,mid+1,end,k);
			
		}
		
	}
}
