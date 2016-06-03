
public class BSTFirstLastOccour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{0,1,1,1},{1,1,1,1},{0,0,0,1}};
		//int a[]={1,1,1,1};
		int b[]=new int[a[0].length];
		int count[]=new int[a.length];;
		//System.out.println(a[0].length);//col
		//System.out.println(a.length);//row
		BST obj=new BST();
		for(int i=0;i<a.length;i++)
			{for(int j=0;j<a[0].length;j++)
				{b[j]=a[i][j];				
				}
			System.out.println("called"+i);
			System.out.println("fist occourance is array "+i+" "+obj.bsTree(b,1,0,a[0].length-1));
			System.out.println("last occourance is array "+i+" "+obj.bsTreeLast(b,1,0,a[0].length-1));
			//System.out.println(count[i]);
			}
		
		//System.out.println(obj.bsTree(b,1));
		
	}
	
	
	
}
class BST
{int bsTree(int a[],int req,int start,int end)
	{int mid;
	mid=(start+end)/2;
	while(end>=start)
		{		
		{if((mid==0 || a[mid-1]<req) && a[mid]==req) // first occurrence
			return mid;
		else if(a[mid]>req)
			{end=mid-1;						
			return bsTree(a,req,start,end);
			}
		else if(req>a[mid])
			{start=mid+1;
			return bsTree(a,req,start,end);
			}
		else
			mid--;
		}
		}
	return 0;
	}
	


//================
int bsTreeLast(int a[],int req,int start,int end)
{int mid;
mid=(start+end)/2;
while(end>=start)
	{		
	if((mid==a.length-1 || a[mid+1]>req) && a[mid]==req) // last occurrence
		return mid;
	else if(a[mid]>req)
		{end=mid-1;						
		return bsTree(a,req,start,end);
		}
	else if(req>a[mid])
		{start=mid+1;
		return bsTree(a,req,start,end);
		}
	else
		mid++;	
	}
return 0;
}
	}
