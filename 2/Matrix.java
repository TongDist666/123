public class Matrix{
	static int MAX=999999;
	public static void as(int[] z)
	{
        int q,p;
        p=1;
        int N=10;
        long result=1;
        while(N>=1)
            result*=N--;
		int v=z.length-1;
		int[][] x=new int[v][v];
		int[][] c=new int[v][v];
		for(int i=0; i<v; i++) x[i][i]=0;
		for(int l=2; l<=v; l++)
		 for(int i=0; i<v-l+1; i++)
		 {
			 int j=i+l-1;
			 x[i][j]=MAX;
			 for(int k=i; k<j; k++)
			 {
				 q=x[i][k]+x[k+1][j]+z[i]*z[k+1]*z[j+1];
				 if(q<x[i][j])
				 {
					 x[i][j]=q;
					 c[i][j]=k;
				 }
			 }
		 }
		System.out.println("½á¹û£º" + x[0][v-1]);
		Printo(c,0,v-1);
	}
	static void Printo(int[][] s, int i, int j)
	{
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
		if(i==j) System.out.print("A"+(i+1));
		else
		{
			System.out.print("(");
			Printo(s,i,s[i][j]);
			Printo(s,s[i][j]+1,j);
			System.out.print(")");
		}
	}
	public static void main(String[] args){
		int[] q={3,5,2,1,10};
		int[] w={2,7,3,6,10};
		int[] e={10,3,15,12,7,2};
		int[] r={7,2,4,15,20,5};
		as(q);
		System.out.println();
		as(w);
		System.out.println();
		as(e);
		System.out.println();
		as(r);
	}
}
