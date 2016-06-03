import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class HashIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<Integer,Integer>();
		String a="mmonil";
		for(int i=0;i<a.length();i++){
			if(hm.get((int)a.charAt(i))==null){
				hm.put((int)a.charAt(i),1);
			}
			else
				hm.put((int)a.charAt(i), hm.get((int)a.charAt(i))+1);
		}
		
		Set<Map.Entry<Integer, Integer>> it=hm.entrySet();
		for(Map.Entry<Integer,Integer> i:it){
			System.out.println(i.getKey()+" "+i.getValue());			
		}
		System.out.println("==========");
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(11);
		al.add(111);
		al.add(1111);
		Iterator<Integer> ait=al.iterator(); 
		//al.add(67);
		while(ait.hasNext()){
			System.out.println(ait.next());
		}
		int arr[]={4,5,6,1,3,6,99,999,9991,10,78};
		Integer[] opt=new Integer[arr.length];
		opt[0]=1;
		int max=0;
		System.out.println(opt[0]);
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<i;j++){
				if(arr[j]<=arr[i]){					
						max=opt[j];
				}
			}
			opt[i]=1+max;
			System.out.println(opt[i]); 	//{4,5,6,-1,3,6,1,2,6,8,10,78};
			max=0;
		}
		
		//=================BS===============
		System.out.println("==========");
		int bin[]={0,0,0,1,1};
		//System.out.println(Arrays.binarySearch(bin,0));	
		int beg=0;
		int end=bin.length-1;
		System.out.println(BS(beg,end,bin,0));
		
		int pn[]={-90,9,10,-1,-3,78};
		int pos=-1;
		int temp;
		for(int i=0;i<pn.length;i++){
			if(pn[i]<0){
				pos++;
				temp=pn[pos];
				pn[pos]=pn[i];
				pn[i]=temp;
			}			
		}
		for(int i=0;i<pn.length;i++){
			System.out.print(pn[i]+" ");
		}
		
		String str="aabbcddefff";
		dupRemove(str);
		DateFormat df=null;
		Date d=null;
		String sd="02JUN1990";
		df=new SimpleDateFormat("ddMMMyyyy");
		try
		{
		d=df.parse(sd);
		System.out.println(d.toString());
		}
		catch(Exception e){}
		
		
	}
	
	static void dupRemove(String str){
		int swaps=0;
		//System.out.println(str+"--");
		for(int i=0;i<str.length()-1;i++){
			if(str.charAt(i)==str.charAt(i+1)){
				str=str.replace(str.charAt(i)+""+str.charAt(i+1),"");				
				swaps+=1;
				break;
			}						
		}				
		if(swaps>0)
			dupRemove(str);
		else
			System.out.println(str);
	}
	static int maximum(int a,int b){
		if(a>=b)
			return a;
		else
			return b;
	}
	static int BS(int beg,int end,int a[],int req){
		int mid=(beg+end)/2;
		while(end>=beg)
		{	if((mid==0 || a[mid-1]<req) && a[mid]==req)
				return mid;
			else if(a[mid]>req){
				end=mid-1;
				return BS(beg,end,a,req);
			}
			else if(a[mid]<req){
				beg=mid+1;
				return BS(beg,end,a,req);
			}
			else
				mid--;			
		}
		return -1;		
	}

}
