import java.util.*;
class Nre
{
Scanner in=new Scanner(System.in)
int n=in.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
int v=in.nextInt();
a[i]=v;
}
for(int i=a.length;i>=0;i--)
{
System.out.println(a[i]);
}
