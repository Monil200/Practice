
public class Pattern {
public static void main(String args[])
	{int limit=19;
	int count=limit/2;
	for (int i=0;i<limit;i++)
		{
		//System.out.println(i+" "+i%((limit/2)+1));
		if (i<=(i%(limit/2)+1))
			{for (int j=0;j<=i;j++)
				System.out.print("*");						
			}
		else if(i==((limit/2)))
			{for (int j=0;j<((limit/2)+1);j++)
				System.out.print("*");
			
			}
		else
			{for(int j=0;j<(count);j++)			
				{System.out.print("*");			
				}
			count--;
			}
		
		System.out.println();
		
		}
	}
}
