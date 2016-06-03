import java.util.*;
public class AnagramOrdering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a={"act","god","cat","dog","tac"};
		//String[] a={"55","j"};
		Map<Integer,String> in=new HashMap();
		int sum=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length();j++){
				sum+=(int)a[i].charAt(j);
			}
			//System.out.print(sum+" ");
			
		if(in.get(sum)==null){
			in.put(sum, a[i]);			
		}
		else{
			in.put(sum, in.get(sum)+"&"+a[i]);			
		}
		sum=0;
		}		
		String res="";
		Set<Map.Entry<Integer,String>> it=in.entrySet();
		for(Map.Entry<Integer,String> m :it){
			res=m.getValue();
			res=res.replace("&", ", ");
			System.out.println(res);
		}
		//============bubble 1 pass (reverse)...to merge intervals question
		int temp=0;
		int b[]={4,2,6,5,7};
		int max[]={0,0,0,0,0};		
		for(int i=0;i<b.length-1;i++){
			if(b[i]>b[i+1]){
				System.out.println(b[i]+" > "+b[i+1]+" temp-->"+temp);
				max[temp++]=b[i];
			}
			else{
				System.out.println(b[i]+" < "+b[i+1]+" temp-->"+temp);
				int t1=temp;
				max[temp++]=max[t1-1];
			}
			
		}
		if(b[b.length-1]>max[temp-1]){
			max[temp]=b[b.length-1];
		}
		else
		{int t1=temp;
		max[temp]=max[t1-1];
			
		}
		for(int i=0;i<max.length;i++){
			System.out.println(max[i]);
		}
		
	}

}
