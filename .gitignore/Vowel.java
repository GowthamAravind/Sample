import java.util.Scanner;

public class F {
static char temp;
	public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			String a=in.nextLine();
			char v[]=a.toCharArray();
			/*for(int i=v.length-1;i>=0;i--)
			{
				System.out.print(v[i]);
			}*/
			for(int i=0;i<v.length;i++)
			{
				if(v[i]=='a'||v[i]=='e'||v[i]=='i'||v[i]=='o'||v[i]=='u' || v[i]=='A'||v[i]=='E'||v[i]=='I'||v[i]=='O'||v[i]=='U')
				{
					v[i]='$';
				}
			}
			/*for(int i=v.length-1;i>=0;i--)
			{
				System.out.print(v[i]);
			}*/
			for(int i=v.length-1;i>=0;i--)
			{
				if(v[i]!='$')
				{
					System.out.print(v[i]);
				}
			}
			
			
		    


	}

}
