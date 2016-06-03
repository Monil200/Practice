
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Determine the sum of all prime numbers less than an input number (the input number will be at most 10,000,000). 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int num=0;
		BigInteger sum=new BigInteger("0");
		Boolean prime=false;
		try{
			num=Integer.parseInt(br.readLine());
		}
		catch(Exception e){
			System.out.println("Invalid Number");
		}
		if(num>10000000){
			System.out.println("Number exceeding limit");
		}
		else if(num==0){
			System.out.println("Result:0");
		}
		else if(num==1){
			System.out.println("Result:1");
		}
		else if(num==2){
			System.out.println("Result:3");
		}
		else if(num==3){
			System.out.println("Result:6");
		}
		else{
			for(int i=4;i<=num;i++)
			{//System.out.print(i+"-->"+(int)Math.floor(Math.sqrt(i))+"-->");
				for(int j=2;j<=(int)Math.floor(Math.sqrt(i));j++)
				{//System.out.print(j+" ");
					if(i%j==0)
					{
						prime=true;
						break;
					}
				}
				if(prime==false){
					System.out.println(i+" ");
					sum=sum.add(BigInteger.valueOf(i));
				}
				prime=false;
				//System.out.println();
			}
			
			sum=sum.add(BigInteger.valueOf(6));
			System.out.println();
			System.out.println("Result:"+sum);
		}
		
	}

}
