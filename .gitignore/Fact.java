import java.util.*;
class Fact
{
  Scanner in=new Scanner(System.in);
  int n=in.nextInt();
  int a[]=new int[n];
  int v,f=1;
  for(int i=0;i<n;i++)
  {
    v=in.nextInt();
    a[i]=v;
  }
  for(int i=0;i<n;i++)
  {
    f=a[i]*f;
  }
  System.out.println(f);
    
