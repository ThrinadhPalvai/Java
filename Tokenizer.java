import java.util.StringTokenizer;
public class Tokenizer
{
public static void main(String args[])
{
String sentence="This is a sentence to be Tokenized";
StringTokenizer st=new StringTokenizer(sentence);
System.out.println("The Tokenized sentence is:");
while (st.hasMoreTokens())
{
System.out.println(st.nextToken());
}
}
} 