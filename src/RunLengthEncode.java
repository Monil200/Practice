
public class RunLengthEncode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="mmoonillll";
		String n="";
		int counter=1;
		int clength=0;
		int c=0;
		int j;
		boolean b=false;
		for(int i=0;i<a.length()-1;i++)
		{j=i;
		counter=1;
		n+=a.charAt(j)+"";
		System.out.println("-->"+n);
		System.out.println("j-->"+j);
		while(j<(a.length()-1) &&  (a.charAt(j)+"").equals(a.charAt(j+1)+"")){							
				counter++;					
				j++;
			}				
		if(a.length()-1==j)
			b=true;
		c=counter;
		System.out.println("c-->"+c);
		if(c>=2)
			n+=Integer.toString(c);		
		i=j;
		}
	
		if(!b)
			n+=a.charAt(a.length()-1)+"";
		System.out.println(n);
	}

}
