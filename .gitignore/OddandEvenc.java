public class F {
static char temp;
	public static void main(String[] args) {
			String a="aabc";
			int j=1;
			char v[]=a.toCharArray();
			for(int i=0;i<v.length;i+=2)
			{
					temp=v[i];
					v[i]=v[j];
					v[j]=temp;
					j=j+2;
			}
			for(int i=0;i<v.length;i++)
			{
				System.out.print(v[i]);
			}
		    


	}

}
