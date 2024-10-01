import java.util.StringTokenizer;
public class StringTokenizer1
{
public static void main(String args[])
{
StringTokenizer st=new StringTokenizer("This is a sentence to be tokenized","");
while (st.hasMoreTokens())
{
System.out.println(st.nextToken());
}
}
} 