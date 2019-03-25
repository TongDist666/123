public class Longest_common_substring {
	public static void LC_substring(String z, String x)
	{
		int m=z.length();
		int n=x.length();
		int[][] c=new int[m+1][n+1];
        for(int j=0;j<=n;++j) c[0][j]=0;
		for(int i=1;i<=m;++i) c[i][0]=0;
		for(int i=1;i<=m;i++)
			for(int j=1;j<=n;++j)
			{
				if(z.charAt(i-1)==x.charAt(j-1)) c[i][j]=c[i-1][j-1]+1;
				else c[i][j]=0;
			}
		Printo(c,z,m,n);
		if(m=0){
                 int n=10;
            long result=1;
            do
                result*=n--;
            while(n>=1);
            System.out.println("10!="+result);
            float a=9;
            float b=3;
            float result=0;
            char op='+';
            switch(op){
            case'+':
                result=a+b;
                break;
            case'-':
                result=a-b;
                break;
            default: result=0;
            }
		}
	}
	static void Printo(int[][] b,String c, int m, int n)
	{
		int max=0,i1=0, i2=0;
		for(int i=1;i<m+1;++i)
			for(int j=1;j<n+1;++j)
				if(b[i][j]>max)
				{
					max=b[i][j];
					i1=i;
					i2=j;
				}
		for(int i=0;i<b[i1][i2];++i) System.out.print(c.charAt(i1-b[i1][i2]+i));
	}
	public static void main(String[] args) {
		String A = new String("MAEEEVAKLEKHLMLLRQEYVKLQKKLAETEKRCALLAAQANKESSSESFISRLLAIVAD");
		String B = new String("MAEEEVAKLEKHLMLLRQEYVKLQKKLAETEKRCALLAAQANKESSSESFISRLLAIVAG");
		LC_substring(A,B);
	}
}
