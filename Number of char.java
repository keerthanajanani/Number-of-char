# Number-of-char
import java.io.*;
import java.util.*;
public class Number of char java
{
int n,i;
int countchar=0;
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the input:");
n=Integer.parseInt(br.readLine());
n=line.length();
for(i=0;i<line.length();i++)
{
if(line.charAt(i)!=' ' && line.charAt(i)!='\n')
countchar++;
}
System.out.println("Count Number of character is : "+countchar);
}
}
