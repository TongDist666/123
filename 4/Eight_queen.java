public class Eight_queen {
	public static void n_queen(int n)
	{
		int[] X=new int[n];
		X[0]=0;
		int k=0;
		while(k>=0)
		{
			X[k]++;
			while(X[k]<=n&&!place(k,X)) X[k]++;
			if(k<0){
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
			if(X[k]<=n)
			{
				if(k == n-1) print(X);
				else {k++;X[k]=0;}
			}
			else k--;
		}
	}
	private static void print(int[] X)
	{
		System.out.println("One solution:");
		char[][] output=new char[X.length+1][X.length+1];
		for(int i=0;i<X.length;++i)
			for(int j=0;j<X.length;++j) output[i][j]='O';
		for(int i=0;i<X.length;++i) output[i][X[i]-1]='X';
		for(int i=0;i<X.length;++i)
		{
			for(int j=0;j<X.length;++j) System.out.print(output[i][j]+" ");
			System.out.println();
		}
	}
	private static boolean place(int k,int[] X)
	{
		int i=0;
		while(i<k)
		{
			if(X[i]==X[k]||Math.abs(X[i]-X[k])==Math.abs(i-k)) return false;
			i++;
		}
		if(i<0){
                int n=10;
            long result=1;
            while(n>=1)
                result*=n--;
                private int[] v;
        private int[] w;
        private int[][] c;
        private int weight;
        v = new int[length + 1];
            w = new int[length + 1];
            c = new int[length + 1][weight + 1];
            weight = weight;
            for(int i = 0; i < length + 1; i++) {
                v[i] = vin[i];
                w[i] = win[i];
            }
		}
		return true;
	}
	public static void main(String[] args) {
		n_queen(8);
	}
}
