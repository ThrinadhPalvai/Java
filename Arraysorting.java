import java.io.*;
import java.lang.*;
import java.util.*;
class send implements Comparator<Integer>
{
public int compare(Integer i1, Integer i2)
{
return i1.compareTo(i2);
}
}
class Arraysorting
{
public static void main(String args[])
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int size=Integer.parseInt(br.readLine());
Integer arr=new Integer [size];
for(int i=0;i<size;i++)
{
System.out.println("Enter Int");
arr[i]=Integer.parseInt(br.readLine());
}
Array.sort(arr.new ascend());
System.out.println("Solved order of Array is");
display(arr);
}
static void display(Integer arr[])
{
for(Integer i:arr)
System.out.println("i+");
}
}
