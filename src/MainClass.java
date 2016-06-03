import java.util.*;
class MainClass{
public static void main(String args[]){
String s1="dog";
String s2="god";
Boolean b1=true;
HashMap<String,Integer> hm=new HashMap<String,Integer>();
for(int i=0;i<s1.length();i++){
    if(hm.put(s1.charAt(i)+"",1)==null)
        {hm.put(s1.charAt(i)+"",1);        
        }
    else
        {hm.put(s1.charAt(i)+"",hm.get(s1.charAt(i)+"")+1);
        } 
    
}//adding counts of each character from s1 into HM
for(int i=0;i<s2.length();i++){    
        if(hm.get(s2.charAt(i)+"")==null){
        System.out.println("The given strings are not anagrams of each other");
        b1=false;
        }
        else
        {//System.out.println(hm.get(s2.charAt(i)+"")+" minus loop before "+s2.charAt(i));
        hm.put(s2.charAt(i)+"",hm.get(s2.charAt(i)+"")-1);
        //System.out.println(hm.get(s2.charAt(i)+"")+" minus loop after "+s2.charAt(i));
        }            
}

Set <Map.Entry<String,Integer>> s=hm.entrySet();
for(Map.Entry<String,Integer> i:s){
    if(i.getValue()!=0)
        {
    	System.out.println("The given strings are not anagrams of each othersssss");
        b1=false;
        break;
        }
}

if(b1)
    System.out.println("The given are anagrams!!Success");

}
}
