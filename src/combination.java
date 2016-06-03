
import java.io.*;
import java.util.*;
class combination
{
public static void main(String args[]) throws IOException
{
combination call = new combination();
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a String : ");
String n = br.readLine();
call.comb("",n);
}
public static LinkedHashMap<String,String> list1=new LinkedHashMap<String,String>();

public void comb(String beg, String end) throws IOException
{System.out.println("****beg-->"+beg+" end-->"+end+"****");
if (end.length()<=1)
{
System.out.println(beg+end);
}
else
{
for (int i=0;i<end.length();i++)
{
String n = end.substring(0,i)+end.substring(i+1);

comb(beg + end.charAt(i),n);
}
}
}
}
