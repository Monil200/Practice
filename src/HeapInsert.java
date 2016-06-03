
import java.util.*;
public class HeapInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Max heap add start
	ArrayList<Integer> a=new ArrayList<Integer>();
	a.add(20);a.add(15);a.add(16);a.add(9);a.add(10);a.add(11);a.add(12);a.add(3);	

	int size=a.size()-1;
	Heap obj=new Heap();
	//obj.insert(a, 200,size);
	//Max heap add end
	
	//Min heap add start	
	ArrayList<Integer> b=new ArrayList<Integer>();
	b.add(2);b.add(4);b.add(6);b.add(8);b.add(10);b.add(12);b.add(16);b.add(3);	
	int sizeb=b.size()-1;
	Heap objb=new Heap();
	//objb.insert(b, 3,sizeb);
	//Min heap add end
	
	//delete root min heap start
	int min[]=new int[b.size()];
	int ctr=0;
	while(b.size()>1)
		{min[ctr++]=b.get(0);
		b.remove(0);
		b.add(0,(Integer)b.get(b.size()-1));//one time process of replacing root by last element
		b.remove(b.size()-1);
		Iterator<Integer> it=b.iterator();
		System.out.println("input");
		while(it.hasNext())
			System.out.print((Integer)it.next()+" ");
		System.out.println();
		objb.minHeapDelete(b, 0,1,2);
		it=b.iterator();
		System.out.println("output");
		while(it.hasNext())
			System.out.print((Integer)it.next()+" ");
		System.out.println();
		}
	System.out.println("after deleting");
	for(int i=0;i<min.length;i++)	
		System.out.print(min[i]+" ");
	//delete root min heap end
	
	
	
	
	//Delete root max heap start 
	/*Iterator<Integer> it=a.iterator();
	int max[]=new int[a.size()];
	int c=0;
	while(a.size()>1)//heap sort with max heap
		{max[c++]=(Integer)a.get(0);
		a.remove(0);
		a.add(0,(Integer)a.get(a.size()-1));//one time process of replacing root by last element
		a.remove(a.size()-1);		
		obj.maxHeapDelete(a, 0,1,2);		
		}
	for(int i=0;i<max.length;i++)	
		System.out.print(max[i]+" ");
	//delete root max heap end*/
	}	
}

class Heap{
	int parent;
	public void insert(ArrayList a,int val,int size){
		a.add(val);
		heapify(a,a.size());
		Iterator<Integer> it=a.iterator();
		while(it.hasNext())
			System.out.print((Integer)it.next()+" ");
	}
	public void shiftUp(ArrayList a,int par,int n){
		System.out.println("Parent-->"+par+" last-->"+n);
		if((Integer)a.get(n)>(Integer)a.get(par)){
			int temp=(Integer)a.get(n);
			a.remove(n);
			a.add(n,a.get(par));
			a.remove(par);
			a.add(par,temp);			
			n=par;
			if(par%2==0)
				par=par/2-1;
			else
				par=par/2;	
			if(par<0 )
			{
				par=0;
			}
			if(n<0){n=0;}
			shiftUp(a,par,n);
		}
	}	//for max heap
	public void shiftDown(ArrayList a,int par,int n){
		System.out.println("Parent-->"+par+" last-->"+n);
		if((Integer)a.get(n)<(Integer)a.get(par)){
			int temp=(Integer)a.get(n);
			a.remove(n);
			a.add(n,a.get(par));
			a.remove(par);
			a.add(par,temp);			
			n=par;
			if(par%2==0)
				par=par/2-1;
			else
				par=par/2;	
			if(par<0 )
			{
				par=0;
			}
			if(n<0){n=0;}
			shiftDown(a,par,n);
		}
	}	//for min heap
	
	public void maxHeapDelete(ArrayList a,int target,int left,int right){ //always delete root		
		int temp=(Integer)a.get(target);
		int lr;
		if(left<=a.size()-2 && right<=a.size()-1){
		if(((Integer)a.get(target)<(Integer)a.get(left) || (Integer)a.get(target)<(Integer)a.get(right))){
		if((Integer)a.get(left)>(Integer)a.get(right)){
			lr=(Integer)a.get(left);
			a.remove(target);
			a.add(target,lr);			
			a.remove(left);
			a.add(left,temp);			
			target=left;			
		}
		else{
			lr=(Integer)a.get(right);
			a.remove(target);			
			a.add(target,lr);										
			a.remove(right);			
			a.add(right,temp);					
			target=right;			
		}				
			left=2*target+1;
			right=2*target+2;
			maxHeapDelete(a,target,left,right);
			}
		}		
	}
	public void minHeapDelete(ArrayList a,int target,int left,int right){ //always delete root		
		int temp=(Integer)a.get(target);
		int lr;
		if(left<=a.size()-2 && right<=a.size()-1){
		if(((Integer)a.get(target)>(Integer)a.get(left) || (Integer)a.get(target)>(Integer)a.get(right))){
		if((Integer)a.get(left)<(Integer)a.get(right)){
			lr=(Integer)a.get(left);
			a.remove(target);
			a.add(target,lr);			
			a.remove(left);
			a.add(left,temp);	
			System.out.println("Target-->"+target+" Left-->"+left);
			target=left;			
		}
		else{
			lr=(Integer)a.get(right);
			a.remove(target);			
			a.add(target,lr);										
			a.remove(right);			
			a.add(right,temp);
			System.out.println("Target-->"+target+" Left-->"+right);
			target=right;			
		}				
			left=2*target+1;
			right=2*target+2;
			Iterator<Integer> it=a.iterator();
			System.out.println("Inside");
			while(it.hasNext())
				System.out.print((Integer)it.next()+" ");
			System.out.println();
			minHeapDelete(a,target,left,right);
			}
		}		
	}
	public void heapify(ArrayList<Integer> a,int size){			
		parent=size/2-1;
		int last=size-1;
		shiftUp(a,parent,last);
		//shiftDown(a,parent,last);
	}
}
