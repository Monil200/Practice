
public class Boloom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,45,67,99,123,456,23478};
		int repeat[]={0,0,1,1,1,1,1,2,3,4};
		int sort[]={900,567,23,1,678,231};
		System.out.println("The location is:"+binarySearch(a,0,a.length,45));
		System.out.println("The location of first element is:"+BSFirst(repeat,0,repeat.length,1));
		System.out.println("The location of last element is:"+BSLast(repeat,0,repeat.length,3));
		System.out.println("The sorted array is:");
		quickSort(sort,0,sort.length-1);
		for(int i=0;i<sort.length;i++)
        	System.out.print(sort[i]+" ");
		String x="m";
		String y="o";
		editDistanceOne(x,y);
		
	}
	public static void editDistanceOne(String x,String y) {
		int lengthX=x.length();
		int lengthY=y.length();
		int diff=0;
		int startX=0,startY=0;
		if(Math.abs(lengthX-lengthY)>1)
			System.out.println("False");
		else {
			while(lengthX >0 && lengthY > 0) {
				if(!(x.charAt(startX)+"").equals(y.charAt(startY)+"")) { 
					diff++;
					if(lengthX>lengthY)
						{startX++;
						lengthX--;
						}
					else if(lengthY>lengthX)
						{startY++;
						lengthY--;
						}
					else {
						startX++;
						startY++;
						lengthX--;
						lengthY--;
					}
				}
				else {
					startX++;
					startY++;
					lengthX--;
					lengthY--;
				}										
			}
			if(diff>1)
				System.out.println("False");
			else
				System.out.println("True");
		}
		
		
	}
	
	public static int binarySearch(int a[],int start,int end,int t){
		int mid=(start+end)/2;
		if(a[mid]==t)
			return mid;
		else if(a[mid]>t)
			return binarySearch(a,start,mid-1,t);
		else
			return binarySearch(a,mid+1,end,t);
	}
	
	public static int BSFirst(int a[],int start,int end,int t) {
		int mid=(start+end)/2;
		while(end>=start)
			{if(a[mid]==t && (a[mid-1]<t || mid==0))
				return mid;
			else if(a[mid]>t)
				return BSFirst(a,start,mid-1,t);
			else if(a[mid]<t)
				return BSFirst(a,mid+1,end,t);
			else
				--mid;
			
			}
		return -1;
		
	}
	public static int BSLast(int a[],int start,int end,int t) {
		int mid=(start+end)/2;
		while(end>=start) {
			if(a[mid]==t && (a[mid+1]>t || mid==a.length-1))
				return mid;
			else if(a[mid]>t)
				return BSLast(a,start,mid-1,t);
			else if(a[mid]<t)
				return BSLast(a,mid+1,end,t);
			else
				++mid;
		}
		return -1;
	}
	public static void quickSort(int a[],int lower,int upper) {
		int q;
		if(lower<upper) {
			q=partition(a,lower,upper);
			quickSort(a,lower,q);
			quickSort(a,q+1,upper);
		}
	}
	public static int partition(int a[],int x,int y) {
		int pivot=a[x];
		int i=x-1;
		int j=y+1;
		int temp;
		while(true) {
			i++;
			while(i<y && a[i]<pivot)
				i++;
			j--;
			while(j>x && a[j]>pivot)
				j--;
			if(i<j) {
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
			else
				return j;
		}
	}

}
