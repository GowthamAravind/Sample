import java.util.*;
class Nre
{
Scanner in=new Scanner(System.in)
int n=in.nextInt();
int h;
  int re=0;
  int sum=0;
  h=n;
  while(n!=0)
  {
    re=n%10;
    sum=sum*10+re;
    n/=10;
  }
  System.out.println(sum)
