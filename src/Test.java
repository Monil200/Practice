import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Test {	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub		
		Scanner sc = new Scanner(System.in);
		int tc=0;
		int count=0;
		List<Integer> seasonNumber=new ArrayList<Integer>();
		String input="";
//		while(sc.hasNextLine()) {
//			input=sc.nextLine();
//			if(input.equals("q"))
//				break;
//			if(count==0)
//				tc = Integer.parseInt(input);
//			else
//				seasonNumber.add(Integer.parseInt(input));
//			count++;
//		  //parse inputLine however you want, and add to your vector
//		}
		//System.out.println(tc+" "+seasonNumber.size());				
		
				
	Queue<Integer> q=new PriorityQueue<Integer>();
	q.add(5);
	q.add(6);
	q.add(7);
	System.out.println(q.poll()+""+q.peek());
	Runtime r=Runtime.getRuntime();
	System.out.println("Free:"+r.freeMemory()+" Used:"+r.totalMemory());
	}		
}
