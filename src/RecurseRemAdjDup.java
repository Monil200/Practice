
public class RecurseRemAdjDup {
public static  void dupRemove(String a)
	{//System.out.println(a);
	int lindex,rindex,terminate;
	Boolean b=false;	
	for(int i=1;i<a.length()-1;i++)
		{lindex=i-1;
		rindex=i+1;			
		while(lindex>=0 && rindex<a.length() && (a.charAt(lindex)==a.charAt(i) ||a.charAt(rindex)==a.charAt(i)))
			{if(a.charAt(lindex)==a.charAt(i))				
				lindex--;
			if(a.charAt(rindex)==a.charAt(i))
				rindex++;
			b=true;
			}
		
		System.out.println("char-->"+a.charAt(i)+" left "+lindex+" right "+rindex);
		if(b==false)
			{System.out.println(a+"--loop");
			
			break;			
			}
		else
			{System.out.println(a.substring(lindex+1,rindex));
			a=a.replace(a.substring(lindex+1,rindex),"");
			lindex=0;rindex=0;	
			b=false;
			dupRemove(a);
			}
		}
	
	
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="mmmmmoonil";
		dupRemove(a);
	}

}
