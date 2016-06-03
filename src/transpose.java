
public class transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{1,2,3,90},{4,5,6,91},{7,8,9,92},{10,11,12,13}};
		int temp=0;
		for(int i=0;i<4;i++)
		{for(int j=0;j<4;j++)
			{System.out.print(a[i][j]+" ");		
			}
		System.out.println();
		}		
		System.out.println("==========");
		for(int i=0;i<4;i++)			
			{for(int j=0;j<4;j++)			
				{if(i==j)
					break;
				else
					{temp=a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=temp;					
					}				
				}
			}				
				
			
			
		for(int i=0;i<4;i++)
		{for(int j=0;j<4;j++)
			{System.out.print(a[i][j]+" ");		
			}
		System.out.println();
		}//BINDO 
			
		}

	}


