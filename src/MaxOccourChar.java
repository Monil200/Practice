import java.util.*;
public class MaxOccourChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="geeksforgeeks";
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(56);
		al.add(57);
		al.add(58);
		HashMap<Character,ArrayList> hm=new HashMap<Character,ArrayList>();
		hm.put('m',al);
		System.out.println(hm.get('m'));
		int chars[]=new int[256];
		for(int i=0;i<256;i++)
				chars[i]=0;
		for(int i=0;i<a.length();i++)
			chars[(int)a.charAt(i)]+=1;
		int max=0;
		for(int i=0;i<256;i++)
			{if(chars[i]>max)
				max=i;			
			}
		System.out.println("Max repeating char is"+(char)max);
	}

}

