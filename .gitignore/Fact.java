import java.util.*;
class Fact
{
  Scanner in=new Scanner(System.in);
  int n=in.nextInt();
  int v,f=1;
  int a[]=new int[n];
  for(int i=0;i<n;i++)
  {
    v=in.nextInt();
    a[i]=v;
  }
  for(int i=0;i<n;i++)
  {
    f=a[i]*f;
  }
    
