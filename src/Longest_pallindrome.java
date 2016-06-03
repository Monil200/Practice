	
public class Longest_pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="asdsdfmadamgdrfaaaabaaaa";
		int lindex=0;
		int rindex=0;
		int length;
		int start;
		Boolean b=false;
		int oddl=0;
		for(int i=1;i<a.length();i++)
			{lindex=i-1;
			rindex=i+1;
			while(lindex>=0 && rindex<a.length())
				{if(a.charAt(lindex)==a.charAt(rindex))
					{start=lindex;
					length=rindex;
					lindex--;
					rindex++;
					b=true;
					}
				else
					{
					break;
					}								
				}
			if(b && i==0)
				oddl=rindex-lindex;
			else if(b && oddl<(rindex-lindex))
				oddl=rindex-lindex;
			
			}
		System.out.println(oddl-1);	
		
	}

}

