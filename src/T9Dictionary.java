import java.util.HashMap;
import java.util.Map;


public class T9Dictionary {
	static Map<Integer,String> keypad=new HashMap<Integer,String>();	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		keypad.put(0, "");
		keypad.put(1, "");
		keypad.put(2, "abc");
		keypad.put(3, "def");
		keypad.put(4, "ghi");
		keypad.put(5, "jkl");
		keypad.put(6, "mno");
		keypad.put(7, "pqrs");
		keypad.put(8, "tuv");
		keypad.put(9, "wxyz");
		int keys[]={2,3,4};
		String[] output=new String[keys.length];
		t9Dictionary(output,keys,0);

	}
	static void t9Dictionary(String output[],int k[],int currentDigit) {
		//System.out.println((keypad.get(k[currentDigit])).charAt(0)+"");
		//System.out.println(output[0]+output[1]+output[2]+" CurrDigit->"+currentDigit);
		if(currentDigit==k.length) {
			System.out.println(output[0]+output[1]+output[2]);
			return;			
			}
		else {
			for(int i=0;i<keypad.get(k[currentDigit]).length();i++) {
				output[currentDigit]=(keypad.get(k[currentDigit])).charAt(i)+"";				
				t9Dictionary(output,k,currentDigit+1);
//				if(k[currentDigit]==1 || k[currentDigit]==0)
//					return; //this takes program into infinite loop for some reason
				
			}
		}
	}

}
