
public class QueueUsingStacks {
	static Stack s1=new Stack();
    static Stack s2=new Stack();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hi");
		enQueue(1);
		enQueue(2);
		s1.printStack(s1);
		System.out.println("removed from Q-->"+deQueue());
		s2.printStack(s2);
		enQueue(3);
		enQueue(4);
		s1.printStack(s1);
		System.out.println("removed from Q-->"+deQueue());
		s1.printStack(s1);
		System.out.println("removed from Q-->"+deQueue());
		s1.printStack(s2);
		
		
	}
	
	static void enQueue(int data){
		if((s1.top+s2.top)==3){
			System.out.println("Queue full");
			return;
		}
		//s1.a[++s1.top]=data;
		s1.push(s1, data);
		//System.out.println("Pushed"+data);
	}
	static int deQueue(){
		if(s2.top==-1 && s1.top==-1){
		System.out.println("Q empty");
		return -1;		
		}
		if(s2.top==-1 && s1.top>=0){
			while(s1.top!=-1){
				s2.push(s2, s1.pop(s1));
			}
		}
		return s2.pop(s2);
	}
}

class Stack{
	int top;
	Integer a[]=new Integer[5];
	Stack(){
		top=-1;
	}
	boolean isEmpty(Stack s){
		if(s.top==-1)
			return true;
		else
			return false;
	}
	void push(Stack s,int data){
		if(s.top==4)
			{System.out.println("stack overflow");
			return;
			}
		s.top+=1;
		s.a[s.top]=data;
	}
	int pop(Stack s){
		if(s.top==-1)
			{System.out.println("Stack underflow");
			return 0;
			}
		s.top-=1;
		return s.a[s.top+1];
	}
	void printStack(Stack s){
		for(int i=0;i<=s.top;i++)
			System.out.print(s.a[i]+" ");
		System.out.println();
	}
	
	
}

