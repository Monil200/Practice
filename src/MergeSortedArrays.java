import java.util.*;
public class MergeSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> k1=new ArrayList<Integer>();
		List<Integer> k2=new ArrayList<Integer>();
		List<Integer> k3=new ArrayList<Integer>();
		List<Integer> k4=new ArrayList<Integer>();
		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int i=0,j=0,k=0,l=0;
		Queue<Integer> heap=new PriorityQueue<Integer>();
		k1.add(1);k1.add(10);k1.add(1123);k1.add(1345);
		k2.add(3);k2.add(50);k2.add(111);k2.add(1145);k2.add(1234);
		k3.add(5);k3.add(10);k3.add(113);
		k4.add(7);k4.add(110);k4.add(1193);k4.add(1300);k4.add(1301);
		Set<Map.Entry<Integer,Integer>> heapIterator;
		int minHeap;
		int nextIndex=0;		
		while(k1.size()>i || k2.size()>j || k3.size()>k || k4.size()>l) {
			if((nextIndex==1 || nextIndex==0)  && i<k1.size()) {
				heap.add(k1.get(i));
				hm.put(1, k1.get(i++));
			}
			if((nextIndex==2 || nextIndex==0) && j<k2.size()) {
				heap.add(k2.get(j));
				hm.put(2, k2.get(j++));
			}
			if((nextIndex==3 || nextIndex==0) && k<k3.size()) {
				heap.add(k3.get(k));
				hm.put(3, k3.get(k++));
			}
			if((nextIndex==4 || nextIndex==0) && l<k4.size()) {
				heap.add(k4.get(l)); //put into heap
				hm.put(4, k4.get(l++));
			}										
			minHeap=heap.poll();		
			System.out.print(minHeap+" "); //find min
			//next task is to insert next element of the array from which min was selected...
			heapIterator=hm.entrySet();			
			for(Map.Entry<Integer,Integer> it:heapIterator) {
				if(it.getValue()==minHeap) {
					nextIndex=it.getKey();
					break;
				}
			}			
		}
	}

}

class ElementNode{
int arrayNum,data;
	ElementNode() {		
	}
	
}

































































//import java.util.*;
//public class MergeSortedArrays {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		List<Integer> k1=new ArrayList<Integer>();
//		List<Integer> k2=new ArrayList<Integer>();
//		List<Integer> k3=new ArrayList<Integer>();
//		List<Integer> k4=new ArrayList<Integer>();
//		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
//		int i=0,j=0,k=0,l=0;
//		Queue<Integer> heap=new PriorityQueue<Integer>();
//		k1.add(1);k1.add(10);k1.add(1123);k1.add(1345);
//		k2.add(3);k2.add(50);k2.add(111);k2.add(1145);k2.add(1234);
//		k3.add(5);k3.add(10);k3.add(113);
//		k4.add(7);k4.add(110);k4.add(1193);k4.add(1300);k4.add(1301);
//		Set<Map.Entry<Integer,Integer>> heapIterator;
//		int minHeap;
//		int nextIndex=0;		
//		while(k1.size()>i || k2.size()>j || k3.size()>k || k4.size()>l) {
//			if((nextIndex==1 || nextIndex==0)  && i<k1.size()) {
//				heap.add(k1.get(i));
//				hm.put(1, k1.get(i++));
//			}
//			if((nextIndex==2 || nextIndex==0) && j<k2.size()) {
//				heap.add(k2.get(j));
//				hm.put(2, k2.get(j++));
//			}
//			if((nextIndex==3 || nextIndex==0) && k<k3.size()) {
//				heap.add(k3.get(k));
//				hm.put(3, k3.get(k++));
//			}
//			if((nextIndex==4 || nextIndex==0) && l<k4.size()) {
//				heap.add(k4.get(l)); //put into heap
//				hm.put(4, k4.get(l++));
//			}										
//			minHeap=heap.poll();
//			System.out.print(minHeap+" "); //find min
//			//next task is to insert next element of the array from which min was selected...
//			heapIterator=hm.entrySet();			
//			for(Map.Entry<Integer,Integer> it:heapIterator) {
//				if(it.getValue()==minHeap) {
//					nextIndex=it.getKey();
//					break;
//				}
//			}			
//		}
//	}
//
//}
