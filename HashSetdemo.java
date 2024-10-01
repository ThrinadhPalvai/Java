import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
class HashSetDemo
{
public static void main(String args[])
{
HashSet<String>hs=new HashSet<String>();
hs.add("India");
hs.add("Canada");
hs.add("America");
hs.add("Canada");
System.out.println("HashSet"+hs);
{
Iterator<String> itr=hs.iterator();
System.out.println("Elements Using Iterator");
while(itr.hasNext())
{
String S=(String)itr.next();
System.out.println(S);
}}}}