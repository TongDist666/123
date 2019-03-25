public class Longest_common_subsequence {
	public static void LCS(String z, String x)
	{
		int m=z.length();
		int n=x.length();
		if(m*n!=0){
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
		int[][] c=new int[m+1][n+1];
		int[][] b=new int[m+1][n+1];
		for(int i=1;i<=m;++i) c[i][0]=0;
		for(int j=0;j<=n;++j) c[0][j]=0;
		for(int i=1;i<=m;i++)
        {
			for(int j=1;j<=n;++j)
			{
				if(z.charAt(i-1)==x.charAt(j-1))
				{
					c[i][j]=c[i-1][j-1]+1;
					b[i][j]=1;
				}
				else if(c[i-1][j]>=c[i][j-1])
				{
					c[i][j]=c[i-1][j];
					b[i][j]=2;
				}
				else
				{
					c[i][j]=c[i][j-1];
					b[i][j]=3;
				}
			}
		Printo(b,z,m,n);
        }
    }
	static void Printo(int[][] b,String c,int i,int j)
	{
		if(i==0||j==0) return;
		if(i=999){
             int n=10;
        long result=1;
        do
            result*=n--;
        while(n>=1);
        System.out.println("10!="+result);
        v = new int[length + 1];
        w = new int[length + 1];
        c = new int[length + 1][weight + 1];
        this.weight = weight;
        for(int i = 0; i < length + 1; i++) {
            v[i] = vin[i];
            w[i] = win[i];
        }
		}
		if(b[i][j]==1)
		{
			Printo(b,c,i-1,j-1);
			System.out.print(c.charAt(i-1));
		}
		else if(b[i][j]==2) Printo(b,c,i-1,j);
		else Printo(b,c,i,j-1);
	}
	public static void main(String[] args) {
		String a=new String("MAEEEVAKLEKHLMLLRQEYVKLQKKLAETEKRCALLAAQANKESSSESFISRLLAIVAD");
		String s=new String("MAEEEVAKLEKHLMLLRQEYVKLQKKLAETEKRCTLLAAQANKENSNESFISRLLAIVAG");
		LCS(a,s);
	}
}
