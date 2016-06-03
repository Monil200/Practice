
public class Remember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[];
		String s="monil";
		b=s.getBytes();
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);
		int arr_bin[]={1,0,0,1};
		StringBuffer temp=new StringBuffer();
		for(int i=0;i<arr_bin.length;i++)
			{temp.append(arr_bin[i]+"");			
			}
		int bin=Integer.parseInt(temp.toString(),2); //2 is base of input 
		System.out.println(bin);
		Integer y=999;
		s=y.toString();
		System.out.println(s+" "+s.length());
		s="s";
		
		System.out.println();
		System.out.println(Integer.toBinaryString(343));
		System.out.println(Integer.toString(343,16)+"hex");
		int a[][]={{0,1,1,1},{1,1,1,1},{0,0,0,1}};
		System.out.println(a[0].length);//col count
		System.out.println(a.length);//row count
		System.out.println(Integer.parseInt("1111",2)+"mii");
		System.out.println("--------");
		int m=10;
		String m1=m+"";
		System.out.println(m1.length()+" "+m1);
		System.out.println(Integer.parseInt("342"));
		System.out.println(Math.sqrt(5));
		System.out.println((int)Math.ceil(Math.sqrt(5)));
		System.out.println("============");
		byte ay=127;
		byte az=1;
		byte aw=(byte)(ay ^ az);
		System.out.println(aw);
		//System.out.println(Integer.parseInt(String.valueOf(Math.ceil(Math.sqrt(5)))));			
	}

}
